package com.example.slam.buyornot;

import java.util.ArrayList;

public class Origine {
    private int ori_id;
    private String ori_libelle;
    private ArrayList<Produit> lesProduits;
    // Constructeur
    public Origine(int id,String libelle) {
        this.ori_id=id;
        this.ori_libelle=libelle;
    }
    public int getOri_id() {
        return ori_id;
    }
    public void setOri_id(int id) {
        this.ori_id = id;
    }
    public String getOri_libelle() {
        return ori_libelle;
    }
    public void setOri_libelle(String libelle) {
        this.ori_libelle = libelle;
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

} // class Origine
