package org.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_exo1_zoo");
    EntityManager em = emf.createEntityManager();

    public EntityManager getEntityManager() {
        return em;
    }

    public void jpaClose() {
        if (em.isOpen()) {
            em.close();
        }
    }
}
