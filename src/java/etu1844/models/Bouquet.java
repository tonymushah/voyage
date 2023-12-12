/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

import mg.tonymushah.dbconnection.utils.annotations.Column;
import mg.tonymushah.dbconnection.utils.annotations.PrimaryKey;
import mg.tonymushah.dbconnection.utils.annotations.Table;

/**
 *
 * @author Kevin
 */
@Table (name = "bouquet")
public class Bouquet {
    @Column(name = "id")
    @PrimaryKey
    private int id;
    @Column(name = "nom")
    private String nom;

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
    
    public Bouquet() {
        
    }
    
    public Bouquet(String nom) {
        this.setNom(nom);
    }
    
    public Bouquet(int id, String nom) {
        this.setId(id);
        this.setNom(nom);
    }
}
