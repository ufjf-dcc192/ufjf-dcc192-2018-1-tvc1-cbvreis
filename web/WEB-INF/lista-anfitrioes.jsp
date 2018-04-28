<%@page import="projetobuddy.Anfitriao"%>
<%@page import="projetobuddy.Pessoa"%>
<%@page import="java.util.List"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% List<Anfitriao> anfitrioes = (List<Anfitriao>) request.getAttribute("anfitrioes");%>

<!DOCTYPE html>
<html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Anfitriões</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <div class="container">
            <h1>Lista de Anfitriões</h1>
          
            <table class="table table-striped">
                <thread >
                    <tr>
                    <th> Nome do anfitrião</th>
                    <th> Endereço</th>
                    <th> Cidade</th>
                    <th> Quantidade de dias disponíveis</th>
                    <th> Vagas restantes</th>
                    <th> Visitantes hospedados</th>
                    </tr>
                </thread>
                <tbody>
    
            <% for (int i = 0; i < anfitrioes.size(); i++) {%>
                <tr>
                    <td> <%= anfitrioes.get(i).getNome() %></td>
                    <td> <%= anfitrioes.get(i).getEndereco() %></td>
                    <td> <%= anfitrioes.get(i).getCidade() %></td>
                    <td> <%= anfitrioes.get(i).getQuantidadeDias() %></td>
                    <td> <%= anfitrioes.get(i).getQuantidadeMaxPessoas() %></td>
                    <td> <a href="visitantes-hospedagem.html?codigo=<%= i%>"> Clique Para ver visitantes</td>
 
                </tr>
                <%}%>
            <tbody>

            </table>
            <br/>
            <a href ="index.html" class="btn btn-primary btn-lg"> Voltar ao Menu </a>
        </div>
    </body>
</html>

