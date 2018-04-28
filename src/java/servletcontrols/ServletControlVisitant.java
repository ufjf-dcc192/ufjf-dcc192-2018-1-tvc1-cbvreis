/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletcontrols;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projetobuddy.Anfitriao;
import projetobuddy.ListaAnfitriao;
import projetobuddy.ListaVisitante;
import projetobuddy.Pessoa;
import projetobuddy.Visitante;

/**
 *
 * @author ice
 */
@WebServlet(name = "ServletControlVisitant", urlPatterns = {"/lista-visitante.html","/cadastrar-visitante.html"})
public class ServletControlVisitant extends HttpServlet {

   
     List<Visitante> visitantes = ListaVisitante.getInstance();
     List<Anfitriao> anfitrioes = ListaAnfitriao.getInstance();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         if ("/lista-visitante.html".equals(request.getServletPath())) {
            listarVisitante(request, response);

        } else if("/cadastrar-visitante.html".equals(request.getServletPath())) {
            cadastrarVisitante(request, response);
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String nome = request.getParameter("nomeVisitante");
        String pais = request.getParameter("pais");
        int quantidadeDias = Integer.parseInt(request.getParameter("quantidadeDias"));
       
        Visitante visitante = new Visitante(nome,pais,quantidadeDias);
        visitantes.add(visitante);
        
        for (int  i = 0; i< anfitrioes.size();i++){
            
            if(anfitrioes.get(i).getQuantidadeMaxPessoas()>0 && anfitrioes.get(i).getQuantidadeDias()>quantidadeDias){
            
                    anfitrioes.get(i).getVisitantes().add(visitante);
                    break;
                
                }
            
            }
        response.sendRedirect("index.html");
        
        

    }

    private void listarVisitante(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("visitantes", visitantes);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-visitantes.jsp");
        despachante.forward(request, response);
   
    }

    private void cadastrarVisitante(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setAttribute("anfitrioes", anfitrioes);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadastrar-visitantes.jsp");
        despachante.forward(request, response);   
    }

    


}
