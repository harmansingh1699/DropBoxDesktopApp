/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.controller;

import com.dropbox.animations.InvokeAnimation;
import com.dropbox.binding.LoginSceneBinding;
import com.dropbox.util.CommonValidations;
import com.dropbox.util.ExecuteCheck;
import com.dropbox.webservice.contracts.useroperations.DropBoxLoginRequest;
import com.dropbox.webservice.contracts.useroperations.DropBoxLoginResponse;
import com.dropbox.webservice.useroperations.UserOperationsService_Service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
public class LoginSceneFXMLController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;

    @FXML
    TextField emailAddress;

    @FXML
    TextField password;

    private LoginSceneBinding binding;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new LoginSceneBinding();
        Bindings.bindBidirectional(emailAddress.textProperty(), binding.emailAddressProperty());
        Bindings.bindBidirectional(password.textProperty(), binding.passwordProperty());
    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void submitAction() {
        if (!CommonValidations.isValidEmailAddress(binding.getEmailAddress())) {
            InvokeAnimation.attentionSeekerWobble(emailAddress);
            emailAddress.setPromptText("Please enter a valid emailAddress");
        } else if (CommonValidations.isValidEmailAddress(binding.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(password);
            password.setPromptText("Please enter the password");
        } else {
            Task task = new Task<Void>() {
                @Override
                public Void call() {

                    DropBoxLoginRequest request = new DropBoxLoginRequest();
                    request.setPassword(binding.getPassword());
                    request.setUserName(binding.getEmailAddress());
                    UserOperationsService_Service servicePort = new UserOperationsService_Service();
                    DropBoxLoginResponse response = null;
                    try {
                        response = servicePort.getUserOperationsPort().authenticateUser(request);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            BufferedWriter b = new BufferedWriter(new FileWriter(new File("userDetails.cloudSync")));
                            b.append(request.getUserName());
                            b.newLine();
                            b.append(request.getPassword());
                            b.close();
                            File file = new File("CloudSync");
                            if (!file.exists()) {
                                file.mkdir();
                            }
                            successMessage("Your are successfully logged in, auto sync will in background. Enjoy!");
                            screenPage.setScreen("shareFile");
                            begin();

                        } else {
                            errors(response.getErrorMessage());
                        }
                    } catch (com.dropbox.webservice.useroperations.Exception ex) {
                        ex.printStackTrace();
                        errors(ex.getMessage());
                    } catch (IOException ex) {
                        Logger.getLogger(LoginSceneFXMLController.class.getName()).log(Level.SEVERE, null, ex);
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

    public void begin() {
        Task task = new Task<Void>() {
            @Override
            public Void call() {
                new ExecuteCheck().start();
                return null;
            }
        };
        new Thread(task).start();

    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }

    @FXML
    public void moveToREgistration() {
        this.screenPage.setScreen("registration");
    }

}
