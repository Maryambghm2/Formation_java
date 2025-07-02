package org.example.personne.model;

public class Adresse {

    private Integer id;
    private String rue;
    private Integer cp;

    public Adresse(Integer id, String rue, Integer cp) {
        this.id = id;
        this.rue = rue;
        this.cp = cp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }
}
