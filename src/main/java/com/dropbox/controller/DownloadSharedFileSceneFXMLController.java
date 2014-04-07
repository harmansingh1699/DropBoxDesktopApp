/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.controller;

import com.dropbox.animations.InvokeAnimation;
import com.dropbox.binding.DownloadSharedFileSceneBinding;
import com.dropbox.util.CommonValidations;
import com.dropbox.util.ExecuteCheck;
import com.dropbox.webservice.cloudoperations.CloudOperationsService_Service;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxDownloadResponse;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGenerateSharingKeyRequest;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGenerateSharingKeyResponse;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGetSharedFileRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialogs;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class DownloadSharedFileSceneFXMLController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;

    @FXML
    TextField key;

    DownloadSharedFileSceneBinding binding;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new DownloadSharedFileSceneBinding();
        Bindings.bindBidirectional(key.textProperty(), binding.keyProperty());

    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void downloadFile() {
        if (CommonValidations.isStringEmpty(binding.getKey())) {
            InvokeAnimation.attentionSeekerWobble(key);
            key.setPromptText("Please enter a valid emailAddress");
        } else {
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    DropBoxGetSharedFileRequest request = new DropBoxGetSharedFileRequest();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(new File("userDetails.cloudSync")));
                        String userName = reader.readLine();
                        String password = reader.readLine();
                        request.setUserName(userName);
                        request.setPassword(password);
                        reader.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    request.setKey(binding.getKey());

                    CloudOperationsService_Service servicePort = new CloudOperationsService_Service();
                    DropBoxDownloadResponse response
                            = servicePort.getCloudOperationsPort().getSharedFile(request);

                    if (!CommonValidations.isStringEmpty(response.getStatus()) && response.getStatus().equals("SUCCESS")) {
                        byte[] bfile = response.getFile();
                        if (bfile != null && bfile.length > 0) {
                            try {
                                FileOutputStream fileOuputStream
                                        = new FileOutputStream("CloudSync/" + response.getFileName());
                                fileOuputStream.write(bfile);
                                fileOuputStream.close();
                            } catch (IOException ex) {
                                Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        successMessage("Shared file is downloaded in the Cloud Share folder Enjoy!");

                    } else {
                        errors("Something went wrong");
                    }

                    return null;
                }
            };
            new Thread(task).start();
        }
    }

    public void successMessage(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showInformationDialog(null, message, "Success", "Success");
            }
        });
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }

    @FXML
    public void moveToShare() {
        this.screenPage.setScreen("shareFile");
    }

    @FXML
    public void signOut() {
        File file = new File("userDetails.cloudSync");
        file.delete();
        this.screenPage.setScreen("login");
    }

}
