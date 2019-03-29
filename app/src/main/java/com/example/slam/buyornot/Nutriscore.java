package com.example.slam.buyornot;

public class Nutriscore {
    private int nut_id;
    private String nut_libelle;

    // Constructeur
    public Nutriscore(int id,String libelle) {
        this.nut_id=id;
        this.nut_libelle=libelle;
    }
    public int getNut_id() {
        return nut_id;
    }
    public void setNut_id(int id) {
        this.nut_id = id;
    }
    public String getNut_libelle() {
        return nut_libelle;
    }
    public void setNut_libelle(String libelle) {
        this.nut_libelle = libelle;
    }
} // class Nutriscore
