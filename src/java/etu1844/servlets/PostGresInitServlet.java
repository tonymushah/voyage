/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package etu1844.servlets;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.postgresql.Driver;

/**
 *
 * @author tonymushah
 */
public abstract class PostGresInitServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException{
        if(!Driver.isRegistered()){
            try {
                Driver.register();
            } catch (SQLException ex) {
                Logger.getLogger(PostGresInitServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
}
