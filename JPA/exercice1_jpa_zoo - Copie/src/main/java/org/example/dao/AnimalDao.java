package org.example.dao;

import org.example.entity.Animal;
import org.example.entity.DietStatus;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class AnimalDao extends BaseDao<Animal> {


    public AnimalDao(EntityManager em) {
        super(em);
    }

    @Override
    public Animal createAnimal(Animal newAnimal) {
        transaction = em.getTransaction();
        transaction.begin();
        em.persist(newAnimal);
        transaction.commit();
        return newAnimal;

    }

    @Override
    public Animal get(int id) {

    }

    @Override
    public List<Animal> get(String name) {
        TypedQuery<Animal> query = em.createQuery(("SELECT a from Animal a WHERE a.name: name", Animal.class))
        query.setParameter(name);

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
