package net.gvvinblade.webservice.impl;

import net.gvvinblade.webservice.contract.SoapServiceEndpoint;
import net.gvvinblade.webservice.domain.Person;

import javax.ejb.Singleton;
import javax.jws.WebService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * Created by gvvin on 04.09.2015.
 */
@Singleton
@WebService(name = "PersonService", serviceName = "PersonService",
        portName = "PersonServicePort",
        endpointInterface = "net.gvvinblade.webservice.contract.SoapServiceEndpoint")
public class PersonServiceImpl implements SoapServiceEndpoint {

    private final Map<String, Person> personMap = new ConcurrentHashMap<>();

    public void add(Person person) {
        if (personMap.containsKey(person.getFirstName())) {
            personMap.put(person.getFirstName(), person);
        }
    }

    public Person info(String name) {
        return personMap.get(name);
    }
}
