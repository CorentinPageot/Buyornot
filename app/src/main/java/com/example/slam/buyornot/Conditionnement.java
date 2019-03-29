package com.example.slam.buyornot;

public class Conditionnement {
    private int con_id;
    private String con_libelle;

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
} // class Conditionnement
