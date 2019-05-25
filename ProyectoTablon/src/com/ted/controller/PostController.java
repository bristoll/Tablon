package com.ted.controller;

import java.util.ArrayList;
import java.util.List;

import com.ted.model.Post;
import com.ted.model.PostDAO;
import com.ted.model.PostDAOImpl;

/**
 * 
 * @author Cristo
 *
 */
public class PostController {
	public void insert (Post post) {
		PostDAO dao = new PostDAOImpl();
		//vista.verPost(post);
		dao.insert(post);
		
	}
		
	
	public void delete (Post post) {
		PostDAO dao = new PostDAOImpl();
//		vista.verPost(post);
		dao.delete(post);
		
	}
	public void verPost(){
		List<Post> posts = new ArrayList<Post>();
		PostDAO dao= new  PostDAOImpl();
		posts=dao.obtain();
//		vista.verPost(posts);//Llamamos a ver posts para mostrar el resultado
	}

	//TODO Añadir update
}
