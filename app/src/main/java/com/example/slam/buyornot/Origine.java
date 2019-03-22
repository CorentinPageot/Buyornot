package com.example.slam.buyornot;

public class Origine {
    private int ori_id;
    private String ori_libelle;
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
} // class Origine
