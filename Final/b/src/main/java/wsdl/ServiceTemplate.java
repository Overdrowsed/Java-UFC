
package wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ServiceTemplate", targetNamespace = "http://template/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceTemplate {


    /**
     * 
     * @param agentTransactionId
     * @return
     *     returns long
     * @throws TransactionNotFound_Exception
     * @throws InternalError_Exception
     * @throws AgentAuthFailed_Exception
     * @throws AgentAccessDenied_Exception
     */
    @WebMethod(operationName = "Status")
    @WebResult(name = "system_transaction_id", targetNamespace = "")
    @RequestWrapper(localName = "Status", targetNamespace = "http://template/", className = "wsdl.Status")
    @ResponseWrapper(localName = "StatusResponse", targetNamespace = "http://template/", className = "wsdl.StatusResponse")
    @Action(input = "http://template/ServiceTemplate/StatusRequest", output = "http://template/ServiceTemplate/StatusResponse", fault = {
        @FaultAction(className = TransactionNotFound_Exception.class, value = "http://template/ServiceTemplate/Status/Fault/TransactionNotFound"),
        @FaultAction(className = AgentAuthFailed_Exception.class, value = "http://template/ServiceTemplate/Status/Fault/AgentAuthFailed"),
        @FaultAction(className = AgentAccessDenied_Exception.class, value = "http://template/ServiceTemplate/Status/Fault/AgentAccessDenied"),
        @FaultAction(className = InternalError_Exception.class, value = "http://template/ServiceTemplate/Status/Fault/InternalError")
    })
    public long status(
        @WebParam(name = "agent_transaction_id", targetNamespace = "")
        String agentTransactionId)
        throws AgentAccessDenied_Exception, AgentAuthFailed_Exception, InternalError_Exception, TransactionNotFound_Exception
    ;

    /**
     * 
     * @param userId
     * @return
     *     returns wsdl.User
     * @throws InternalError_Exception
     * @throws UserNotFound_Exception
     * @throws AgentAuthFailed_Exception
     * @throws AgentAccessDenied_Exception
     */
    @WebMethod(operationName = "Check")
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "Check", targetNamespace = "http://template/", className = "wsdl.Check")
    @ResponseWrapper(localName = "CheckResponse", targetNamespace = "http://template/", className = "wsdl.CheckResponse")
    @Action(input = "http://template/ServiceTemplate/CheckRequest", output = "http://template/ServiceTemplate/CheckResponse", fault = {
        @FaultAction(className = UserNotFound_Exception.class, value = "http://template/ServiceTemplate/Check/Fault/UserNotFound"),
        @FaultAction(className = AgentAuthFailed_Exception.class, value = "http://template/ServiceTemplate/Check/Fault/AgentAuthFailed"),
        @FaultAction(className = AgentAccessDenied_Exception.class, value = "http://template/ServiceTemplate/Check/Fault/AgentAccessDenied"),
        @FaultAction(className = InternalError_Exception.class, value = "http://template/ServiceTemplate/Check/Fault/InternalError")
    })
    public User check(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId)
        throws AgentAccessDenied_Exception, AgentAuthFailed_Exception, InternalError_Exception, UserNotFound_Exception
    ;

    /**
     * 
     * @param transaction
     * @return
     *     returns long
     * @throws DuplicateFault_Exception
     * @throws InternalError_Exception
     * @throws AgentAuthFailed_Exception
     * @throws AgentAccessDenied_Exception
     * @throws UserNotFound_Exception
     * @throws AmountNotPositive_Exception
     */
    @WebMethod(operationName = "Pay")
    @WebResult(name = "system_transaction_id", targetNamespace = "")
    @RequestWrapper(localName = "Pay", targetNamespace = "http://template/", className = "wsdl.Pay")
    @ResponseWrapper(localName = "PayResponse", targetNamespace = "http://template/", className = "wsdl.PayResponse")
    @Action(input = "http://template/ServiceTemplate/PayRequest", output = "http://template/ServiceTemplate/PayResponse", fault = {
        @FaultAction(className = DuplicateFault_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/DuplicateFault"),
        @FaultAction(className = UserNotFound_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/UserNotFound"),
        @FaultAction(className = AmountNotPositive_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/AmountNotPositive"),
        @FaultAction(className = AgentAuthFailed_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/AgentAuthFailed"),
        @FaultAction(className = AgentAccessDenied_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/AgentAccessDenied"),
        @FaultAction(className = InternalError_Exception.class, value = "http://template/ServiceTemplate/Pay/Fault/InternalError")
    })
    public long pay(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction)
        throws AgentAccessDenied_Exception, AgentAuthFailed_Exception, AmountNotPositive_Exception, DuplicateFault_Exception, InternalError_Exception, UserNotFound_Exception
    ;

}
