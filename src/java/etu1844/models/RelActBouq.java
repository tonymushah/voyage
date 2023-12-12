/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1844.models;

/**
 *
 * @author Kevin
 */
public class RelActBouq {
    private int id;
    private int idActivite;
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
        this.setIdBouquet(idBouquet) ;
    }
    
    
}
