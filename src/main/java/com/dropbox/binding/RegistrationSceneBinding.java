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
public class RegistrationSceneBinding {
    private StringProperty alternateEmailAddress;
    private StringProperty emailAddress;
    private StringProperty password;
    private StringProperty reEnterPassword;

    public RegistrationSceneBinding() {
        emailAddress = new SimpleStringProperty();
        alternateEmailAddress = new SimpleStringProperty();
        password = new SimpleStringProperty();
        reEnterPassword = new SimpleStringProperty();
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

    public String getPassword() {
        return (String) this.password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return this.password;
    }

    public String getAlternateEmailAddress() {
        return (String) this.alternateEmailAddress.get();
    }

    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress.set(alternateEmailAddress);
    }

    public StringProperty alternateEmailAddressProperty() {
        return this.alternateEmailAddress;
    }

    public String getReEnterPassword() {
        return (String) this.reEnterPassword.get();
    }

    public void setReEnterPassword(String reEnterPassword) {
        this.reEnterPassword.set(reEnterPassword);
    }

    public StringProperty reEnterPasswordProperty() {
        return this.reEnterPassword;
    }

    
}
