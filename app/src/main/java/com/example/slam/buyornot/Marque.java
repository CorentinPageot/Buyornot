package com.example.slam.buyornot;

public class Marque {
    private int mar_id;
    private String mar_libelle;

    // Constructeur
    public Marque(int id,String libelle) {
        this.mar_id=id;
        this.mar_libelle=libelle;
    }
    public int getMar_id() {
        return mar_id;
    }
    public void setMar_id(int id) {
        this.mar_id = id;
    }
    public String getMar_libelle() {
        return mar_libelle;
    }
    public void setMar_libelle(String libelle) {
        this.mar_libelle = libelle;
    }
} // class Marque
