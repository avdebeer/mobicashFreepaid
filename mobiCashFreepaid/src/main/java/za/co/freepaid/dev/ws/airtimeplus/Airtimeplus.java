
package za.co.freepaid.dev.ws.airtimeplus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "airtimeplus", targetNamespace = "http://ws.dev.freepaid.co.za/airtimeplus/", wsdlLocation = "http://ws.dev.freepaid.co.za/airtimeplus/?wsdl")
public class Airtimeplus
    extends Service
{

    private final static URL AIRTIMEPLUS_WSDL_LOCATION;
    private final static WebServiceException AIRTIMEPLUS_EXCEPTION;
    private final static QName AIRTIMEPLUS_QNAME = new QName("http://ws.dev.freepaid.co.za/airtimeplus/", "airtimeplus");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.dev.freepaid.co.za/airtimeplus/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AIRTIMEPLUS_WSDL_LOCATION = url;
        AIRTIMEPLUS_EXCEPTION = e;
    }

    public Airtimeplus() {
        super(__getWsdlLocation(), AIRTIMEPLUS_QNAME);
    }

    public Airtimeplus(WebServiceFeature... features) {
        super(__getWsdlLocation(), AIRTIMEPLUS_QNAME, features);
    }

    public Airtimeplus(URL wsdlLocation) {
        super(wsdlLocation, AIRTIMEPLUS_QNAME);
    }

    public Airtimeplus(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AIRTIMEPLUS_QNAME, features);
    }

    public Airtimeplus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Airtimeplus(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AirtimeplusPortType
     */
    @WebEndpoint(name = "airtimeplusPort")
    public AirtimeplusPortType getAirtimeplusPort() {
        return super.getPort(new QName("http://ws.dev.freepaid.co.za/airtimeplus/", "airtimeplusPort"), AirtimeplusPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirtimeplusPortType
     */
    @WebEndpoint(name = "airtimeplusPort")
    public AirtimeplusPortType getAirtimeplusPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.dev.freepaid.co.za/airtimeplus/", "airtimeplusPort"), AirtimeplusPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AIRTIMEPLUS_EXCEPTION!= null) {
            throw AIRTIMEPLUS_EXCEPTION;
        }
        return AIRTIMEPLUS_WSDL_LOCATION;
    }

}