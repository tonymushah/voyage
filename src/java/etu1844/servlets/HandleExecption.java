/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package etu1844.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tonymushah
 */
public interface HandleExecption {

    public default void handle_execption(HttpServletResponse response, Exception ex) throws IOException {
        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();
        out.println(ex.getMessage());
        for (StackTraceElement e : ex.getStackTrace()) {
            out.println(e.toString());
        }
    }
}
