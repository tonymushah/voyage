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
 * @author Kevin
 */
@Table(name = "bouquet")
public class Bouquet {

    @Column(name = "id")
    @PrimaryKey
    private int id;
    @Column(name = "nom")
    private String nom;

    public int getId() {
        return id;
    }

    public Bouquet(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.setId(id);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Bouquet() {

    }

    public Bouquet(String nom) {
        this.setNom(nom);
    }

    public Bouquet(int id, String nom) {
        this.setId(id);
        this.setNom(nom);
    }

    public Activite[] getActivites(DBConnect con, OffsetLimit ol) throws SQLException, Exception {
        Statement stmt = con.getConnection().createStatement();

        String req = String.format("""
                                   SELECT act_id as id, act_nom as nom FROM v_act_rel_bouquet WHERE bouq_id = %d 
                                   LIMIT %d OFFSET %d""", this.getId(), ol.limit(), ol.offset());
        ResultSet res = stmt.executeQuery(req);
        return con.resultset_toObjects(res, Activite.class);
    }

    public static Bouquet[] getBouquets(DBConnect con, Optional<OffsetLimit> ol) throws Exception {
        if (ol.isEmpty() || ol == null) {
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom FROM bouquet");
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Bouquet.class);
        } else {
            OffsetLimit ol_ = ol.get();
            Statement stmt = con.getConnection().createStatement();

            String req = String.format("SELECT id, nom FROM bouquet LIMIT %d OFFSET %d", ol_.limit(), ol_.offset());
            ResultSet res = stmt.executeQuery(req);
            return con.resultset_toObjects(res, Bouquet.class);
        }

    }
}
