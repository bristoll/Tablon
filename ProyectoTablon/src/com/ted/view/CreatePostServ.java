package com.ted.view;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ted.controller.PostController;
import com.ted.controller.UserController;
import com.ted.model.Post;
import com.ted.model.User;

/**
 * Servlet implementation class CreatePostServ
 * @author Cristo
 */
@WebServlet("/CreatePostServ")
public class CreatePostServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePostServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PostController controller = new PostController();
		//Accedemos a los datos del usuario de la session, es decir recuperamos el objeto user de la sesion para poder crear el post
		
		//Para la prueba generamos un user aqui
		User usuario = new User(1, "PAco", "paquitin", "1234", "paquito@gmail.com", "paquitin", java.sql.Timestamp.valueOf(LocalDateTime.now()),0);
		
		Post post = new Post(usuario, java.sql.Timestamp.valueOf(LocalDateTime.now()), 400, request.getParameter("tituloPost"), request.getParameter("textoPost"));
		
		boolean insertar = controller.insert(post);
		System.out.println(insertar);
		if (insertar == true) {
			request.getRequestDispatcher("homeLoged.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("crearPost.jsp").forward(request, response);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
