
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFilesRequest" type="{http://cloudoperations.contracts.webservice.dropbox.com/}dropBoxGetFilesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFiles", propOrder = {
    "getFilesRequest"
})
public class GetFiles {

    @XmlElement(name = "GetFilesRequest")
    protected DropBoxGetFilesRequest getFilesRequest;

    /**
     * Gets the value of the getFilesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxGetFilesRequest }
     *     
     */
    public DropBoxGetFilesRequest getGetFilesRequest() {
        return getFilesRequest;
    }

    /**
     * Sets the value of the getFilesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxGetFilesRequest }
     *     
     */
    public void setGetFilesRequest(DropBoxGetFilesRequest value) {
        this.getFilesRequest = value;
    }

}
