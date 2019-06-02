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
	<form action="CrearUserServ" method="get" id="FormIns">


		<div class="form-group col-md-5">
			<label for="inputNombre">Nombre</label> <input type="text"
				class="form-control" id="inputNombre" name="inputNombre"  placeholder="Nombre">
		</div>
		<div class="form-group col-md-5">
			<label for="inputApellidos">Apellidos</label> <input type="text"
				class="form-control" id="inputApellidos" name="inputApellidos" placeholder="Apellidos">
		</div>
		<div class="form-group col-md-5">
			<label for="inputEmail">Email</label> <input type="email"
				class="form-control" id="inputEmail" name="inputEmail" placeholder="Email">
		</div>
		<div class="form-group col-md-5">
			<label for="inputPassword">Password</label> <input type="password"
				class="form-control" id="inputPassword" name="inputPassword" placeholder="Password">
		</div>

		<div class="form-group col-md-5">
			<label for="Username">Nombre de usuario</label> <input type="text"
				class="form-control" id="Username" name="Username"
				placeholder="nombre de usuario elegido">
		</div>

		<div class="form-group col-md-5">
			<label for="avatarFile">Imagen avatar</label> <input type="file"
				class="form-control-file" id="avatarFile" name="avatarFile">
		</div>

		<div class="form-group col-md-5">
			<button type="submit" class="btn btn-outline-primary">Registrarme</button>
		</div>
	</form>
</body>
</html>