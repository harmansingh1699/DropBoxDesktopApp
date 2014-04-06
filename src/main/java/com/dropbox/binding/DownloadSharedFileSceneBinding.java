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
public class DownloadSharedFileSceneBinding {

    private StringProperty key;

    public DownloadSharedFileSceneBinding() {
        key = new SimpleStringProperty();
    }

    public String getKey() {
        return (String) this.key.get();
    }

    public void setKey(String key) {
        this.key.set(key);
    }

    public StringProperty keyProperty() {
        return this.key;
    }
}
