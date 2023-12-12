/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package etu1844.models;

import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openide.util.Exceptions;

/**
 *
 * @author Kevin
 */
public class ActiviteTest {
    
    public ActiviteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        DBConnect dbc = new PostGresDefault();
        try {
            dbc.connect();
            System.out.println("Connected ");
        } catch (Exception e) {
        } finally {
            try {
                dbc.close();
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
