/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.controller;

import com.dropbox.animations.InvokeAnimation;
import com.dropbox.binding.RegistrationSceneBinding;
import com.dropbox.util.CommonValidations;
import com.dropbox.webservice.contracts.useroperations.DropBoxRegistrationRequest;
import com.dropbox.webservice.contracts.useroperations.DropBoxRegistrationResponse;
import com.dropbox.webservice.useroperations.UserOperationsService_Service;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class RegistrationSceneFXMLController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;
    private RegistrationSceneBinding binding;

    @FXML
    TextField emailAddress;
    @FXML
    TextField password;
    @FXML
    TextField reEnterPassword;
    @FXML
    TextField alternateEmailAddress;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new RegistrationSceneBinding();
        Bindings.bindBidirectional(alternateEmailAddress.textProperty(), binding.alternateEmailAddressProperty());
        Bindings.bindBidirectional(emailAddress.textProperty(), binding.emailAddressProperty());
        Bindings.bindBidirectional(password.textProperty(), binding.passwordProperty());
        Bindings.bindBidirectional(reEnterPassword.textProperty(), binding.reEnterPasswordProperty());
    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void moveToLogin() {
        this.screenPage.setScreen("login");
    }

    @FXML
    public void submitAction() {
        if (!CommonValidations.isValidEmailAddress(binding.getEmailAddress())) {
            InvokeAnimation.attentionSeekerWobble(emailAddress);
            emailAddress.setPromptText("Please enter valid email address");
        } else if (!CommonValidations.isValidEmailAddress(binding.getAlternateEmailAddress())) {
            InvokeAnimation.attentionSeekerWobble(alternateEmailAddress);
            alternateEmailAddress.setPromptText("Please enter valid alternate email address");
        } else if (CommonValidations.isStringEmpty(binding.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(password);
            password.setPromptText("Please enter the password");
        } else if (CommonValidations.isStringEmpty(binding.getReEnterPassword())) {
            InvokeAnimation.attentionSeekerWobble(reEnterPassword);
            reEnterPassword.setPromptText("Please enter the password");
        } else if (password.equals(reEnterPassword)) {
            InvokeAnimation.attentionSeekerShake(password);
            InvokeAnimation.attentionSeekerShake(reEnterPassword);
            reEnterPassword.setPromptText("Password do not match");
            password.setPromptText("Password do not match");
        } else {
            Task task = new Task<Void>() {
                @Override
                public Void call() throws IOException {

                    DropBoxRegistrationRequest request = new DropBoxRegistrationRequest();
                    request.setPassword(binding.getPassword());
                    request.setUserName(binding.getEmailAddress());
                    request.setEmailAddress(binding.getAlternateEmailAddress());
                    UserOperationsService_Service servicePort = new UserOperationsService_Service();
                    try {
                        DropBoxRegistrationResponse response = servicePort.getUserOperationsPort().registerUser(request);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            successMessage("You are successfully registered, kindly login");
                            screenPage.setScreen("login");
                        } else {
                            errors(response.getErrorMessage());
                        }
                    } catch (com.dropbox.webservice.useroperations.Exception ex) {
                        errors(ex.getMessage());
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
                Dialogs.showInformationDialog(null, message,"Success","Success");
            }
        });
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showInformationDialog(null, null, message, "Error");
            }
        });
    }
}
