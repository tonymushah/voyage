<%-- 
    Document   : boyage_duree_activite
    Created on : 19 déc. 2023, 12:52:02
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
                    <h1 class="display-5 fw-bold">Insertion durée</h1>
                    <div class="container-fluid py-5">
                        <form action="#" method="post">
                            <label for="voyage" >Voyage:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="voyage">
                                <option selected>choix</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                            </select>
                            <label for="duree" >Durée:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="duree">
                                <option selected>choix</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                            </select>
                            <label for="activité" >Activité:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="activité">
                                <option selected>choix</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                            </select>
                            <label for="nombre" >Nombre:</label>
                            <input class="form-control" type="number" name="nombre"  required>
                            <div class="mt-3">
                                <input class="btn btn-primary" type="submit" value="Inserer">
                            </div>    
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
