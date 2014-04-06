
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFilesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFilesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFilesResponse" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxGetFilesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFilesResponse", propOrder = {
    "getFilesResponse"
})
public class GetFilesResponse {

    @XmlElement(name = "GetFilesResponse")
    protected DropBoxGetFilesResponse getFilesResponse;

    /**
     * Gets the value of the getFilesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxGetFilesResponse }
     *     
     */
    public DropBoxGetFilesResponse getGetFilesResponse() {
        return getFilesResponse;
    }

    /**
     * Sets the value of the getFilesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxGetFilesResponse }
     *     
     */
    public void setGetFilesResponse(DropBoxGetFilesResponse value) {
        this.getFilesResponse = value;
    }

}
