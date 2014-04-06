
package com.dropbox.webservice.contracts.useroperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationRequest" type="{http://useroperations.contracts.webservice.dropbox.com/}dropBoxRegistrationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterUser", propOrder = {
    "registrationRequest"
})
public class RegisterUser {

    @XmlElement(name = "RegistrationRequest")
    protected DropBoxRegistrationRequest registrationRequest;

    /**
     * Gets the value of the registrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxRegistrationRequest }
     *     
     */
    public DropBoxRegistrationRequest getRegistrationRequest() {
        return registrationRequest;
    }

    /**
     * Sets the value of the registrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxRegistrationRequest }
     *     
     */
    public void setRegistrationRequest(DropBoxRegistrationRequest value) {
        this.registrationRequest = value;
    }

}
