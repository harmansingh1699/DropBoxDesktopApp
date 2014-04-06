
package com.dropbox.webservice.contracts.useroperations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationResponse" type="{http://useroperations.contracts.webservice.dropbox.com/}dropBoxLoginResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateUserResponse", propOrder = {
    "authenticationResponse"
})
public class AuthenticateUserResponse {

    @XmlElement(name = "AuthenticationResponse")
    protected DropBoxLoginResponse authenticationResponse;

    /**
     * Gets the value of the authenticationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DropBoxLoginResponse }
     *     
     */
    public DropBoxLoginResponse getAuthenticationResponse() {
        return authenticationResponse;
    }

    /**
     * Sets the value of the authenticationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBoxLoginResponse }
     *     
     */
    public void setAuthenticationResponse(DropBoxLoginResponse value) {
        this.authenticationResponse = value;
    }

}
