
package com.dropbox.webservice.contracts.useroperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationResponse" type="{http://useroperations.contracts.webservice.dropbox.com/}dropBoxRegistrationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterUserResponse", propOrder = {
    "registrationResponse"
})
public class RegisterUserResponse {

    @XmlElement(name = "RegistrationResponse")
    protected DropBoxRegistrationResponse registrationResponse;

    /**
     * Gets the value of the registrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxRegistrationResponse }
     *     
     */
    public DropBoxRegistrationResponse getRegistrationResponse() {
        return registrationResponse;
    }

    /**
     * Sets the value of the registrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxRegistrationResponse }
     *     
     */
    public void setRegistrationResponse(DropBoxRegistrationResponse value) {
        this.registrationResponse = value;
    }

}
