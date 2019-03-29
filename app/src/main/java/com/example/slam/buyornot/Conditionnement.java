package com.example.slam.buyornot;

import java.util.ArrayList;

public class Conditionnement {
    private int con_id;
    private String con_libelle;
    private ArrayList<Produit> lesProduits;
    // Constructeur
    public Conditionnement(int id,String libelle) {
        this.con_id=id;
        this.con_libelle=libelle;
    }
    public int getCon_id() {
        return con_id;
    }
    public void setCon_id(int id) {
        this.con_id = id;
    }
    public String getCon_libelle() {
        return con_libelle;
    }
    public void setCon_libelle(String libelle) {
        this.con_libelle = libelle;
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
} // class Conditionnement
