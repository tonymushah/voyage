/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etu1844.models;

import etu1844.utils.OffsetLimit;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Kevin
 */
public class TestBouquet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DBConnect dbc = new PostGresDefault();
        try {
            dbc.connect();
            System.out.println("Connected ");
            
            Bouquet bouq = new Bouquet(1);
            Activite[] activites = bouq.getActivites(dbc, new OffsetLimit(0, 2));
            
            for (Activite act : activites) {
                System.out.println(act.getNom());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbc.close();
        }
    }
    
}
