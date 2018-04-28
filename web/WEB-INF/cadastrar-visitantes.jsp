<%@page import="projetobuddy.ListaAnfitriao"%>
<%@page import="projetobuddy.Pessoa"%>
<%@page import="projetobuddy.Pessoa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar visitante</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>

        <div class="container">
            <form method="post">
                <div class="form-group">
                    <label for="usr">Nome do extrangeiro: </label>
                    <input name="nomeVisitante" class="form-control" >     
                </div>
                 <div class="form-group">
                    <label for="usr">País de origem: </label>
                    <input name="pais" class="form-control" >     
                </div>


                <div class="form-group">
                    <label for="usr"> Dias pretendidos</label>
                    <input type="number" min="0" max="15" value="1" class="form-control" name = "quantidadeDias" /> 
              </div>
                

                   <input class="btn btn-primary btn-lg" type ="Submit" /> 
            </form>
        </div>
    </body>
     
</html>
