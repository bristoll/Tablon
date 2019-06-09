<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<jsp:useBean id="user" class = "com.ted.model.User" scope="session"></jsp:useBean>
	<%@page import="com.ted.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- Añadimos las referencias a las librerias de css y js de bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<title>Página principal</title>
</head>
<body>
	<%@ include file="headerLoged.html" %>
	<!-- Ficha del usuario con sus datos -->
	<div class="card text-center">
		<div class="card-header">
			<ul class="nav nav-tabs card-header-tabs">
				<li class="nav-item"><a class="nav-link active" href="#">Mis
						datos</a></li>
				<li class="nav-item"><a class="nav-link" href="misPost.jsp">Mis Post</a>
				</li>

			</ul>
		</div>
		<%
		//Recogemos las variables que queremos mostrar luego
		String nik = user.getNik();
		String mail = user.getCorreo();
		String nombre=user.getNombre(); 
		int nPost = user.getNumPost();
		Date fecha = user.getFechaAlta();
		//DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
	
		%>
		<div class="card-body">
		<div class="row justify-content-center">
			<div class="card" style="width: 18rem;">
				<img src="imagenes/018-gas-mask.png" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title"><%=nik %></h5>
				</div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item"><%=mail %></li>
					<li class="list-group-item"><%=nombre %></li>
					<li class="list-group-item"><%=nPost %></li>
					<li class="list-group-item"><%=fecha %></li>
				</ul>
				<div class="card-body">
					<a href="#" class="card-link">
						<button type="button" class="btn btn-primary">Modificar
							Datos</button>
					</a>

				</div>
			</div>
</div>
		</div>
	</div>
</body>
</html>