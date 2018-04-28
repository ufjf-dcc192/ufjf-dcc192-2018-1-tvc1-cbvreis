<%@page import="projetobuddy.Visitante"%>
<%@page import="projetobuddy.Anfitriao"%>
<%@page import="projetobuddy.Pessoa"%>
<%@page import="java.util.List"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Visitante> visitantes = (List<Visitante>) request.getAttribute("hospedados");%>

<!DOCTYPE html>
<html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Visitantes</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <div class="container">
            <h1>Lista de Visitantes</h1>
          
            <table class="table table-striped">
                <thread >
                    <tr>
                    <th> Nome do Visitante</th>
                    <th> País</th>
                    <th> Dias no Brasil</th>
                    
                    </tr>
                </thread>
                <tbody>
    
            <% for (int i = 0; i < visitantes.size(); i++) {%>
                <tr>
                    <td> <%= visitantes.get(i).getNome() %></td>
                    <td> <%= visitantes.get(i).getPais()%></td>
                    <td> <%= visitantes.get(i).getQuantidadeDias() %></td>
                    
                 </tr>
                <%}%>
            <tbody>

            </table>
            <br/>
            <a href ="index.html" class="btn btn-primary btn-lg"> Voltar ao Menu </a>
        </div>
    </body>
</html>

