<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<jsp:useBean id="user" class = "com.ted.model.User" scope="session"></jsp:useBean>
	<%@page import="com.ted.model.Post,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ include file="imports.html"%>
<title>Mis Post</title>
</head>
<body>
	<%@ include file="headerLoged.html"%>

	<!-- Ficha del usuario con sus datos -->
	<div class="card text-center">
		<div class="card-header">
			<ul class="nav nav-tabs card-header-tabs">
				<li class="nav-item"><a class="nav-link "
					href="perfilUsuario.jsp">Mis datos</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="misPost.jsp">Mis Post</a></li>

			</ul>
		</div>
		<div class="card-body">
			<div class="row justify-content-center">
				<%
							List<Post> listaPost = (List<Post>) session.getAttribute("listaMisPost");
								System.out.println(listaPost);
								//Añadir generador de url para el href usando la url generica del post+id y luego usamos el ID para recuperar el post por id y verlo
							
							for (int i = 0; i < listaPost.size(); i++) {
								
								out.print("<div class='form-group col-md-8'>"+"<a href='#' class='list-group-item list-group-item-action '>"+"<div class='d-flex w-100 justify-content-between'>"+"<h5 class='mb-1'>"+
								listaPost.get(i).getTitulo()+"</h5>"+"<span class='badge badge-primary badge-pill'>"+listaPost.get(i).getPuntuacion()+
							"</span>"+"</div>"+"<span class='badge'>"+listaPost.get(i).getFechaCreacion() +"</span> <p class='mb-1'>"+listaPost.get(i).getTexto()+
				"</a>"+"</div>");
			} %>
			</div>
		</div>
</body>
</html>