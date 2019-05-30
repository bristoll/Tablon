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
<!-- importamos el header -->
<%@ include file="header.html" %>
		<!-- listamos los elementos de nuestra base de datos aquí -->

		<div class="row justify-content-center">

			<div class="form-group col-md-8">
				<a href="post.jsp" class="list-group-item list-group-item-action ">
					<div class="d-flex w-100 justify-content-between">
						<h5 class="mb-1">Titulo del Post 1</h5>
						<span class="badge badge-primary badge-pill">14</span>
					</div> <span class="badge ">3 days ago</span>
					<p class="mb-1">Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit
						non mi porta gravida at eget metus. Maecenas sed diam eget risus
						varius blandit.Donec id elit non mi porta gravida at eget metus.
						Maecenas sed diam eget risus varius blandit.Donec id elit non mi
						porta gravida at eget metus. Maecenas sed diam eget risus varius
						blandit.</p> <small>Usuario1</small>
				</a> <a href="#" class="list-group-item list-group-item-action">
					<div class="d-flex w-100 justify-content-between">
						<h5 class="mb-1">Titulo del Post 2</h5>
						<span class="badge badge-primary badge-pill">10</span>
					</div> <span class="badge ">3 days ago</span>
					<p class="mb-1">Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit
						non mi porta gravida at eget metus. Maecenas sed diam eget risus
						varius blandit.Donec id elit non mi porta gravida at eget metus.
						Maecenas sed diam eget risus varius blandit.Donec id elit non mi
						porta gravida at eget metus. Maecenas sed diam eget risus varius
						blandit.</p> <small class="text-muted">Usuario2</small>
				</a> <a href="#" class="list-group-item list-group-item-action">
					<div class="d-flex w-100 justify-content-between">
						<h5 class="mb-1">Titulo del Post 3</h5>
						<span class="badge badge-primary badge-pill">4</span>
					</div> <span class="badge ">3 days ago</span>
					<p class="mb-1">Donec id elit non mi porta gravida at eget
						metus. Maecenas sed diam eget risus varius blandit.Donec id elit
						non mi porta gravida at eget metus. Maecenas sed diam eget risus
						varius blandit.Donec id elit non mi porta gravida at eget metus.
						Maecenas sed diam eget risus varius blandit.Donec id elit non mi
						porta gravida at eget metus. Maecenas sed diam eget risus varius
						blandit.</p> <small class="text-muted">Usuario3</small>
				</a>
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
</body>
</html>
>
