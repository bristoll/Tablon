<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<jsp:useBean id="user" class = "com.ted.model.User" scope="session"></jsp:useBean>
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
				<div class="list-group">
					<a href="postLoged.jsp" class="list-group-item list-group-item-action ">
						<div class="d-flex w-100 justify-content-between">
							<h5 class="mb-1">List group item heading</h5>
							<small>3 days ago</small>
						</div>
						<p class="mb-1">Donec id elit non mi porta gravida at eget
							metus. Maecenas sed diam eget risus varius blandit.</p> <small>Donec
							id elit non mi porta.</small>
					</a> <a href="#" class="list-group-item list-group-item-action">
						<div class="d-flex w-100 justify-content-between">
							<h5 class="mb-1">List group item heading</h5>
							<small class="text-muted">3 days ago</small>
						</div>
						<p class="mb-1">Donec id elit non mi porta gravida at eget
							metus. Maecenas sed diam eget risus varius blandit.</p> <small
						class="text-muted">Donec id elit non mi porta.</small>
					</a> <a href="#" class="list-group-item list-group-item-action">
						<div class="d-flex w-100 justify-content-between">
							<h5 class="mb-1">List group item heading</h5>
							<small class="text-muted">3 days ago</small>
						</div>
						<p class="mb-1">Donec id elit non mi porta gravida at eget
							metus. Maecenas sed diam eget risus varius blandit.</p> <small
						class="text-muted">Donec id elit non mi porta.</small>
					</a>
				</div>
			</div>
		</div>
</body>
</html>