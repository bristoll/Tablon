<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@page import="com.ted.model.Post,java.util.List"%>
	<jsp:useBean id="user" class = "com.ted.model.User" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- Añadimos las referencias a las librerias de css y js de bootstrap -->
<%@ include file="imports.html" %>
<title>Página principal</title>
</head>
<body>
<!-- incluimos el header  -->
<%@ include file="headerLoged.html" %>
		<!-- listamos los elementos de nuestra base de datos aquí -->


	<div class="row justify-content-center">

		
			
<%
							List<Post> listaPost = (List<Post>) session.getAttribute("listaPost");
								
								
							
							for (int i = 0; i < listaPost.size(); i++) {
								
								out.print("<div class='form-group col-md-8'>"+"<a href='#' class='list-group-item list-group-item-action '>"+"<div class='d-flex w-100 justify-content-between'>"+"<h5 class='mb-1'>"+
								listaPost.get(i).getTitulo()+"</h5>"+"<span class='badge badge-primary badge-pill'>"+listaPost.get(i).getPuntuacion()+
							"</span>"+"</div>"+"<span class='badge'>"+listaPost.get(i).getFechaCreacion() +"</span> <p class='mb-1'>"+listaPost.get(i).getTexto()+
				"</a>"+"</div>");
			} %>
			<div class="form-group col-md-8">
				<nav aria-label="...">
					<ul class="pagination">
						<li class="page-item disabled"><a class="page-link" href="#"
							tabindex="1" aria-disabled="true"><span aria-hidden="true">&laquo;</span></a></li>
						
				<li class="page-item active"><a class="page-link" href="#">1</a></li>
				<li class="page-item "><a class="page-link" href="#">2 </a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>

				<li class="page-item"><a class="page-link" href="#"><span
						aria-hidden="true">&raquo;</span></a></li>
				</ul>
				</nav>
				</div>
		</div>

	</div>
</body>
</html>