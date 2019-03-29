package com.example.slam.buyornot;

public class Label {

    private int lab_id;
    private String lab_libelle;

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
} // class Label
