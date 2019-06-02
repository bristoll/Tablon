package com.ted.view;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ted.controller.UserController;
import com.ted.model.User;

/**
 * Servlet implementation class CrearUserServ
 */
@WebServlet("/CrearUserServ")
public class CrearUserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearUserServ() {
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
		UserController controller = new UserController();

//		System.out.println(request.getParameter("Username"));
//		System.out.println(request.getParameter("inputEmail"));

			
			//System.out.println(request.getParameter("inputEmail").equals(usuario.getCorreo()));
			

				User user = new User(request.getParameter("inputNombre"), request.getParameter("inputApellidos"),
						request.getParameter("inputPassword"), request.getParameter("inputEmail"),
						request.getParameter("Username"), java.sql.Timestamp.valueOf(LocalDateTime.now()));
				
				boolean insertar = controller.insert(user);
				System.out.println(insertar);
				if (insertar == true) {
					request.getRequestDispatcher("registro.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("formularioInscripcion.jsp").forward(request, response);
				}

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
