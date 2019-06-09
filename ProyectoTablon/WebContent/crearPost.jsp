<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
		<jsp:useBean id="user" class = "com.ted.model.User" scope="session"></jsp:useBean>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ include file="imports.html"%>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="headerLoged.html"%>
	<form action="CreatePostServ" method="get">
		<div class="row justify-content-center">
			<div class="form-group col-md-8">
				<div class="row justify-content-center">
					<div class="form-group col-md-5">
						<label for="tituloPost">Titulo del Post</label> <input type="text"
							class="form-control" id="tituloPost" name="tituloPost"
							placeholder=" Elige un titulo para tu Post">
					</div>
				</div>

				<label for="exampleFormControlTextarea1">Cuerpo del Post</label>
				<textarea class="form-control" id="textoPost" name="textoPost"
					rows="10"></textarea>

				<input type="file" class="form-control-file" id="imagenPost" name="imagenPost">

				<button type="submit" class="btn btn-primary" id="creaPost" name="creaPost">Crear Post</button>

			</div>


		</div>
	</form>
</body>
</html>