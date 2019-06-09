package com.ted.controller;

import java.util.ArrayList;
import java.util.List;

import com.ted.model.Post;
import com.ted.model.PostDAO;
import com.ted.model.PostDAOImpl;
import com.ted.model.User;

/**
 * 
 * @author Cristo
 *
 */
public class PostController {
	public boolean insert (Post post) {
		PostDAO dao = new PostDAOImpl();
		//vista.verPost(post);
		boolean insertar = dao.insert(post);
		return insertar;
	}
		
	
	public void delete (Post post) {
		PostDAO dao = new PostDAOImpl();
//		vista.verPost(post);
		dao.delete(post);
		
	}
	public List<Post> verPost(){
		List<Post> posts = new ArrayList<Post>();
		PostDAO dao= new  PostDAOImpl();
		posts=dao.obtain();
//		vista.verPost(posts);//Llamamos a ver posts para mostrar el resultado
		return posts;
	}
	public List<Post> verMisPost(User user){
		List<Post> posts = new ArrayList<Post>();
		PostDAO dao= new  PostDAOImpl();
		posts=dao.misPost(user);
//		vista.verPost(posts);//Llamamos a ver posts para mostrar el resultado
		return posts;
	}

	//TODO Añadir update
}
