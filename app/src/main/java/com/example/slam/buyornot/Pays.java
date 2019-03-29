package com.example.slam.buyornot;

public class Pays {
    private int pay_id;
    private String pay_libelle;

    // Constructeur
    public Pays(int id,String libelle) {
        this.pay_id=id;
        this.pay_libelle=libelle;
    }
    public int getPay_id() {
        return pay_id;
    }
    public void setPay_id(int id) {
        this.pay_id = id;
    }
    public String getPay_libelle() {
        return pay_libelle;
    }
    public void setPay_libelle(String libelle) {
        this.pay_libelle = libelle;
    }
} // class Pays
