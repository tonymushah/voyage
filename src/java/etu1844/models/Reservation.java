/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Statement;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

/**
 *
 * @author tonymushah
 */
@Table(name = "reservations")
public class Reservation {
    @Column(name = "id")
    @PrimaryKey
    private int id;
    @Column(name = "id_voyage")
    private int idVoyage;
    @Column(name = "quantite")
    private int quantite;
    @Column(name = "insert_date")
    private Timestamp date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(int idVoyage) {
        this.idVoyage = idVoyage;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Reservation(int id) {
        this.setId(id);
    }

    public Reservation(int idVoyage, int quantite, Timestamp date) {
        this.setIdVoyage(idVoyage);
        this.setQuantite(quantite);
        this.setDate(date);
    }

    public Reservation(int id, int idVoyage, int quantite, Timestamp date) {
        this(id);
        this.setIdVoyage(idVoyage);
        this.setQuantite(quantite);
        this.setDate(date);
    }

    public Reservation() {
    }
    
    public void insert(DBConnect con) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.execute(String.format("""
                                   INSERT INTO reservations (id_voyage, quantite, insert_date) VALUES
                                       (%d, %d, '%s')""", this.getIdVoyage(), this.getQuantite(), this.getDate().toString()));
    }
}
