
package servicio;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SerivicioWeb", targetNamespace = "http://Servicio/", wsdlLocation = "http://localhost:8080/WebService/SerivicioWeb?wsdl")
public class SerivicioWeb_Service
    extends Service
{

    private final static URL SERIVICIOWEB_WSDL_LOCATION;
    private final static WebServiceException SERIVICIOWEB_EXCEPTION;
    private final static QName SERIVICIOWEB_QNAME = new QName("http://Servicio/", "SerivicioWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebService/SerivicioWeb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERIVICIOWEB_WSDL_LOCATION = url;
        SERIVICIOWEB_EXCEPTION = e;
    }

    public SerivicioWeb_Service() {
        super(__getWsdlLocation(), SERIVICIOWEB_QNAME);
    }

    public SerivicioWeb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERIVICIOWEB_QNAME, features);
    }

    public SerivicioWeb_Service(URL wsdlLocation) {
        super(wsdlLocation, SERIVICIOWEB_QNAME);
    }

    public SerivicioWeb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERIVICIOWEB_QNAME, features);
    }

    public SerivicioWeb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SerivicioWeb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SerivicioWeb
     */
    @WebEndpoint(name = "SerivicioWebPort")
    public SerivicioWeb getSerivicioWebPort() {
        return super.getPort(new QName("http://Servicio/", "SerivicioWebPort"), SerivicioWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SerivicioWeb
     */
    @WebEndpoint(name = "SerivicioWebPort")
    public SerivicioWeb getSerivicioWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicio/", "SerivicioWebPort"), SerivicioWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERIVICIOWEB_EXCEPTION!= null) {
            throw SERIVICIOWEB_EXCEPTION;
        }
        return SERIVICIOWEB_WSDL_LOCATION;
    }

}
