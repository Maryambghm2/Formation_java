package org.example.models;

public class Stylo extends ArticleUnitaire {
    private String couleur;

    public Stylo(String reference, String nom, double prix, String couleur) {
        super(reference, nom, prix);
        this.couleur = couleur;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() +
                " est un stylo de couleur " + couleur + ".";
    }
}
