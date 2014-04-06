
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UploadRequest" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxUploadRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadFile", propOrder = {
    "uploadRequest"
})
public class UploadFile {

    @XmlElement(name = "UploadRequest")
    protected DropBoxUploadRequest uploadRequest;

    /**
     * Gets the value of the uploadRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxUploadRequest }
     *     
     */
    public DropBoxUploadRequest getUploadRequest() {
        return uploadRequest;
    }

    /**
     * Sets the value of the uploadRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxUploadRequest }
     *     
     */
    public void setUploadRequest(DropBoxUploadRequest value) {
        this.uploadRequest = value;
    }

}
