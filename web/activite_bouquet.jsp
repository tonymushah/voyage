<%-- 
    Document   : activite_bouquet
    Created on : 19 déc. 2023, 12:17:50
    Author     : Andra
--%>

<%@page import="etu1844.models.Activite"%>
<%@page import="etu1844.models.Bouquet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context_path = request.getServletContext().getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="<%= context_path%>/assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Voyage</title>
    </head>
    <body>
        <main>
            <div class="container py-4">
                <div class="p-5 mb-4 bg-light rounded-3">
                     <h1 class="display-5 fw-bold">Activité bouquet</h1>
                    <div class="container-fluid py-5">
                        <form action="<%= context_path%>/activite_bouquet/insert" method="post">
                            <label for="bouquet">Bouquet:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="bouquet">
                                <option selected>Open this select menu</option>
                                <%
                                    Bouquet[] bouqs = (Bouquet[]) request.getAttribute("bouquets");
                                    for(Bouquet bouq: bouqs) {
                                        %>
                                        <option value="<%= bouq.getId() %>"><%= bouq.getNom() %></option>
                                        <%
                                    }
                                %>
                            </select>

                            <label for="activite">Activité:</label>
                            <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="activite">
                                <option selected>Open this select menu</option>
                                <%
                                    Activite[] acts = (Activite[]) request.getAttribute("activites");
                                    for(Activite act: acts) {
                                        %>
                                        <option value="<%= act.getId() %>"><%= act.getNom() %></option>
                                        <%
                                    }
                                %>
                            </select>
                            <div class="mt-3">
                                <input class="btn btn-primary" type="submit" value="Valider">
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
