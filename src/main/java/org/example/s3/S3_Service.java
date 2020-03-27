package org.example.s3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2020-03-27T23:44:37.332+08:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "s3",
                  wsdlLocation = "file:/C:/Users/SHYHSHENLUNG/codeready-workspace/s4/src/main/resources/wsdl/s4.wsdl",
                  targetNamespace = "http://www.example.org/s3/")
public class S3_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/s3/", "s3");
    public final static QName S3SOAP = new QName("http://www.example.org/s3/", "s3SOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/SHYHSHENLUNG/codeready-workspace/s4/src/main/resources/wsdl/s4.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(S3_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/SHYHSHENLUNG/codeready-workspace/s4/src/main/resources/wsdl/s4.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public S3_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public S3_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public S3_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public S3_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public S3_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public S3_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns S3
     */
    @WebEndpoint(name = "s3SOAP")
    public S3 getS3SOAP() {
        return super.getPort(S3SOAP, S3.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns S3
     */
    @WebEndpoint(name = "s3SOAP")
    public S3 getS3SOAP(WebServiceFeature... features) {
        return super.getPort(S3SOAP, S3.class, features);
    }

}
