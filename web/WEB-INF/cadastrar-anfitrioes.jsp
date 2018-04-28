<%@page import="projetobuddy.Anfitriao"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% List<Anfitriao> anfitrioes = (List<Anfitriao>) request.getAttribute("anfitrioes");%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Anfitrião</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>

        <div class="container">
            <form method="post">
                <div class="form-group">
                    <label for="usr">Nome: </label>
                    <input name="nome" class="form-control" /> 
                </div>

                <div class="form-group">
                    <label for="usr">Endereco:  </label>
                    <input name="endereco" class="form-control" /> 
                </div>
                
                <div class="form-group">
                    <label for="usr">Cidade  </label>
                    <input name="cidade" class="form-control" /> 
                </div>
                
                <div class="form-group">
                    <label for="usr"> Quantidade de dias:</label>
                    <input type="number" min="0" max="15" value="1" class="form-control" name = "quantidadeDias" /> 
                </div>
                
                <div class="form-group">
                    <label for="usr"> Quantidade de pessoas</label>
                    <input type="number" min="0" max="15" value="1" class="form-control" name = "quantidadePessoas" /> 
                </div>

    
                   <input class="btn btn-primary btn-lg" type ="Submit" /> 
            </form>
        </div>
    </body>

</html>

