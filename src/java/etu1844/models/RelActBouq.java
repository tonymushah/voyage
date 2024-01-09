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
 * @author Kevin
 */
@Table(name = "rel_act_bouquet")
public class RelActBouq {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "idActivite")
    private int idActivite;

    @Column(name = "idBouquet")
    private int idBouquet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public int getIdBouquet() {
        return idBouquet;
    }

    public void setIdBouquet(int idBouquet) {
        this.idBouquet = idBouquet;
    }

    public RelActBouq() {
    }

    public RelActBouq(int id) {
        this.setId(id);
    }

    public RelActBouq(int idActivite, int idBouquet) {
        this.setIdActivite(idActivite);
        this.setIdBouquet(idBouquet);
    }

    public RelActBouq(int id, int idActivite, int idBouquet) {
        this.setId(id);
        this.setIdActivite(idActivite);
        this.setIdBouquet(idBouquet);
    }

    public void insert(DBConnect con) throws Exception {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("INSERT INTO rel_act_bouquet(idActivite,idBouquet) values (%d, %d)", this.getIdActivite(), this.getIdBouquet()));
    }

}
