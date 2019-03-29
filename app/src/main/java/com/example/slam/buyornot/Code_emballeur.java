package com.example.slam.buyornot;

import java.util.ArrayList;

public class Code_emballeur {
    private int cod_id;
    private String cod_libelle;

    private ArrayList<Produit> lesProduits;

    // Constructeur
    public Code_emballeur(int id,String libelle) {
        this.cod_id=id;
        this.cod_libelle=libelle;
    }
    public int getCod_id() {
        return cod_id;
    }
    public void setCod_id(int id) {
        this.cod_id = id;
    }
    public String getCod_libelle() {
        return cod_libelle;
    }
    public void setCod_libelle(String libelle) {
        this.cod_libelle = libelle;
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
} // class Code_emballeur
