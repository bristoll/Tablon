<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<title>Formulario de inscripción</title>
</head>
<body>
	<form action="AuthServ">
	
		<div class="form-group col-md-5">
			<label for="UserEmail">Email </label> <input
				type="email" class="form-control" id="UserEmail"
				aria-describedby="emailHelp" placeholder="Email del usuario"> 
		</div>
		<div class="form-group col-md-5">
			<label for="UserPassword">Contraseña</label> <input
				type="password" class="form-control" id="UserPassword"
				placeholder="Contraseña">
		</div>
		
		<div class="form-group col-md-5">
			<button type="submit" class="btn btn-outline-primary">Iniciar sesión</button>
		</div>
	</form>
</body>
</html>