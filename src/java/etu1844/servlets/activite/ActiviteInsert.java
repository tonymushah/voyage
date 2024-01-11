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
        Activite act = new Activite(nom);
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
            } catch (Exception ex) {
                this.handle_execption(response, ex);
            }finally{
                con.close();
            }
        } catch (Exception ex) {
            this.handle_execption(response, ex);
        }

    }
}
