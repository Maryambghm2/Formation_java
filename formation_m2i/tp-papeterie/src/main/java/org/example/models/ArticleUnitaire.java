package org.example.models;

public class ArticleUnitaire extends Article {
    private String nom;
    private double prix;

    public ArticleUnitaire(String reference, String nom, double prix) {
        super(reference);
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return getNom() + " " +
                " réference: " + getReference() +
                "nom= '" + nom +
                "' , prix=" + prix + " ; ";
    }
}
