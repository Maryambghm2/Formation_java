package org.example.models;

public class Lot extends Article {
   private int quantite;
   private double remise;
   private Article article;

    public Lot(String reference, int quantite, double remise, Article article) {
        super(reference);
        this.quantite = quantite;
        this.remise = remise;
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Lot composé de "+
                "quantite=" + quantite +
                ", remise=" + remise +
                ", article=" + article +
                '}';
    }
}
