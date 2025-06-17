package org.example.service;

import org.example.dao.AnimalDao;
import org.example.entity.Animal;
import org.example.entity.DietStatus;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class AnimalService {
    private AnimalDao animalDao;

    public AnimalService() {
        try {
            this.animalDao = new AnimalDao(EntityManager em);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public Animal create(String name, int age, LocalDate arrivalDate, DietStatus diet) {
        Animal animal = Animal.builder().name(name).age(age).arrivalDate(arrivalDate).diet(diet).build();
    return animalDao.createAnimal(animal);
    }

    public List<Animal> get
            return animal

}
