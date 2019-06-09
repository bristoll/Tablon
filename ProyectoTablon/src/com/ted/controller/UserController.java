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
 */



public class UserController {
	public boolean insert (User user) {
		UserDAO dao = new UserDAOImpl();
		//vista.verUser(user);
		boolean insertar=dao.insert(user);
		return insertar;
		
	}
		
	
	public void delete (User user) {
		UserDAO dao = new UserDAOImpl();
//		vista.verUser(user);
		dao.delete(user);
		
	}
	public List<User> verUsers(){
		List<User> users = new ArrayList<User>();
		UserDAO dao= new  UserDAOImpl();
		users=dao.obtain();
		return users;
	}

	//TODO Añadir update
}
