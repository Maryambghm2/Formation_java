package org.example.demo_spring_date.service;

import org.example.demo_spring_date.dao.PersonRepository;
import org.example.demo_spring_date.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person update(Person person) {
        return personRepository.save(person);
    }


    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person personById(int id) {
        return personRepository.findById(id).orElse(null);
    }

    public boolean delete(Person person) {
        personRepository.delete(person);
        return true;
    }

    public Person findByName(String firstname, String lastname) {
        return personRepository.findPersonByFirstnameAndLastname(firstname, lastname);
    }

}
