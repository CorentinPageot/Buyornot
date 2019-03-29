package com.example.slam.buyornot;

public class Nutriment {
    private int nur_id;
    private String nur_libelle;

    // Constructeur
    public Nutriment(int id,String libelle) {
        this.nur_id=id;
        this.nur_libelle=libelle;
    }
    public int getNur_id() {
        return nur_id;
    }
    public void setNur_id(int id) {
        this.nur_id = id;
    }
    public String getNur_libelle() {
        return nur_libelle;
    }
    public void setNur_libelle(String libelle) {
        this.nur_libelle = libelle;
    }
} // class Nutriment
