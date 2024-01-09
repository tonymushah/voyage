<%-- 
    Document   : recher_voyage_prix
    Created on : 9 janv. 2024, 14:37:03
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
                <div class="p-5 mb-4 bg-light rounded-3">
                    <h1 class="display-5 fw-bold">Recherche voyage par prix</h1>
                    <div class="container-fluid py-5">
                        <form action="#" method="post">
                            <div class="row gy-3">
                                <div class="col-md-4"> 
                                    <label for="min" >Min:</label>
                                    <input class="form-control" type="number" name="min"  required>
                                </div>
                                <div class="col-md-4">
                                    <label for="max" >Max:</label>
                                    <input class="form-control" type="number" name="max"  required>
                                </div>
                                <div class="col-md-4">
                                    <div class="mt-3">
                                        <input class="btn btn-primary" type="submit" value="Rechercher">
                                    </div></div>
                            </div>
                        </form>
                        
                        
                        <div class="mt-3">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">id</th>
                                        <th scope="col">Nom</th>
                                        <th scope="col">Prix</th>
                                        <th scope="col">Durée</th>
                                        <th scope="col">Bouquet</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        Object[] col = new Object[1];
                                        for (Object elem : col) {%>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Mark</td>
                                        <td>2Ar</td>
                                        <td>2h</td>
                                        <td>book</td>

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
