/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1844.servlets.duree;

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
public class Duree extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom=request.getParameter("nom");
        String debut=request.getParameter("debut");
        String fin=request.getParameter("fin");
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>RESULTAT</h1>");
        out.println("Nom:"+nom);
        out.println("Debut:"+debut);
        out.println("Fin:"+fin);
    }

}
