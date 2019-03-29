package com.example.slam.buyornot;

public class Magasin {
    private int mag_id;
    private String mag_libelle;

    // Constructeur
    public Magasin(int id,String libelle) {
        this.mag_id=id;
        this.mag_libelle=libelle;
    }
    public int getMag_id() {
        return mag_id;
    }
    public void setMag_id(int id) {
        this.mag_id = id;
    }
    public String getMag_libelle() {
        return mag_libelle;
    }
    public void setMag_libelle(String libelle) {
        this.mag_libelle = libelle;
    }
} // class Magasin
