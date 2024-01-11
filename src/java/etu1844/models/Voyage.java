/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import java.sql.Statement;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

/**
 *
 * @author Andra
 */
@Table(name = "voyage")
public class Voyage {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "idBouquet")
    private int bouquet;

    @Column(name = "idLocalite")
    private int localite;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getBouquet() {
        return bouquet;
    }

    public int getLocalite() {
        return localite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBouquet(int bouquet) {
        this.bouquet = bouquet;
    }

    public void setLocalite(int localite) {
        this.localite = localite;
    }

    public void insert(DBConnect con) throws Exception {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("INSERT INTO voyage(nom, idBouquet,idLocalite) values ('%s', %d,%d)", this.getNom(), this.getBouquet(),this.getLocalite()));
    }
}
