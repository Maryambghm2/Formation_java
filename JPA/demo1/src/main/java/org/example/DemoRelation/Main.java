package org.example.DemoRelation;

import org.example.DemoRelation.Component.Adress;
import org.example.DemoRelation.Component.Agence;
import org.example.DemoRelation.OneToMany.Departement;
import org.example.DemoRelation.OneToMany.Professeur;
import org.example.DemoRelation.OneToOne.Coordonnee;
import org.example.DemoRelation.OneToOne.Etudiant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
      EntityManager em = emf.createEntityManager();
//
//        Coordonnee coordonnee = Coordonnee.builder().adress("12 rue des lilas").codePostal("59000").build();
//        Etudiant etudiant = Etudiant.builder().name("toto").age(12).coordonneeEtudiant(coordonnee).build();
//
////  em.getTransaction().begin();
////  em.persist(coordonnee);
////  em.persist(etudiant);
////  em.getTransaction().commit();
//
//        System.out.println(em.find(Etudiant.class, 1));
//        System.out.println(em.find(Coordonnee.class, 1).getEtudiant());

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
//        EntityManager em = emf.createEntityManager();
//
//        Adress adress = new Adress("ville", "pays", "postalCode");
//        Agence agence = Agence.builder().code("4566540").libelle("libelle").adress(adress).build();
//        em.getTransaction().begin();
//        em.persist(agence);
//        em.getTransaction().commit();

////        System.out.println(em.find(Agence.class, 1));
//
//        Departement departement = Departement.builder().name("departement").build();
//
//        Professeur professeur = Professeur.builder().name("toto").departement(departement).build();
//
//
////        em.getTransaction().begin();
////        em.persist(departement);
////        em.persist(professeur);
////        em.getTransaction().commit();
//
//        System.out.println(em.createQuery("SELECT d FROM Departement d").getResultList());
//    }
//}
