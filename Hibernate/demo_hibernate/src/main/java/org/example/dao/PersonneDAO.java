package org.example.dao;

import org.example.entity.Personne;
import org.hibernate.Session;

import java.util.List;

public class PersonneDAO {

    private Session session;

    public PersonneDAO(Session session) {
        this.session = session;
    }

    public Personne save(Personne personne) {
        session.beginTransaction();
        session.saveOrUpdate(personne);
        session.getTransaction().commit();
        return personne;
    }

    public boolean delete(Personne personne) {
        session.beginTransaction();
        session.delete(personne);
        session.getTransaction().commit();
        return true;
    }

    public Personne getById(int id) {
        return session.get(Personne.class, id);
    }

    public List<Personne> get() {
        return session.createQuery("select p from Personne p", Personne.class).getResultList();
    }

public double ageMoyen() {
        return session.createQuery("SELECT avg(p.age) FROM Personne p", Double.class).uniqueResult();
}
}
