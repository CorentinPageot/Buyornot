package com.example.slam.buyornot;

public class Nova {
    private int nov_id;
    private String nov_libelle;

    // Constructeur
    public Nova(int id,String libelle) {
        this.nov_id=id;
        this.nov_libelle=libelle;
    }
    public int getNov_id() {
        return nov_id;
    }
    public void setNov_id(int id) {
        this.nov_id = id;
    }
    public String getNov_libelle() {
        return nov_libelle;
    }
    public void setNov_libelle(String libelle) {
        this.nov_libelle = libelle;
    }
} // class Nova
