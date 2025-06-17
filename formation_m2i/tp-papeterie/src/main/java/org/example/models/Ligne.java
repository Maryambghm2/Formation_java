package org.example.models;

public class Ligne {
    private ArticleUnitaire article;
    private int quantite;

    public Ligne(ArticleUnitaire article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public double prixTotal() {
        return this.quantite * this.article.getPrix();
    }


    public Article getArticle() {
        return article;
    }

    public void setArticle(ArticleUnitaire article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void afficheToi() {
        System.out.println(quantite + " | " + article.getReference());
    }

    @Override
    public String toString() {
        return quantite + " " + article +" prix :" + prixTotal();
    }
}
