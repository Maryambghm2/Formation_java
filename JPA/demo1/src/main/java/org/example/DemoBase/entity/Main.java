package org.example.DemoBase.entity;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();

//        Account account = new Account(5000, "MaryamBeghmam", "0000 0000 0000 1111");
//        Account account2 = new Account(5000, "AmyDolores", "2100 0500 0000 1111");
//        Account account3 = new Account(10000, "LeaMay", "5555 0500 4444 1111");
//        em.getTransaction().begin();
//        em.persist(account);
//        em.persist(account2);
//        em.persist(account3);
//        em.getTransaction().commit();
//
        // AFFICHAGE PAR ID
//        Account accountfind = em.find(Account.class, 2);
//        if (accountfind != null) {
//            System.out.println(accountfind);
//        } else {
//            System.out.println("No account found");
//        }
//
//        try {
//            Account accountfindByReference = em.getReference(Account.class, 10);
//            System.out.println(accountfindByReference);
//        } catch (EntityNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        // AFFICHAGE AVEC CONDITION PUIS MIS DANS UNE LISTE
//        TypedQuery<Account> query = em.createQuery("SELECT a from Account a WHERE a.balance > 9999", Account.class);
//
//        List<Account> accounts = query.getResultList();
//
//        accounts.forEach(System.out::println);
//
 // update

//        try {
//            Account accountToUpdate = em.getReference(Account.class, 2);
//            em.getTransaction().begin();
//            accountToUpdate.setBalance(450);
//            em.getTransaction().commit();
//        } catch (EntityNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(em.find(Account.class,2));
//
//        // delete
//
//        Account accountToDelete = em.find(Account.class, 5);
//        if (accountToDelete !=null) {
//            em.getTransaction().begin();
//            em.remove(accountToDelete);
//            em.getTransaction().commit();
        }


    }