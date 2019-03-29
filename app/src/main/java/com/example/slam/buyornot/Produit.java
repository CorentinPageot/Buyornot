package com.example.slam.buyornot;

import java.util.ArrayList;

public class Produit {
    private int pro_id;
    private String pro_nom;
    private int pro_quantite;
    private Marque uneMarque;
    private Nova unNova;
    private Nutriscore unNutriscore;
    private String pro_denomination;
    private String pro_lien;
    private ArrayList<Label> lesLabels;
    private ArrayList<Pays> lesPaysFabrication;
    private ArrayList<Pays> lesPaysVentes;
    private ArrayList<Conditionnement> lesConditionnements;
    private ArrayList<Origine> lesOrigines;
    private ArrayList<Code_emballeur> lesCodesEmballeurs;
    private ArrayList<Ingredient> lesIngredients;
    private ArrayList<Magasin> lesMagasins;
    private ArrayList<Categorie> lesCategories;
    private Nova nova;
    private Nutriscore nutriscore;
    private Marque marque;

    // Constructeur
    public Produit(int id,String nom,int quantite,String denomination,String lien) {
        this.pro_id=id;
        this.pro_nom=nom;
        this.pro_quantite=quantite;
        this.pro_denomination=denomination;
        this.pro_lien=lien;
    }
    public int getPro_id() {
        return pro_id;
    }
    public void setPro_id(int id) {
        this.pro_id = id;
    }
    public String getPro_Nom() {
        return pro_nom;
    }
    public void setPro_nom(String nom) {
        this.pro_nom = nom;
    }
    public int getPro_quantite() {
        return pro_quantite;
    }
    public void setPro_quantite(int quantite) {
        this.pro_quantite = quantite;
    }
    public Marque getUneMarque() {
        return uneMarque;
    }
    public void setUneMarque(Marque uneMarque) {
        this.uneMarque = uneMarque;
    }
    public Nova getUnNova() {
        return unNova;
    }
    public void setUnNova(Nova unNova) {
        this.unNova = unNova;
    }
    public Nutriscore getUnNutriscore() {
        return unNutriscore;
    }
    public void setUnNutriscore(Nutriscore unNutriscore) {
        this.unNutriscore = unNutriscore;
    }
    public String getPro_denomination() {
        return pro_denomination;
    }
    public void setPro_denomination(String denomination) {
        this.pro_denomination = denomination;
    }
    public ArrayList<Label> getLesLabels() {
        return lesLabels;
    }
    public void setLesLabels(ArrayList<Label> lesLabels) {
        this.lesLabels = lesLabels;
    }
    public void addUnLabel(Label unLabel){
        if (lesLabels == null){
            lesLabels = new ArrayList<Label>();
        }
        lesLabels.add(unLabel);
    }
    public ArrayList<Pays> getLesPaysFabrication() {
        return lesPaysFabrication;
    }
    public void setLesPaysFabrication(ArrayList<Pays> lesPaysFabrication) {
        this.lesPaysFabrication= lesPaysFabrication;
    }
    public void addUnPaysFabrication(Pays unPaysFabrication){
        if (lesPaysFabrication == null){
            lesPaysFabrication = new ArrayList<Pays>();
        }
        lesPaysFabrication.add(unPaysFabrication);
    }
    public ArrayList<Pays> getLesPaysVentes() {
        return lesPaysVentes;
    }
    public void setLesPaysVentes(ArrayList<Pays> lesPaysVentes) {
        this.lesPaysVentes = lesPaysVentes;
    }
    public void addUnPaysVente(Pays unPaysVente){
        if (lesPaysVentes == null){
            lesPaysVentes = new ArrayList<Pays>();
        }
        lesPaysVentes.add(unPaysVente);
    }
    public ArrayList<Conditionnement> getLesConditionnements() {
        return lesConditionnements;
    }
    public void setLesConditionnements(ArrayList<Conditionnement> lesConditionnements) {
        this.lesConditionnements = lesConditionnements;
    }
    public void addUnConditionnement(Conditionnement unConditionnement){
        if (lesConditionnements == null){
            lesConditionnements = new ArrayList<Conditionnement>();
        }
        lesConditionnements.add(unConditionnement);
    }
    public ArrayList<Origine> getLesOrigines() {
        return lesOrigines;
    }
    public void setLesOrigines(ArrayList<Origine> lesOrigines) {
        this.lesOrigines = lesOrigines;
    }
    public void addUneOrigine(Origine uneOrigine){
        if (lesOrigines == null){
            lesOrigines = new ArrayList<Origine>();
        }
        lesOrigines.add(uneOrigine);
    }
    public ArrayList<Code_emballeur> getLesCodesEmballeurs() {
        return lesCodesEmballeurs;
    }
    public void setLesCodesEmballeurs(ArrayList<Code_emballeur> lesCodesEmballeurs) {
        this.lesCodesEmballeurs = lesCodesEmballeurs;
    }
    public void addUnCodeEmballeur(Code_emballeur unCodeEmballeur){
        if (lesCodesEmballeurs == null){
            lesCodesEmballeurs = new ArrayList<Code_emballeur>();
        }
        lesCodesEmballeurs.add(unCodeEmballeur);
    }
    public ArrayList<Ingredient> getLesIngredients() {
        return lesIngredients;
    }
    public void setLesIngredients(ArrayList<Ingredient> lesIngredients) {
        this.lesIngredients = lesIngredients;
    }
    public void addUnIngredient(Ingredient unIngredient){
        if (lesIngredients == null){
            lesIngredients = new ArrayList<Ingredient>();
        }
        lesIngredients.add(unIngredient);
    }
    public ArrayList<Magasin> getLesMagasins() {
        return lesMagasins;
    }
    public void setLesMagasins(ArrayList<Magasin> lesMagasins) {
        this.lesMagasins = lesMagasins;
    }
    public void addUnMagasin(Magasin unMagasin){
        if (lesMagasins == null){
            lesMagasins = new ArrayList<Magasin>();
        }
        lesMagasins.add(unMagasin);
    }
    public ArrayList<Categorie> getLesCategories() {
        return lesCategories;
    }
    public void setLesCategories(ArrayList<Categorie> lesCategories) {
        this.lesCategories = lesCategories;
    }
    public void addUneCategorie(Categorie uneCategorie){
        if (lesCategories == null){
            lesCategories = new ArrayList<Categorie>();
        }
        lesCategories.add(uneCategorie);
    }

    public Nova getNova() {
        return nova;
    }

    public void setNova(Nova nova) {
        this.nova = nova;
    }

    public Nutriscore getNutriscore() {
        return nutriscore;
    }

    public void setNutriscore(Nutriscore nutriscore) {
        this.nutriscore = nutriscore;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }


} // class Produit

