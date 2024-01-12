<%-- 
    Document   : duree
    Created on : 19 déc. 2023, 12:37:22
    Author     : Andra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div class="container py-4">
    <div class="p-5 mb-4 bg-light rounded-3">
        <h1 class="display-5 fw-bold">Insertion durée</h1>
        <hr class="my-4" />
        <div class="container-fluid py-5">
            <form action="duree/insert" method="post">
                <label for="nom" >Nom:</label>
                <input class="form-control" type="text" name="nom"  required>
                <label for="debut" >Début:</label>
                <input class="form-control" type="number" name="debut"  required>
                <label for="fin" >Fin:</label>
                <input class="form-control" type="number" name="fin"  required>
                <div class="mt-4 mb-4">
                    <input class="btn btn-outline-secondary" type="submit" value="Inserer">
                </div>    
            </form>
        </div>
    </div>
    <%@ include file="footer.jsp" %>

