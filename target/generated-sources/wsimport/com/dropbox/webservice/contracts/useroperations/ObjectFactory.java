
package com.dropbox.webservice.contracts.useroperations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dropbox.webservice.contracts.useroperations package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterUser_QNAME = new QName("http://useroperations.contracts.webservice.dropbox.com/", "RegisterUser");
    private final static QName _Exception_QNAME = new QName("http://useroperations.contracts.webservice.dropbox.com/", "Exception");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://useroperations.contracts.webservice.dropbox.com/", "RegisterUserResponse");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://useroperations.contracts.webservice.dropbox.com/", "AuthenticateUserResponse");
    private final static QName _AuthenticateUser_QNAME = new QName("http://useroperations.contracts.webservice.dropbox.com/", "AuthenticateUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dropbox.webservice.contracts.useroperations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link DropBoxRegistrationRequest }
     * 
     */
    public DropBoxRegistrationRequest createDropBoxRegistrationRequest() {
        return new DropBoxRegistrationRequest();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link DropBoxLoginResponse }
     * 
     */
    public DropBoxLoginResponse createDropBoxLoginResponse() {
        return new DropBoxLoginResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DropBoxLoginRequest }
     * 
     */
    public DropBoxLoginRequest createDropBoxLoginRequest() {
        return new DropBoxLoginRequest();
    }

    /**
     * Create an instance of {@link DropBoxRegistrationResponse }
     * 
     */
    public DropBoxRegistrationResponse createDropBoxRegistrationResponse() {
        return new DropBoxRegistrationResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://useroperations.contracts.webservice.dropbox.com/", name = "RegisterUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://useroperations.contracts.webservice.dropbox.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://useroperations.contracts.webservice.dropbox.com/", name = "RegisterUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://useroperations.contracts.webservice.dropbox.com/", name = "AuthenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://useroperations.contracts.webservice.dropbox.com/", name = "AuthenticateUser")
    public JAXBElement<AuthenticateUser> createAuthenticateUser(AuthenticateUser value) {
        return new JAXBElement<AuthenticateUser>(_AuthenticateUser_QNAME, AuthenticateUser.class, null, value);
    }

}
