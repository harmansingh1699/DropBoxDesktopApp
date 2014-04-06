/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.controller;

import com.dropbox.animations.InvokeAnimation;
import com.dropbox.binding.ShareFileSceneBinding;
import com.dropbox.util.CommonValidations;
import com.dropbox.webservice.cloudoperations.CloudOperationsService_Service;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGenerateSharingKeyRequest;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGenerateSharingKeyResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialogs;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class ShareFileSceneFXMLController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;

    @FXML
    TextField emailAddress;

    @FXML
    TextField filePath;

    private ShareFileSceneBinding binding;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new ShareFileSceneBinding();
        Bindings.bindBidirectional(filePath.textProperty(), binding.filePathProperty());
        Bindings.bindBidirectional(emailAddress.textProperty(), binding.emailAddressProperty());
    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void shareFile() {
        if (!CommonValidations.isValidEmailAddress(binding.getEmailAddress())) {
            InvokeAnimation.attentionSeekerWobble(emailAddress);
            emailAddress.setPromptText("Please enter a valid emailAddress");
        } else if (CommonValidations.isStringEmpty(binding.getFilePath())) {
            InvokeAnimation.attentionSeekerWobble(filePath);
            filePath.setPromptText("Please select a file");
        } else {
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    DropBoxGenerateSharingKeyRequest request = new DropBoxGenerateSharingKeyRequest();
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
                    request.setFileName(binding.getFilePath());
                    request.setSharedUserName(binding.getEmailAddress());
                    
                    CloudOperationsService_Service servicePort = new CloudOperationsService_Service();
                    DropBoxGenerateSharingKeyResponse response = 
                            servicePort.getCloudOperationsPort().getFileShareKey(request);
                    
                    if(CommonValidations.isStringEmpty(response.getKey())){
                        errors("Something went wrong");
                    }else{
                        successMessage("Please share this key "+response.getKey()+" with "+binding.getEmailAddress());
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
    public void moveToDownload() {
        this.screenPage.setScreen("downloadSharedFile");
    }

    @FXML
    public void browse() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Share File");
        File file = fileChooser.showOpenDialog(filePath.getScene().getWindow());
        if (file != null) {
            this.filePath.setText(file.getName());
        }
    }

    @FXML
    public void signOut() {
        File file = new File("userDetails.cloudSync");
        file.delete();
        this.screenPage.setScreen("login");
    }

}
