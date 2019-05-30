<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- Añadimos las referencias a las librerias de css y js de bootstrap -->
<%@ include file="imports.html" %>
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