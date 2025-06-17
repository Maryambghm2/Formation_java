package org.example.dao;

import org.example.entity.Animal;
import org.example.entity.DietStatus;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class AnimalDao extends BaseDao<Animal> {
    private int age;
    private String name;
    private DietStatus diet;
    private LocalDate arrivalDate;

    public AnimalDao(EntityManager em) {
        super(em);
    }

    @Override
    public boolean save(Animal newAnimal) {
        transaction = em.getTransaction();
        try {
            transaction.begin();
//            Animal newAnimal = new Animal();
            newAnimal.setName(name);
            newAnimal.setAge(age);
            newAnimal.setDiet(diet);
            newAnimal.setArrivalDate(arrivalDate);
            em.persist(newAnimal);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Animal get(int id) {

    }

    @Override
    public List<Animal> get(String name) {
        return List.of();
    }

    @Override
    public List<Animal> get(DietStatus diet) {
        return List.of();
    }

    @Override
    public List<Animal> get() {
        return List.of();
    }
}
