package com.example.slam.buyornot;

public class Categorie {
    private int cat_id;
    private String cat_libelle;

    // Constructeur
    public Categorie(int id,String libelle) {
        this.cat_id=id;
        this.cat_libelle=libelle;
    }
    public int getCat_id() {
        return cat_id;
    }
    public void setCat_id(int id) {
        this.cat_id = id;
    }
    public String getCat_libelle() {
        return cat_libelle;
    }
    public void setCat_libelle(String libelle) {
        this.cat_libelle = libelle;
    }
} // class Categorie
