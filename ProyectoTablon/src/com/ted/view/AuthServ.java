package com.ted.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ted.controller.UserController;
import com.ted.model.User;

/**
 * Servlet implementation class AuthServ
 */
@WebServlet("/AuthServ")
public class AuthServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public AuthServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		UserController control = new UserController();
		List<User> listauser = control.verUsers();
		// response.getWriter().print(listauser);

		for (User user : listauser) {
			if ((request.getParameter("UserEmail").equals(user.getCorreo()))) {
				if (request.getParameter("UserPassword").equals(user.getPassword())) {
					request.getRequestDispatcher("homeLoged.jsp").forward(request, response);

				} else {
					request.getRequestDispatcher("home.jsp").forward(request, response);

				}

			}
		}
	}

}
