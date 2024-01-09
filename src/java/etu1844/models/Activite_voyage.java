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
 * @author Andra
 */
@Table(name = "activite_voyage")
public class Activite_voyage {

    @Column(name = "id")
    @PrimaryKey
    private int id;

    @Column(name = "idVoyage")
    private int voyage;

    @Column(name = "idActivite")
    private int activite;

    @Column(name = "id_duree")
    private int duree;

    @Column(name = "nombre")
    private int nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoyage() {
        return voyage;
    }

    public void setVoyage(int voyage) {
        this.voyage = voyage;
    }

    public int getActivite() {
        return activite;
    }

    public void setActivite(int activite) {
        this.activite = activite;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

}
