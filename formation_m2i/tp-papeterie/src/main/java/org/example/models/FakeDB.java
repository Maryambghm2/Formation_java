package org.example.models;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    public static Map<String, ArticleUnitaire> database = new HashMap<>();

    //    public static Map<String, ArticleUnitaire> getAllArticleUnitairePriceMin = new HashMap<>();


    public static Map<String, ArticleUnitaire> getAllArticleUnitairePriceMax(double priceMax) {
        Map<String, ArticleUnitaire> filterDatabase = new HashMap<>();
// en utilisant les clés
        for (String key : database.keySet()) {
            System.out.println("La clé est " + key);
            System.out.println("La valeur est " + database.get(key));
            if (database.get(key).getPrix() <= priceMax) {
                filterDatabase.put(key, database.get(key));
            }
        }
        return filterDatabase;
    }

    ;
}
