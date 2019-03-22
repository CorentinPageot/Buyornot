package com.example.slam.buyornot;

public class Produit {
    private int pro_id;
    private String pro_nom;
    private int pro_quantite;
    private int pro_marque;
    private int pro_nova;
    private int pro_nutriscore;
    private String pro_denomination;
    private String pro_lien;

    // Constructeur
    public Produit(int id,String nom,int quantite,int marque,int nova,int nutriscore,String denomination,String lien) {
        this.pro_id=id;
        this.pro_nom=nom;
        this.pro_quantite=quantite;
        this.pro_marque=marque;
        this.pro_nova=nova;
        this.pro_nutriscore=nutriscore;
        this.pro_denomination=denomination;
        this.pro_lien=lien;
    }
    public int getPro_id() {
        return pro_id;
    }
    public void setPro_id(int id) {
        this.pro_id = id;
    }
    public String getPro_Nom() {
        return pro_nom;
    }
    public void setPro_nom(String nom) {
        this.pro_nom = nom;
    }
    public int getPro_quantite() {
        return pro_quantite;
    }
    public void setPro_quantite(int quantite) {
        this.pro_quantite = quantite;
    }
    public int getPro_marque() {
        return pro_marque;
    }
    public void setPro_marque(int marque) {
        this.pro_marque = marque;
    }
    public int getPro_nova() {
        return pro_nova;
    }
    public void setPro_nova(int nova) {
        this.pro_nova = nova;
    }
    public int getPro_nutriscore() {
        return pro_nutriscore;
    }
    public void setPro_nutriscore(int nutriscore) {
        this.pro_nutriscore = nutriscore;
    }
    public String getPro_denomination() {
        return pro_denomination;
    }
    public void setPro_denomination(String denomination) {
        this.pro_denomination = denomination;
    }
    public String getPro_lien() {
        return pro_lien;
    }
    public void setPro_lien(String lien) {
        this.pro_lien = lien;
    }
} // class Produit

