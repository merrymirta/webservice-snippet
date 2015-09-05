package net.gvvinblade.webservice.contract;

import net.gvvinblade.webservice.domain.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by gvvin on 04.09.2015.
 *
 */
@WebService(targetNamespace = "http://webservice.gvvinblade.net/personservice")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SoapServiceEndpoint {

    @WebMethod(operationName = "add", action="urn:add")
    void add(@WebParam(name = "Person", partName = "person")Person person);

    @WebMethod(operationName = "info", action="urn:info")
    @WebResult(name = "Person", partName = "person") Person info(@WebParam(name = "name", partName = "name") String name);

}
