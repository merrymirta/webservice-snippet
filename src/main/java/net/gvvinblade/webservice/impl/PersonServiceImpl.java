package net.gvvinblade.webservice.impl;

import net.gvvinblade.webservice.contract.PersonService;
import net.gvvinblade.webservice.domain.Person;

import javax.ejb.Stateless;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * Created by gvvin on 04.09.2015.
 */
@Stateless
public class PersonServiceImpl implements PersonService {

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
