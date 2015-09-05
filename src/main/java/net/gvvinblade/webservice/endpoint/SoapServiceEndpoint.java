package net.gvvinblade.webservice.endpoint;

import net.gvvinblade.webservice.domain.Person;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;

/**
 * Created by gvvin on 05.09.2015.
 *
 */
@WebServlet(name = "PersonService", urlPatterns = "/soap/PersonService")
@WebService(name = "PersonService", serviceName = "PersonService",
        portName = "PersonServicePort",
        endpointInterface = "net.gvvinblade.webservice.contract.SoapServiceEndpoint")
public class SoapServiceEndpoint implements net.gvvinblade.webservice.contract.SoapServiceEndpoint {

    @EJB
    private net.gvvinblade.webservice.contract.SoapServiceEndpoint delegate;

    @Override
    public void add(Person person) {
        delegate.add(person);
    }

    @Override
    public Person info(String name) {
        return delegate.info(name);
    }
}
