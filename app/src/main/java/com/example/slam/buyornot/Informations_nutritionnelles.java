package com.example.slam.buyornot;

public class Informations_nutritionnelles {
    private String inu_nutriment;
    private String inu_produit;
    private int inu_quantite;
    // Constructeur
    public Informations_nutritionnelles(String nutriment,String produit, int quantite) {
        this.inu_nutriment=nutriment;
        this.inu_produit=produit;
        this.inu_quantite=quantite;
    }
    public String getInu_nutriment() {
        return inu_nutriment;
    }
    public void setInu_nutriment(String nutriment) {
        this.inu_nutriment = nutriment;
    }
    public String getInu_produit() {
        return inu_produit;
    }
    public void setInu_produit(String produit) {
        this.inu_produit = produit;
    }
    public int getInu_quantite() {
        return inu_quantite;
    }
    public void setInu_quantite(int quantite) {
        this.inu_quantite = quantite;
    }
} // class Informations_nutritionnelles

