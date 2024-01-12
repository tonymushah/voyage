<%-- 
    Document   : voyage
    Created on : 19 déc. 2023, 12:41:34
    Author     : Andra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div class="container py-4">
    <div class="p-5 mb-4 bg-light rounded-3">
        <h1 class="display-5 fw-bold">Insertion voyage</h1>
        <hr class="my-4" />
        <div class="container-fluid py-5">
            <form action="voyage/insert" method="post">
                <label for="nom" >Nom:</label>
                <input class="form-control" type="text" name="nom"  required>
                <label for="bouquet" >Bouquet:</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="bouquet">
                    <option selected>choix</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
                <label for="lieu" >Lieu:</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="lieu">
                    <option selected>choix</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
                <div class="mt-4 mb-4">
                    <input class="btn btn-outline-secondary" type="submit" value="Inserer">
                </div>    
            </form>
        </div>
    </div>
    <%@ include file="footer.jsp" %>

