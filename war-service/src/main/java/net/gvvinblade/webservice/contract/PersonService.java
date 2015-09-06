package net.gvvinblade.webservice.contract;

import net.gvvinblade.webservice.domain.Person;

import javax.ejb.Remote;
import javax.ws.rs.*;

/**
 * Created by gvvin on 06.09.2015.
 *
 */
@Remote
public interface PersonService {
    void add(Person person);

    Person info(@PathParam("name") String name);
}
