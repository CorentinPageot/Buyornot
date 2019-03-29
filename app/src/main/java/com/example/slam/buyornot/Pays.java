package com.example.slam.buyornot;

import java.util.ArrayList;

public class Pays {
    private int pay_id;
    private String pay_libelle;

    private ArrayList<Produit> lesProduits;


    // Constructeur
    public Pays(int id,String libelle) {
        this.pay_id=id;
        this.pay_libelle=libelle;
    }
    public int getPay_id() {
        return pay_id;
    }
    public void setPay_id(int id) {
        this.pay_id = id;
    }
    public String getPay_libelle() {
        return pay_libelle;
    }
    public void setPay_libelle(String libelle) {
        this.pay_libelle = libelle;
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
} // class Pays
