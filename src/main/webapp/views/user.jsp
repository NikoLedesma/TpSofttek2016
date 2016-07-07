
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/	3.3.6/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/select/1.2.0/css/select.dataTables.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

<script type="text/javascript"
	src="https://cdn.datatables.net/select/1.1.2/js/dataTables.select.min.js"></script>

<link rel="stylesheet" type="text/css" href="<s:url value="views/css/user.css"/>">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>


<body>

	<h1>Pacientes</h1>

	<h1 class="loginUser">Hello
		${pageContext.request.userPrincipal.name}</h1>
	<a href="j_spring_security_logout">Logout</a>
	<br> Nombre y apellido:
	<input id="txtNombreYApp" placeholder="Ej:Juan Perez" />
	<br>
	<input id="btnMostrarSeleccionado" type="button"
		value="mostrarSeleccionado" />
	<br>
	<input id="btnAjax" type="button" value="ajaxBuscarPorNombre">


	<div class="content">

		<div class="contentTable">
			<table id="example" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombre y Apellido</th>
						<th>Tipo</th>
						<th>Nro Documento</th>
						<th>Direccion</th>
						<th>Telèfono</th>
						<th>Mail</th>
						<th>Fecha de nacimiento</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th>Id</th>
						<th>Nombre y Apellido</th>
						<th>Tipo</th>
						<th>Nro Documento</th>
						<th>Direccion</th>
						<th>Telèfono</th>
						<th>Mail</th>
						<th>Fecha de nacimiento</th>
					</tr>
				</tfoot>
				<tbody>
				</tbody>
			</table>
		</div>

		<div class="contentIcon">
			<ul class="list-group">
				<li id="btnMinus" class="list-group-item"><span
					class="glyphicon glyphicon-minus-sign"></span></li>
				<li id="btnPlus" class="list-group-item"><span
					class="glyphicon glyphicon-plus-sign"></span></li>
				<li id="btnEdit" class="list-group-item"><span
					class="glyphicon glyphicon-edit"></span></li>
				<li id="btnFile" class="list-group-item"><span
					class="glyphicon glyphicon-file"></span></li>
			</ul>
		</div>
	</div>

	<script type="text/javascript" src="views/js/user.js"></script>

</body>
</html>