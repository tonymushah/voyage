/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.bouquet;

import etu1844.models.Bouquet;
import etu1844.servlets.PostGresInitServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Andra
 */
public class BouquetInsert extends PostGresInitServlet {
    protected Bouquet insert(HttpServletRequest request) throws Exception {
        DBConnect con = new PostGresDefault();
        Bouquet bouq = new Bouquet(request.getParameter("nom"));
        con.connect();
        try{
           bouq.insert(con);
           con.getConnection().commit();
        }catch(SQLException ex) {
            con.getConnection().rollback();
            throw ex;
        }finally {
            con.close();
        }
        return bouq;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Bouquet bouq = this.insert(request);
            response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>RESULTAT</h1>");
        out.println("<p>Nom: "+ bouq.getNom() + "</p>");
        }catch(Exception ex) {
            this.handle_execption(response, ex);
        }
    }
}
