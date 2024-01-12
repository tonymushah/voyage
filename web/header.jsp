<%-- 
    Document   : header
    Created on : 12 janv. 2024, 13:27:51
    Author     : Andra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/navbar.css" rel="stylesheet">
        <title>Document</title>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light rounded" aria-label="Twelfth navbar example">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample10" aria-controls="navbarsExample10" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample10">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Voyage</a>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown" aria-expanded="false">Liste</a>
                                <ul class="dropdown-menu" aria-labelledby="dropdown10">
                                    <li><a class="dropdown-item" href="liste_activite.jsp">Activité</a></li>
                                    <li><a class="dropdown-item" href="page_voyage.jsp">Voyage</a></li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown" aria-expanded="false">Insertion</a>
                                <ul class="dropdown-menu" aria-labelledby="dropdown10">
                                    <li><a class="dropdown-item" href="activite.jsp">Activité</a></li>
                                    <li><a class="dropdown-item" href="bouquet.jsp">Bouquet</a></li>
                                    <li><a class="dropdown-item" href="Localite.jsp">Localité</a></li>
                                    <li><a class="dropdown-item" href="duree.jsp">Durée</a></li>
                                    <li><a class="dropdown-item" href="voyage.jsp">Voyage</a></li>
                                    <li><a class="dropdown-item" href="activite_bouquet.jsp">Activité & Bouquet</a></li>
                                    <li><a class="dropdown-item" href="voyage_duree_activite.jsp">Voyage & Durée & Activité</a></li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="recher_voyage_prix.jsp">Recherche voyage par prix</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

