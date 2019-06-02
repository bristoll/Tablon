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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UserController controller=new UserController();
		List<User> listauser = controller.verUsers();
		
		for (User usuario : listauser) {
			if (usuario.getNik().equals(request.getAttribute("user"))) {
				//error
			}else if (usuario.getCorreo().equals(request.getParameter("inputEmail"))) {
				//error
			}
			}
		User user = new User(request.getParameter("imputNombre"), request.getParameter("imputApellidos"), request.getParameter("imputEmail"), request.getParameter("Username"), java.sql.Timestamp.valueOf(LocalDateTime.now()), 0);
		request.getRequestDispatcher("registro");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
