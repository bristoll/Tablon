package com.ted.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ted.controller.PostController;
import com.ted.model.Post;

/**
 * Servlet implementation class MainServ
 * @author Cristo
 */
@WebServlet("/index.jsp")
public class MainServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PostController controlador = new PostController();
		
		List<Post> listaPost = controlador.verPost();
		String url="homeLoged.jsp";
		if(request.getSession(false)==null) {
		//Si no existe una sesion lo mandamos a la pagina para usuarios no registrados
			url="home.jsp";
		
		}
		HttpSession session = request.getSession();
		session.setAttribute("listaPost", listaPost);
		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
