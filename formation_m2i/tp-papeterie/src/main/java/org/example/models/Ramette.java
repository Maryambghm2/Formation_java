package org.example.models;

public class Ramette extends ArticleUnitaire {
    private double grammage;

    public Ramette(String reference, String nom, double prix, double grammage) {
        super(reference, nom, prix);
        this.grammage = grammage;
    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return super.toString()+
                " est une ramette de grammage : " + grammage +
                "g.";
    }
}
