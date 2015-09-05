package net.gvvinblade.webservice.endpoint;

import net.gvvinblade.webservice.domain.Person;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by gvvin on 05.09.2015.
 *
 */
@Named
@RequestScoped
public class RestServiceEndpoint implements net.gvvinblade.webservice.contract.RestServiceEndpoint {

    @EJB
    net.gvvinblade.webservice.contract.RestServiceEndpoint delegate;

    @Override
    public void add(Person person) {
        delegate.add(person);
    }

    @Override
    public Person info(String name) {
        return delegate.info(name);
    }
}
