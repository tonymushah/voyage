/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.localite;

import etu1844.models.Localite;
import etu1844.servlets.PostGresInitServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Andra
 */
@WebServlet(name = "Localite-insert", urlPatterns = {"/Localite/insert"})
public class LocaliteInsert extends PostGresInitServlet {

    protected Localite insert(HttpServletRequest request) throws Exception {
        Localite local = new Localite(request.getParameter("nom"));
        DBConnect con = new PostGresDefault();
        con.connect();
        try {
            local.insert(con);
            con.getConnection().commit();
        } catch (Exception ex) {
            con.getConnection().rollback();
        } finally {
            con.close();
        }
        return local;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Localite local = this.insert(request);
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            out.println("<h1>RESULTAT</h1>");
            out.println("<p>Nom: " + local.getNom() + "</p>");
        } catch (Exception ex) {
            this.handle_execption(response, ex);
        }
    }

}
