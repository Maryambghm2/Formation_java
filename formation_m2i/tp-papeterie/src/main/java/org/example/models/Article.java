package org.example.models;

public abstract class Article {
    private String reference;

    public Article (String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference( String reference) {
        this.reference = reference;
    }


}
