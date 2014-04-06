/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dropbox.controller;

import com.dropbox.binding.DownloadSharedFileSceneBinding;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class DownloadSharedFileSceneFXMLController implements Initializable,IScreenController {

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
