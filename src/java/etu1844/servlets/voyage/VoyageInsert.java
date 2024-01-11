/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.voyage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andra
 */
public class VoyageInsert extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom=request.getParameter("nom");
        String bouquet=request.getParameter("bouquet");
        String lieu=request.getParameter("lieu");
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>RESULTAT</h1>");
        out.println("Nom:"+nom);
        out.println("Bouquet:"+bouquet);
        out.println("Lieu:"+lieu);
    }

}
