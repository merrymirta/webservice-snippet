package net.gvvinblade.webservice.contract;

import net.gvvinblade.webservice.domain.Person;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

/**
 * Created by gvvin on 06.09.2015.
 *
 */
@Local
public interface PersonService {
    void add(Person person);

    Person info(@PathParam("name") String name);
}
