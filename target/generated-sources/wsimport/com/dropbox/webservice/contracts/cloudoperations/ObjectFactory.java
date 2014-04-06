
package com.dropbox.webservice.contracts.cloudoperations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dropbox.webservice.contracts.cloudoperations package. 
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

    private final static QName _GetFileShareKey_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetFileShareKey");
    private final static QName _GetSharedFileResponse_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetSharedFileResponse");
    private final static QName _UploadFileResponse_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "UploadFileResponse");
    private final static QName _GetFileShareKeyResponse_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetFileShareKeyResponse");
    private final static QName _UploadFile_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "UploadFile");
    private final static QName _DownloadFileResponse_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "DownloadFileResponse");
    private final static QName _GetFiles_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetFiles");
    private final static QName _DownloadFile_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "DownloadFile");
    private final static QName _GetSharedFile_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetSharedFile");
    private final static QName _GetFilesResponse_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "GetFilesResponse");
    private final static QName _Exception_QNAME = new QName("http://cloudoperations.contracts.webservice.dropbox.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dropbox.webservice.contracts.cloudoperations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFileShareKeyResponse }
     * 
     */
    public GetFileShareKeyResponse createGetFileShareKeyResponse() {
        return new GetFileShareKeyResponse();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link DropBoxGetSharedFileRequest }
     * 
     */
    public DropBoxGetSharedFileRequest createDropBoxGetSharedFileRequest() {
        return new DropBoxGetSharedFileRequest();
    }

    /**
     * Create an instance of {@link DownloadFile }
     * 
     */
    public DownloadFile createDownloadFile() {
        return new DownloadFile();
    }

    /**
     * Create an instance of {@link GetFileShareKey }
     * 
     */
    public GetFileShareKey createGetFileShareKey() {
        return new GetFileShareKey();
    }

    /**
     * Create an instance of {@link DropBoxGenerateSharingKeyResponse }
     * 
     */
    public DropBoxGenerateSharingKeyResponse createDropBoxGenerateSharingKeyResponse() {
        return new DropBoxGenerateSharingKeyResponse();
    }

    /**
     * Create an instance of {@link DropBoxGetFilesRequest }
     * 
     */
    public DropBoxGetFilesRequest createDropBoxGetFilesRequest() {
        return new DropBoxGetFilesRequest();
    }

    /**
     * Create an instance of {@link DropBoxDownloadResponse }
     * 
     */
    public DropBoxDownloadResponse createDropBoxDownloadResponse() {
        return new DropBoxDownloadResponse();
    }

    /**
     * Create an instance of {@link DropBoxGenerateSharingKeyRequest }
     * 
     */
    public DropBoxGenerateSharingKeyRequest createDropBoxGenerateSharingKeyRequest() {
        return new DropBoxGenerateSharingKeyRequest();
    }

    /**
     * Create an instance of {@link DropBoxDownloadRequest }
     * 
     */
    public DropBoxDownloadRequest createDropBoxDownloadRequest() {
        return new DropBoxDownloadRequest();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link DropBoxUploadResponse }
     * 
     */
    public DropBoxUploadResponse createDropBoxUploadResponse() {
        return new DropBoxUploadResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetFilesResponse }
     * 
     */
    public GetFilesResponse createGetFilesResponse() {
        return new GetFilesResponse();
    }

    /**
     * Create an instance of {@link DropBoxUploadRequest }
     * 
     */
    public DropBoxUploadRequest createDropBoxUploadRequest() {
        return new DropBoxUploadRequest();
    }

    /**
     * Create an instance of {@link DownloadFileResponse }
     * 
     */
    public DownloadFileResponse createDownloadFileResponse() {
        return new DownloadFileResponse();
    }

    /**
     * Create an instance of {@link GetSharedFileResponse }
     * 
     */
    public GetSharedFileResponse createGetSharedFileResponse() {
        return new GetSharedFileResponse();
    }

    /**
     * Create an instance of {@link GetFiles }
     * 
     */
    public GetFiles createGetFiles() {
        return new GetFiles();
    }

    /**
     * Create an instance of {@link DropBoxGetFilesResponse }
     * 
     */
    public DropBoxGetFilesResponse createDropBoxGetFilesResponse() {
        return new DropBoxGetFilesResponse();
    }

    /**
     * Create an instance of {@link GetSharedFile }
     * 
     */
    public GetSharedFile createGetSharedFile() {
        return new GetSharedFile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileShareKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetFileShareKey")
    public JAXBElement<GetFileShareKey> createGetFileShareKey(GetFileShareKey value) {
        return new JAXBElement<GetFileShareKey>(_GetFileShareKey_QNAME, GetFileShareKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetSharedFileResponse")
    public JAXBElement<GetSharedFileResponse> createGetSharedFileResponse(GetSharedFileResponse value) {
        return new JAXBElement<GetSharedFileResponse>(_GetSharedFileResponse_QNAME, GetSharedFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "UploadFileResponse")
    public JAXBElement<UploadFileResponse> createUploadFileResponse(UploadFileResponse value) {
        return new JAXBElement<UploadFileResponse>(_UploadFileResponse_QNAME, UploadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileShareKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetFileShareKeyResponse")
    public JAXBElement<GetFileShareKeyResponse> createGetFileShareKeyResponse(GetFileShareKeyResponse value) {
        return new JAXBElement<GetFileShareKeyResponse>(_GetFileShareKeyResponse_QNAME, GetFileShareKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "UploadFile")
    public JAXBElement<UploadFile> createUploadFile(UploadFile value) {
        return new JAXBElement<UploadFile>(_UploadFile_QNAME, UploadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "DownloadFileResponse")
    public JAXBElement<DownloadFileResponse> createDownloadFileResponse(DownloadFileResponse value) {
        return new JAXBElement<DownloadFileResponse>(_DownloadFileResponse_QNAME, DownloadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetFiles")
    public JAXBElement<GetFiles> createGetFiles(GetFiles value) {
        return new JAXBElement<GetFiles>(_GetFiles_QNAME, GetFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "DownloadFile")
    public JAXBElement<DownloadFile> createDownloadFile(DownloadFile value) {
        return new JAXBElement<DownloadFile>(_DownloadFile_QNAME, DownloadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetSharedFile")
    public JAXBElement<GetSharedFile> createGetSharedFile(GetSharedFile value) {
        return new JAXBElement<GetSharedFile>(_GetSharedFile_QNAME, GetSharedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "GetFilesResponse")
    public JAXBElement<GetFilesResponse> createGetFilesResponse(GetFilesResponse value) {
        return new JAXBElement<GetFilesResponse>(_GetFilesResponse_QNAME, GetFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cloudoperations.contracts.webservice.dropbox.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
