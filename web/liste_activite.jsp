<%-- 
    Document   : liste_activite
    Created on : 19 déc. 2023, 12:23:02
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
                    <h1 class="display-5 fw-bold">Liste activité</h1>
                    <div class="container-fluid py-5">
                        <label for="bouquet">Bouquets:</label>
                        <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="bouquet">
                            <option selected>choix</option>
                            <option value="1">One</option>
                            <option value="2">Two</option>
                            <option value="3">Three</option>
                        </select>

                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">id</th>
                                    <th scope="col">Nom</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    Object[] col = new Object[1];
                                    for (Object elem : col) {%>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
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
