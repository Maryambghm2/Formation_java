package org.example.demo_spring_date.dao;

import org.example.demo_spring_date.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    Person findPersonByFirstnameAndLastname(String firstname, String lastname);
}
