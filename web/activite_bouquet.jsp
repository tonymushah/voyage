<%-- 
    Document   : activite_bouquet
    Created on : 19 déc. 2023, 12:17:50
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
                <h1 class="display-5 fw-bold">Activité bouquet</h1>
                <div class="p-5 mb-4 bg-light rounded-3">
                    <div class="container-fluid py-5">
                        <form action="#" method="post">
                            <label for="type">Bouquet:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="type">
                                <option selected>Open this select menu</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                            </select>

                            <label for="type">Activité:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="type">
                                <option selected>Open this select menu</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                            </select>
                            <input class="btn btn-primary" type="submit" value="Valider">
                        </form>
                    </div>
                </div>

                <footer class="pt-3 mt-4 text-muted border-top">
                    &copy; 
                </footer>
            </div>
        </main>
    </body>
</html>
