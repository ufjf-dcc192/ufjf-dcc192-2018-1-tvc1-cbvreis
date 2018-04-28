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
import projetobuddy.Pessoa;

@WebServlet(name = "ServletControl", urlPatterns = {"/lista-anfitriao.html", "/cadastrar-anfitriao.html", "/visitantes-hospedagem.html"})
public class ServletControlAnfitriao extends HttpServlet {

    List<Anfitriao> anfitrioes = ListaAnfitriao.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/lista-anfitriao.html".equals(request.getServletPath())) {
            listarAnfitriao(request, response);

        } else if ("/cadastrar-anfitriao.html".equals(request.getServletPath())) {
            cadastrarAnfitriao(request, response);

        } else if ("/visitantes-hospedagem.html".equals(request.getServletPath())) {
            verHospedados(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int quantidadePessoas = Integer.parseInt(request.getParameter("quantidadePessoas"));
        int quantidadeDias = Integer.parseInt(request.getParameter("quantidadeDias"));

        String cidade = request.getParameter("cidade");
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        anfitrioes.add(new Anfitriao(nome, cidade, endereco, quantidadeDias, quantidadePessoas));
        response.sendRedirect("index.html");

    }

    private void listarAnfitriao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Anfitriao> anfitrioes = ListaAnfitriao.getInstance();
        request.setAttribute("anfitrioes", anfitrioes);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/lista-anfitrioes.jsp");
        despachante.forward(request, response);
    }

    private void cadastrarAnfitriao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Anfitriao> anfitrioes = ListaAnfitriao.getInstance();
        request.setAttribute("anfitrioes", anfitrioes);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadastrar-anfitrioes.jsp");
        despachante.forward(request, response);
    }

    private void verHospedados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));

                List<Anfitriao> anfitrioes = ListaAnfitriao.getInstance();

                
        anfitrioes.get(cod).getVisitantes();
        request.setAttribute("codigo", cod);

        request.setAttribute("anfitrioes", anfitrioes);
        request.setAttribute("hospedados", anfitrioes.get(cod).getVisitantes());
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/hospedados.jsp");
        despachante.forward(request, response);

    }
}
