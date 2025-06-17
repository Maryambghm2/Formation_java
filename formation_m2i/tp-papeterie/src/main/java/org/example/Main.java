package org.example;

import org.example.models.*;

public class Main {
    public static void main(String[] args) {

        Stylo stylo1 = new Stylo("SY01", "stylo bic", 5.23, "jaune");
        Stylo stylo2 = new Stylo("SY02", "stylo bic", 5.23, "vert");
        Ramette ramette1 = new Ramette("RM01", "ramette avance", 15.6, 30);
        Ramette ramette2 = new Ramette("RM02", "ramette avance", 11.6, 20);

        FakeDB.database.put("SY01", stylo1);
        FakeDB.database.put("SY02", stylo2);
        FakeDB.database.put("RM01", ramette1);
        FakeDB.database.put("RM02", ramette2);

        System.out.println(FakeDB.database.get("SY01"));
        System.out.println(FakeDB.database.get("SY02"));
        System.out.println(FakeDB.database.get("RM01"));
        System.out.println(FakeDB.database.get("RM02"));

        System.out.println();
        System.out.println("Tout les element de ma fausse BDD:");
        System.out.println(FakeDB.database);
        System.out.println();


        Lot lot1 = new Lot("LT01", 2, 0.3, stylo2);
        Lot lot2 = new Lot("LT02", 4, 0.3, ramette2);

        System.out.println(lot1);
        System.out.println(lot2);

        Facture facture = new Facture("toto", "19/05/25",985, 2);

//        facture.ajouterLigne(stylo1, 5);
//        facture.ajouterLigne(ramette1, 3);

//        System.out.println(facture);
//
//        System.out.println("Tous les articles de moins de 5 euros :");
//        System.out.println(FakeDB.getAllArticleUnitairePriceMax(5));

        facture.ajouterLigne("SY01", 5);
        facture.ajouterLigne("SY02", 5);
        System.out.println(facture);
    }

}