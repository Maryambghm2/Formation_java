package org.example.models;

public class Facture {
    private String client, date;
    private Ligne[] lignes;
    private int numero;
    private int cpt = 0;


    public Facture(String client, String date, int numero, int nombreLignes) {
        this.client = client;
        this.date = date;
        this.numero = numero;
        this.lignes = new Ligne[nombreLignes];
    }


    public void ajouterLigne(String refArticle, int quantite) {
//        Ligne ligne = new Ligne(article, quantite);
//        lignes[cpt++] = ligne;
        lignes[cpt++] = new Ligne(FakeDB.database.get(refArticle), quantite);
    }

    public double getPrixTotal() {
        double prixTotal = 0;
        for (int i = 0; i < lignes.length; i++) {
            prixTotal += this.lignes[i].prixTotal();
        }
        return prixTotal;
    }

    @Override
    public String toString() {
        String detailLine = "";
        for (int i = 0; i < lignes.length; i++) {
           detailLine +=  "\n" + " - " + this.lignes[i].toString();
        }
        return "Facture : numéro " + this.numero + " pour client : " + this.client + ", date : "+ date + detailLine + getPrixTotal();

    }

}
