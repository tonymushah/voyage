/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import mg.tonymushah.dbconnection.utils.annotations.Table;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.sql.Statement;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;

/**
 *
 * @author tonymushah
 */
@Table(name = "stock_activite_billet")
public class StockActivite {

    @Column(name = "id")
    @PrimaryKey
    private int id;
    @Column(name = "id_activite")
    private int idActivite;
    @Column(name = "quantite")
    private int quantite;
    @Column(name = "prix_unitaire")
    private int prixUnitaire;
    @Column(name = "insert_date")
    private Timestamp date;

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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public StockActivite(int id) {
        this.setId(id);
    }

    public StockActivite(int idActivite, int quantite, int prixUnitaire, Timestamp date) {
        this.setIdActivite(idActivite);
        this.setQuantite(quantite);
        this.setPrixUnitaire(prixUnitaire);
        this.setDate(date);
    }

    public StockActivite(int id, int idActivite, int quantite, int prixUnitaire, Timestamp date) {
        this(id);
        this.setIdActivite(idActivite);
        this.setQuantite(quantite);
        this.setPrixUnitaire(prixUnitaire);
        this.setDate(date);
    }

    public void insert(DBConnect con) throws SQLException {
        Statement stmt = con.createStatement();
        try {
            stmt.execute(String.format("""
                                   INSERT INTO stock_activite_billet (id_activite, quantite, prix_unitaire, insert_date) VALUES
                                   (%d, %d, %d, '%s')""", this.getIdActivite(), this.getQuantite(), this.getPrixUnitaire(), this.getDate().toString()));
        } catch (SQLException ex) {
            throw ex;
        } finally {
            stmt.close();
        }

    }
}
