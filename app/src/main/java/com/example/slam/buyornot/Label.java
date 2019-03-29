package com.example.slam.buyornot;

import java.util.ArrayList;

public class Label {

    private int lab_id;
    private String lab_libelle;
    private ArrayList<Produit> lesProduits;
    // Constructeur
    public Label(int id,String libelle) {
        this.lab_id=id;
        this.lab_libelle=libelle;
    }
    public int getLab_id() {
        return lab_id;
    }
    public void setLab_id(int id) {
        this.lab_id = id;
    }
    public String getLab_libelle() {
        return lab_libelle;
    }
    public void setLab_libelle(String libelle) {
        this.lab_libelle = libelle;
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

} // class Label
