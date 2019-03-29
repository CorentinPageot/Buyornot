package com.example.slam.buyornot;

public class Ingredient {
    private int ing_id;
    private String ing_libelle;

    // Constructeur
    public Ingredient(int id,String libelle) {
        this.ing_id=id;
        this.ing_libelle=libelle;
    }
    public int getIng_id() {
        return ing_id;
    }
    public void setIng_id(int id) {
        this.ing_id = id;
    }
    public String getIng_libelle() {
        return ing_libelle;
    }
    public void setIng_libelle(String libelle) {
        this.ing_libelle = libelle;
    }
} // class Ingredient
