
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownloadFileResponse" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxDownloadResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadFileResponse", propOrder = {
    "downloadFileResponse"
})
public class DownloadFileResponse {

    @XmlElement(name = "DownloadFileResponse")
    protected DropBoxDownloadResponse downloadFileResponse;

    /**
     * Gets the value of the downloadFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxDownloadResponse }
     *     
     */
    public DropBoxDownloadResponse getDownloadFileResponse() {
        return downloadFileResponse;
    }

    /**
     * Sets the value of the downloadFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxDownloadResponse }
     *     
     */
    public void setDownloadFileResponse(DropBoxDownloadResponse value) {
        this.downloadFileResponse = value;
    }

}
