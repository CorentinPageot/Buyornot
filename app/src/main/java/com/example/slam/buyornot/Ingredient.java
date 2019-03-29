package com.example.slam.buyornot;

import java.util.ArrayList;

public class Ingredient {
    private int ing_id;
    private String ing_libelle;
    private ArrayList<Produit> lesProduits;
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
    public ArrayList<Produit> getLesProduits() {
        return lesProduits;
    }
    public void setLesProduits(ArrayList<Produit> lesProduits) {
        this.lesProduits = lesProduits;
    }
    public void addUnProduit(Produit unProduit) {
        if (lesProduits == null) {
            lesProduits = new ArrayList<Produit>();
        }
        lesProduits.add(unProduit);
    }
} // class Ingredient
