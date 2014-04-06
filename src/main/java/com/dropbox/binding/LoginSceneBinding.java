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
public class LoginSceneBinding {
    private StringProperty emailAddress;
    private StringProperty password;

    public LoginSceneBinding() {
        emailAddress = new SimpleStringProperty();
        password = new SimpleStringProperty();
    }

    public String getPassword() {
        return (String) this.password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return this.password;
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
