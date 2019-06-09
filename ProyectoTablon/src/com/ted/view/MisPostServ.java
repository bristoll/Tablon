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
import com.ted.model.User;

/**
 * Servlet implementation class MisPostServ
 */
@WebServlet("/MisPostServ")
public class MisPostServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MisPostServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PostController controlador = new PostController();

		List<Post> listaPost = controlador.verMisPost((User)request.getSession().getAttribute("user"));
		
		String url = "misPost.jsp";
		if (request.getSession(false) == null) {
			// Si no existe una sesion lo mandamos a la pagina para usuarios no registrados
			url = "perfilUsuario.jsp";//Cambiar por pagina de error

		}
		HttpSession session = request.getSession();
		session.setAttribute("listaMisPost", listaPost);
		request.getRequestDispatcher(url).forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
