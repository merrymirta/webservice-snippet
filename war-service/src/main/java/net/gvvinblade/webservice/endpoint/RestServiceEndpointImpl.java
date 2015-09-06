package net.gvvinblade.webservice.endpoint;

import net.gvvinblade.webservice.contract.PersonService;
import net.gvvinblade.webservice.contract.RestServiceEndpoint;
import net.gvvinblade.webservice.domain.Person;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.Path;

/**
 * Created by gvvin on 05.09.2015.
 *
 */
@Named
@RequestScoped
public class RestServiceEndpointImpl implements RestServiceEndpoint {

    @EJB
    PersonService delegate;

    @Override
    public void add(Person person) {
        delegate.add(person);
    }

    @Override
    public Person info(String name) {
        return delegate.info(name);
    }
}
