
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFileShareKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileShareKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFileShareKeyRequest" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxGenerateSharingKeyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileShareKey", propOrder = {
    "getFileShareKeyRequest"
})
public class GetFileShareKey {

    @XmlElement(name = "GetFileShareKeyRequest")
    protected DropBoxGenerateSharingKeyRequest getFileShareKeyRequest;

    /**
     * Gets the value of the getFileShareKeyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxGenerateSharingKeyRequest }
     *     
     */
    public DropBoxGenerateSharingKeyRequest getGetFileShareKeyRequest() {
        return getFileShareKeyRequest;
    }

    /**
     * Sets the value of the getFileShareKeyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxGenerateSharingKeyRequest }
     *     
     */
    public void setGetFileShareKeyRequest(DropBoxGenerateSharingKeyRequest value) {
        this.getFileShareKeyRequest = value;
    }

}
