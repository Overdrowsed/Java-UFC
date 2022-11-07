
package homework.wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "AccessForbidden", targetNamespace = "http://template/")
public class AccessForbidden_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AccessForbidden faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AccessForbidden_Exception(String message, AccessForbidden faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AccessForbidden_Exception(String message, AccessForbidden faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: homework.wsdl.AccessForbidden
     */
    public AccessForbidden getFaultInfo() {
        return faultInfo;
    }

}