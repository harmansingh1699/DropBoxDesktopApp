
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFileShareKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileShareKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFileShareKeyResponse" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxGenerateSharingKeyResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileShareKeyResponse", propOrder = {
    "getFileShareKeyResponse"
})
public class GetFileShareKeyResponse {

    @XmlElement(name = "GetFileShareKeyResponse")
    protected DropBoxGenerateSharingKeyResponse getFileShareKeyResponse;

    /**
     * Gets the value of the getFileShareKeyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxGenerateSharingKeyResponse }
     *     
     */
    public DropBoxGenerateSharingKeyResponse getGetFileShareKeyResponse() {
        return getFileShareKeyResponse;
    }

    /**
     * Sets the value of the getFileShareKeyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxGenerateSharingKeyResponse }
     *     
     */
    public void setGetFileShareKeyResponse(DropBoxGenerateSharingKeyResponse value) {
        this.getFileShareKeyResponse = value;
    }

}
