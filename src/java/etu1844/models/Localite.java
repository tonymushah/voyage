/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import etu1844.utils.OffsetLimit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

/**
 *
 * @author Andra
 */
@Table(name = "localite")
public class Localite {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "nom")
    private String nom;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void insert(DBConnect con) throws Exception {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("INSERT INTO localite(nom) values ('%s')", this.getNom()));
    }
    
    public static Localite[] getLocalites(DBConnect con, Optional<OffsetLimit> ol) throws Exception {
        if (ol.isEmpty() || ol == null) {
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom FROM localite");
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Localite.class);
        } else {
            OffsetLimit ol_ = ol.get();
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom FROM localite LIMIT %d OFFSET %d", ol_.limit(), ol_.offset());
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Localite.class);
        }

    }

    public Localite(int id, String nom) {
        this.setId(id);
        this.setNom(nom);
    }

    public Localite() {
    }

    public Localite(int id) {
        this.setId(id);
    }

    public Localite(String nom) {
        this.setNom(nom);
    }
    
}
