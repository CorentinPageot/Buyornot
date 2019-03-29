package com.example.slam.buyornot;

public class Code_emballeur {
    private int cod_id;
    private String cod_libelle;

    // Constructeur
    public Code_emballeur(int id,String libelle) {
        this.cod_id=id;
        this.cod_libelle=libelle;
    }
    public int getCod_id() {
        return cod_id;
    }
    public void setCod_id(int id) {
        this.cod_id = id;
    }
    public String getCod_libelle() {
        return cod_libelle;
    }
    public void setCod_libelle(String libelle) {
        this.cod_libelle = libelle;
    }
} // class Code_emballeur
