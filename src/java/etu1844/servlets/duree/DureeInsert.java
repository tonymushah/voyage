/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.duree;

import etu1844.models.Duree;
import etu1844.servlets.PostGresInitServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Andra
 */
public class DureeInsert extends PostGresInitServlet {

    protected Duree insert(HttpServletRequest request) throws Exception {
        Duree duree = new Duree(request.getParameter("nom"), Integer.parseInt(request.getParameter("debut")), Integer.parseInt(request.getParameter("fin")));
        DBConnect con = new PostGresDefault();
        con.connect();
        try {
            duree.insert(con);
            con.getConnection().commit();
        } catch (Exception ex) {
            con.getConnection().rollback();
            throw ex;
        } finally {
            con.close();
        }
        return duree;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Duree duree = this.insert(request);
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            out.println("<h1>RESULTAT</h1>");
            out.println("<p>Nom: " + duree.getNom() + "</p>");
            out.println("<p>Debut: " + duree.getDebut() + "</p>");
            out.println("<p>Fin: " + duree.getFin() + "</p>");
        } catch (Exception ex) {
            this.handle_execption(response, ex);
        }

    }

}
