/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.activite_bouquet;

import etu1844.models.Activite;
import etu1844.models.Bouquet;
import etu1844.servlets.PostGresInitServlet;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mg.tonymushah.dbconnection.DBConnect;
import mg.tonymushah.dbconnection.PostGresDefault;

/**
 *
 * @author Andra
 */
public class ActiviteBouquetInsert extends PostGresInitServlet {

    protected Activite[] getActivites(DBConnect con) throws Exception{
        return Activite.getActivites(con, Optional.empty());
    }
    protected Bouquet[] getBouquets(DBConnect con) throws Exception{
        return Bouquet.getBouquets(con, Optional.empty());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBConnect con = new PostGresDefault();
        try {
            con.connect();
            try{
                Activite[] acts = this.getActivites(con);
                Bouquet[] bouqs = this.getBouquets(con);
                req.setAttribute("activites", acts);
                req.setAttribute("bouquets", bouqs);
                req.getRequestDispatcher("/activite_bouquet.jsp").forward(req, resp);
            }catch(Exception ex) {
                this.handle_execption(resp, ex);
            }finally {
                con.close();
            }
        } catch (Exception ex) {
            this.handle_execption(resp, ex);
        }
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String bouquet=request.getParameter("bouquet");
        String activite=request.getParameter("activite");
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>RESULTAT</h1>");
        out.println("Bouquet:"+bouquet);
        out.println("Lieu:"+activite);
    }
}
