
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSharedFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSharedFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFileShareKeyRequest" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxGetSharedFileRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharedFile", propOrder = {
    "getFileShareKeyRequest"
})
public class GetSharedFile {

    @XmlElement(name = "GetFileShareKeyRequest")
    protected DropBoxGetSharedFileRequest getFileShareKeyRequest;

    /**
     * Gets the value of the getFileShareKeyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxGetSharedFileRequest }
     *     
     */
    public DropBoxGetSharedFileRequest getGetFileShareKeyRequest() {
        return getFileShareKeyRequest;
    }

    /**
     * Sets the value of the getFileShareKeyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxGetSharedFileRequest }
     *     
     */
    public void setGetFileShareKeyRequest(DropBoxGetSharedFileRequest value) {
        this.getFileShareKeyRequest = value;
    }

}
