package org.example.service;

import org.example.dao.AnimalDao;

public class AnimalService {
    private AnimalDao animalDao;

    public AnimalDao() {
        try {

            animalDao = new AnimalDao(em);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
