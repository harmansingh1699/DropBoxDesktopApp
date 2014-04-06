/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.controller;

import com.dropbox.binding.ShareFileSceneBinding;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    }

}
