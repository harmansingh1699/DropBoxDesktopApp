
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownloadFileRequest" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxDownloadRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadFile", propOrder = {
    "downloadFileRequest"
})
public class DownloadFile {

    @XmlElement(name = "DownloadFileRequest")
    protected DropBoxDownloadRequest downloadFileRequest;

    /**
     * Gets the value of the downloadFileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxDownloadRequest }
     *     
     */
    public DropBoxDownloadRequest getDownloadFileRequest() {
        return downloadFileRequest;
    }

    /**
     * Sets the value of the downloadFileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxDownloadRequest }
     *     
     */
    public void setDownloadFileRequest(DropBoxDownloadRequest value) {
        this.downloadFileRequest = value;
    }

}
