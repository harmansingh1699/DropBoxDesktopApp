
package com.dropbox.webservice.contracts.useroperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationRequest" type="{http://useroperations.contracts.webservice.dropbox.com/}dropBoxLoginRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateUser", propOrder = {
    "authenticationRequest"
})
public class AuthenticateUser {

    @XmlElement(name = "AuthenticationRequest")
    protected DropBoxLoginRequest authenticationRequest;

    /**
     * Gets the value of the authenticationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxLoginRequest }
     *     
     */
    public DropBoxLoginRequest getAuthenticationRequest() {
        return authenticationRequest;
    }

    /**
     * Sets the value of the authenticationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxLoginRequest }
     *     
     */
    public void setAuthenticationRequest(DropBoxLoginRequest value) {
        this.authenticationRequest = value;
    }

}
