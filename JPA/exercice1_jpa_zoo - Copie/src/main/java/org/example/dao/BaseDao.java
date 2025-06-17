package org.example.dao;

import org.example.entity.DietStatus;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public abstract class BaseDao<T> {
    protected EntityManager em;
    protected EntityTransaction transaction;




    protected BaseDao(EntityManager em) {
        this.em = em;
    }

    public abstract AnimalDao createAnimal(T element);

    public abstract T get(int id);

    public abstract List<T> get(String name);

    public abstract List<T> get(DietStatus diet);

    public abstract List<T> get();

}
