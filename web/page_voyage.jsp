<%-- 
    Document   : voyage1
    Created on : 19 déc. 2023, 12:56:53
    Author     : Andra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Voyage</title>
    </head>
    <body>
        <main>
            <div class="container py-4">
                <h1 class="display-5 fw-bold">Liste activité</h1>

                <div class="p-5 mb-4 bg-light rounded-3">
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

                <footer class="pt-3 mt-4 text-muted border-top">
                    &copy; 
                </footer>
            </div>
        </main>
    </body>
</html>
