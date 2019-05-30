<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ include file="imports.html"%>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="headerLoged.html"%>
	<form>
		<div class="row justify-content-center">
			<div class="form-group col-md-8">
				<div class="row justify-content-center">
					<div class="form-group col-md-5">
						<label for="tituloPost">Titulo del Post</label> <input type="text"
							class="form-control" id="tituloPost"
							placeholder=" Elige un titulo para tu Post">
					</div>
				</div>

				<label for="exampleFormControlTextarea1">Example textarea</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="10"></textarea>

				<input type="file" class="form-control-file" id="imagenPost">

				<button type="submit" class="btn btn-primary">Crear Post</button>

			</div>


		</div>
	</form>
</body>
</html>