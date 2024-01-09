<%-- 
    Document   : bouquet
    Created on : 19 déc. 2023, 12:16:27
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
                    <h1 class="display-5 fw-bold">Insertion bouquet</h1>
                    <div class="container-fluid py-5">
                        <form action="bouquet/insert" method="post">
                            <label for="nom" >Nom:</label>
                            <input class="form-control" type="text" name="nom"  required>

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
