/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.activite;

import etu1844.models.Activite;
import etu1844.servlets.PostGresInitServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ActiviteInsert extends PostGresInitServlet {

    private Activite insert(HttpServletRequest request, DBConnect con) throws Exception {
        String nom = request.getParameter("nom");
        String prix_unitaire = request.getParameter("prix_unitaire");
        Activite act = new Activite(nom, Integer.parseInt(prix_unitaire));
        try {
            act.insert(con);
        } catch (Exception e) {
            con.getConnection().rollback();
            throw e;
        }
        return act;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DBConnect con = new PostGresDefault();

        try {
            con.connect();
            try {
                Activite act = this.insert(request, con);
                con.getConnection().commit();
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1>Resultat</h1>");
                out.println(String.format("<h2>Nom: %s</h2>", act.getNom()));
                out.println(String.format("<h2>Prix Unitaire: %d</h2>", act.getPrix_unitaire()));
            } catch (Exception ex) {
                response.setContentType("text/plain");

                PrintWriter out = response.getWriter();
                out.println(ex.getMessage());
                for (StackTraceElement e : ex.getStackTrace()) {
                    out.println(e.toString());
                }
            }finally{
                con.close();
            }
        } catch (Exception ex) {
            response.setContentType("text/plain");

            PrintWriter out = response.getWriter();
            out.println(ex.getMessage());
            for (StackTraceElement e : ex.getStackTrace()) {
                out.println(e.toString());
            }
        }

    }
}
