<%-- 
    Document   : voyage1
    Created on : 19 déc. 2023, 12:56:53
    Author     : Andra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div class="container py-4">
    <div class="p-5 mb-4 bg-light rounded-3">
        <h1 class="display-5 fw-bold">Liste activité</h1>
        <hr class="my-4" />
        <div class="container-fluid py-5">
            <h2>Nom:</h2> <p> son nom </p>
            <h3>Bouquet:</h3> <p>son bouquet</p>
            <h3>Localité:</h3> <p>sa localité</p>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Activité\Durée</th>
                            <%
                                Object[] duree = new Object[1];
                                for (Object elem : duree) {%>
                        <th scope="col"> nb de durée </th>
                            <% } %>

                    </tr>
                </thead>
                <tbody>
                    <%
                        Object[] activite = new Object[1];
                        for (Object elem : activite) {%>
                    <tr>
                        <th scope="row">nb activité</th>
                        <td>content</td>
                    </tr>
                    <%  }%>
                </tbody>
            </table>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
