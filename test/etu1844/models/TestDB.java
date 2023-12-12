/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etu1844.models;

import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Kevin
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DBConnect dbc = new PostGresDefault();
        try {
            dbc.connect();
            System.out.println("Connected ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbc.close();
        }
    }
    
}
