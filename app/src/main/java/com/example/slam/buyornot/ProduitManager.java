package com.example.slam.buyornot;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ProduitManager {
    private static final String TABLE_NAME = "produit";
    public static final String KEY_ID_PRODUIT="pro_id";
    public static final String KEY_NOM_PRODUIT="pro_nom";
    public static final String KEY_QUANTITE_PRODUIT="pro_quantite";
    public static final String KEY_MARQUE_PRODUIT="pro_marque";
    public static final String KEY_NOVA_PRODUIT="pro_nova";
    public static final String KEY_NUTRISCORE_PRODUIT="pro_nutriscore";
    public static final String KEY_DENOMINATION_PRODUIT="pro_denomination";
    public static final String KEY_LIEN_PRODUIT="pro_lien";
    public static final String CREATE_TABLE_PRODUIT = "CREATE TABLE "+TABLE_NAME+ " (" +
            " "+KEY_ID_PRODUIT+" INTEGER primary key AUTOINCREMENT," +
            " "+KEY_NOM_PRODUIT+" TEXT," +
            " "+KEY_QUANTITE_PRODUIT+" INT," +
            " "+KEY_MARQUE_PRODUIT+" INT," +
            " "+KEY_NOVA_PRODUIT+" INT," +
            " "+KEY_NUTRISCORE_PRODUIT+" INT," +
            " "+KEY_DENOMINATION_PRODUIT+" TEXT," +
            " "+KEY_LIEN_PRODUIT+" TEXT" +
            ");";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;

    // Constructeur
    public ProduitManager(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }

    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }

    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }

    public long addProduit(Produit produit) {
        // Ajout d'un enregistrement dans la table

        ContentValues values = new ContentValues();
        values.put(KEY_NOM_PRODUIT, produit.getNom_produit());
        values.put(KEY_QUANTITE_PRODUIT, produit.getQuantite_produit());
        values.put(KEY_MARQUE_PRODUIT, produit.getMarque_produit());
        values.put(KEY_NOVA_PRODUIT, produit.getNova_produit());
        values.put(KEY_NUTRISCORE_PRODUIT, produit.getNutriscore_produit());
        values.put(KEY_DENOMINATION_PRODUIT, produit.getDenomination_produit());
        values.put(KEY_LIEN_PRODUIT, produit.getLien_produit());

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null,values);
    }

    public int modProduit(Produit produit) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête

        ContentValues values = new ContentValues();
        values.put(KEY_NOM_PRODUIT, produit.getNom_produit());
        values.put(KEY_QUANTITE_PRODUIT, produit.getQuantite_produit());
        values.put(KEY_MARQUE_PRODUIT, produit.getMarque_produit());
        values.put(KEY_NOVA_PRODUIT, produit.getNova_produit());
        values.put(KEY_NUTRISCORE_PRODUIT, produit.getNutriscore_produit());
        values.put(KEY_DENOMINATION_PRODUIT, produit.getDenomination_produit());
        values.put(KEY_LIEN_PRODUIT, produit.getLien_produit());

        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId_produit()+""};

        return db.update(TABLE_NAME, values, where, whereArgs);
    }

    public int supProduit(Produit produit) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon

        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId_produit()+""};

        return db.delete(TABLE_NAME, where, whereArgs); }

    public Produit getProduit(int id) {
        // Retourne le produit dont l'id est passé en paramètre

        Produit a=new Produit();

        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE "+KEY_ID_PRODUIT+"="+id, null);
        if (c.moveToFirst()) {
            a.setId_produit(c.getInt(c.getColumnIndex(KEY_ID_PRODUIT)));

            a.setNom_produit(c.getString(c.getColumnIndex(KEY_NOM_PRODUIT)));

            a.setQuantite_produit(c.getInt(c.getColumnIndex(KEY_QUANTITE_PRODUIT)));;

            a.setDenomination_produit(c.getString(c.getColumnIndex(KEY_DENOMINATION_PRODUIT)));

            a.setLien_produit(c.getString(c.getColumnIndex(KEY_LIEN_PRODUIT)));
            c.close(); }

        return a;
    }

    public Cursor getProduits() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }

} // class ProduitManager

