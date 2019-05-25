package com.ted.controller;

import java.util.ArrayList;
import java.util.List;

import com.ted.model.User;
import com.ted.model.UserDAO;
import com.ted.model.UserDAOImpl;
/**
 * 
 * @author Cristo
 *
 *
 */



public class UserController {
	public void insert (User user) {
		UserDAO dao = new UserDAOImpl();
		//vista.verUser(user);
		dao.insert(user);
		
	}
		
	
	public void delete (User user) {
		UserDAO dao = new UserDAOImpl();
//		vista.verUser(user);
		dao.delete(user);
		
	}
	public void verUser(){
		List<User> users = new ArrayList<User>();
		UserDAO dao= new  UserDAOImpl();
		users=dao.obtain();
//		vista.verUser(users);//Llamamos a ver users para mostrar el resultado
	}

	//TODO Añadir update
}
