package com.ted.test;

import java.awt.Image;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ted.controller.PostController;
import com.ted.controller.UserController;
import com.ted.model.Post;
import com.ted.model.User;

public class Test1 {
public static void main(String[] args) {
	
	//Prueba insertar usuario sin foto
	User usuario = new User("cristo", "suarez", "admync@gmail.com", "cristorio", java.sql.Timestamp.valueOf(LocalDateTime.now()), 0);
	UserController controladorU = new UserController();
	
	
	//Prueba con imagen
	//llamamos al archivo por la ruta
//	File imagen = new File("/ProyectoTablon/src/a2913619151_16.jpg");
//	
//	User usuario2 = new User("pepin", "peponcio", "pepitin@gmail.com", "pepon",imagen, java.sql.Timestamp.valueOf(LocalDateTime.now()), 0);
//	controladorU.insert(usuario2);
	
	List<User> lista =controladorU.verUsers();
	
	System.out.println(usuario.getID());
	System.out.println("****");
	System.out.println(lista);

	//Prueba insertar post sin foto
	Post post = new Post(lista.get(0), java.sql.Timestamp.valueOf(LocalDateTime.now()), 400, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrystandard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	PostController postController = new PostController();
	
	postController.insert(post);


}
}
