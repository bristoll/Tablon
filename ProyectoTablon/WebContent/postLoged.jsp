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
<title>Página principal</title>
</head>
<body>
<header>
	<div class="list-group">

		
			<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
				<a class="navbar-brand" href="#"> <img
					src="imagenes/002-biology.png" width="30" height="30" alt="">
				</a> <a class="navbar-brand" href="#">Nombre del Sitio</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link" href="#">Inicio
								<span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Zona de usuario </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="#">Ver perfil</a> <a
									class="dropdown-item" href="#">Ver mis Posts</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="index.jsp">Cerrar sesión</a>
							</div></li>

					</ul>
					<form class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					</form>
				</div>
			</nav>
		</header>
	<div class="card text-center">
  <div class="card-header">
    <a href="#">Usuario1</a>
  </div>
  <div class="card-body">
    <h5 class="card-title">Titulo del Post</h5>
    <p class="card-text">Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.t.</p>
       
   <div class="container">
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
 <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
  <label class="form-check-label" for="inlineRadio1">3</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">4</label>
</div>
 <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
  <label class="form-check-label" for="inlineRadio1">5</label>
</div>
</div>


  </div>
  <div class="card-footer text-muted">
    3 days ago
  </div>
</div>

</body>
</html>