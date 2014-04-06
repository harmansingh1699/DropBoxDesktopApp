
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UploadResponse" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxUploadResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadFileResponse", propOrder = {
    "uploadResponse"
})
public class UploadFileResponse {

    @XmlElement(name = "UploadResponse")
    protected DropBoxUploadResponse uploadResponse;

    /**
     * Gets the value of the uploadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxUploadResponse }
     *     
     */
    public DropBoxUploadResponse getUploadResponse() {
        return uploadResponse;
    }

    /**
     * Sets the value of the uploadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxUploadResponse }
     *     
     */
    public void setUploadResponse(DropBoxUploadResponse value) {
        this.uploadResponse = value;
    }

}
