<%-- 
    Document   : activite_bouquet
    Created on : 19 déc. 2023, 12:17:50
    Author     : Andra
--%>
<%@page import="etu1844.models.Activite"%>
<%@page import="etu1844.models.Bouquet"%>
<%
    String context_path = request.getServletContext().getContextPath();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div class="container py-4">
    <div class="p-5 mb-4 bg-light rounded-3">
        <h1 class="display-5 fw-bold">Activité & Bouquet</h1>
        <hr class="my-4" />

        <div class="container-fluid py-5">
            <form action="activite_bouquet/insert" method="post">
                <label for="bouquet">Bouquet:</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="bouquet">
                    <option selected>Open this select menu</option>
                    <%
                        Bouquet[] bouqs = (Bouquet[]) request.getAttribute("bouquets");
                        for (Bouquet bouq : bouqs) {
                    %>
                    <option value="<%= bouq.getId()%>"><%= bouq.getNom()%></option>
                    <%
                        }
                    %>
                </select>

                <label for="activite">Activité:</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="activite">
                    <option selected>Open this select menu</option>
                    <%
                        Activite[] acts = (Activite[]) request.getAttribute("activites");
                        for (Activite act : acts) {
                    %>
                    <option value="<%= act.getId()%>"><%= act.getNom()%></option>
                    <%
                        }
                    %>
                </select>
                <div class="mt-3">
                    <input class="btn btn-outline-secondary" type="submit" value="Valider">
                </div>
            </form>
        </div>
    </div>
    <%@ include file="footer.jsp" %>

