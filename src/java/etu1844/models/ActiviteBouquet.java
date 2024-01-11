/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import java.sql.SQLException;
import java.sql.Statement;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

import java.sql.Statement;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

/**
 *
 * @author Andra
 */
@Table(name = "rel_act_bouquet")
public class ActiviteBouquet {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "idbouquet")
    private int bouquet;

    @Column(name = "idactivite")
    private int activite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBouquet() {
        return bouquet;
    }

    public void setBouquet(int bouquet) {
        this.bouquet = bouquet;
    }

    public int getActivite() {
        return activite;
    }

    public void setActivite(int activite) {
        this.activite = activite;
    }

    public void insert(DBConnect con) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("INSERT INTO rel_act_bouquet(idbouquet, idactivite) values (%d,%d)", this.getBouquet(), this.getActivite()));
    }

    public ActiviteBouquet(int bouquet, int activite) {
        this.setBouquet(bouquet);
        this.setActivite(activite);
    }

    public ActiviteBouquet() {
    }

    public ActiviteBouquet(int id, int bouquet, int activite) {
        this.setId(id);
        this.setBouquet(bouquet);
        this.setActivite(activite);
    }

    public ActiviteBouquet(int id) {
        this.setId(id);
    }

}
