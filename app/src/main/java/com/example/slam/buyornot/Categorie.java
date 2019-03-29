package com.example.slam.buyornot;

import java.util.ArrayList;

public class Categorie {
    private int cat_id;
    private String cat_libelle;
    private ArrayList<Produit> lesProduits;
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
} // class Categorie
