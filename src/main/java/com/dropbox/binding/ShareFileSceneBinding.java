/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dropbox.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ravjotsingh
 */
public class ShareFileSceneBinding {
    private StringProperty emailAddress;
    private StringProperty filePath;

    public ShareFileSceneBinding() {
        emailAddress = new SimpleStringProperty();
        filePath = new SimpleStringProperty();
    }

    public String getFilePath() {
        return (String) this.filePath.get();
    }

    public void setFilePath(String filePath) {
        this.filePath.set(filePath);
    }

    public StringProperty filePathProperty() {
        return this.filePath;
    }

    public String getEmailAddress() {
        return (String) this.emailAddress.get();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.set(emailAddress);
    }

    public StringProperty emailAddressProperty() {
        return this.emailAddress;
    }
}
