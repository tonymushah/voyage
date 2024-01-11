/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import etu1844.utils.OffsetLimit;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@Table(name = "duree")
public class Duree {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "debut")
    private int debut;

    @Column(name = "fin")
    private int fin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public Duree(String nom, int debut, int fin) {
        this.setNom(nom);
        this.setDebut(debut);
        this.setFin(fin);
    }

    public Duree(int id, String nom, int debut, int fin) {
        this.setId(id);
        this.setNom(nom);
        this.setDebut(debut);
        this.setFin(fin);
    }

    public void insert(DBConnect con) throws Exception {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("INSERT INTO duree(nom,debut,fin) values ('%s',%d,%d)", this.getNom(),this.getDebut(),this.getFin()));
    }
    public Duree[] getDurees(DBConnect con, Optional<OffsetLimit> ol) throws SQLException, Exception {
        if (ol.isEmpty() || ol == null) {
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom, debut, fin FROM duree");
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Duree.class);
        } else {
            OffsetLimit ol_ = ol.get();
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom, debut, fin FROM duree LIMIT %d OFFSET %d", ol_.limit(), ol_.offset());
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Duree.class);
        }
    }

    public Duree(int id) {
        this.setId(id);
    }

    public Duree() {
    }
}
