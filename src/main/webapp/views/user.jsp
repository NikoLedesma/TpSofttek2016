
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>

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
		<h2 align="right" lass="loginUser">Hello
		${pageContext.request.userPrincipal.name}
		<a href="j_spring_security_logout">Logout</a></h2>
	<br> 	<span>Complete los campos para efectuar una Busqueda</span><br>
			<input id="txtNombreYApp" placeholder="Ej:Juan Perez" />
			<input id="txtNumeroDoc" placeholder="Ej:11111111" />
			<input id="txtPlan" placeholder="Ej:210" value = "0" />
			<input id="txtNumeroUsuario" placeholder="Ej:1" />
		<input id="btnAjax" type="button" value="Buscar">
	<br>
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
	
	<div id="contentTurnos">
		<h1 align="center">Turnos</h1>
			<div  class="content">
				<div class="contentTable">
					<table id="exampleTurnos" class="display" cellspacing="0" width="100%">
				      <thead>
            			<tr>
               				<th>Numero de turno</th>
               				<th>NombreDelAfiliado</th>
                			<th>Numero de afiliado</th>
               				<th>Plan</th>
           				 </tr>
       				 </thead>
       				 <tfoot>
           				 <tr>
               				 <th>Numero de turno</th>
               				 <th>NombreDelAfiliado</th>
               				 <th>Numero de afiliado</th>
               				 <th>Plan</th>
           				 </tr>
       				 </tfoot>
      
					</table>
				</div>

		<div class="contentIcon">
			<ul class="list-group">
				<li id="btnMinusTurno" class="list-group-item"><span
					class="glyphicon glyphicon-minus-sign" ></span></li>
				<li id="btnPlusTurno" class="list-group-item"><span
					class="glyphicon glyphicon-plus-sign" ></span></li>
				<li id="btnEditTurno" class="list-group-item"><span
					class="glyphicon glyphicon-edit"></span></li>
					
			</ul>
		</div>
	</div>
</div>

<form class="fprimero" id="target" action="user/editPatient"  style="display:none;" method="post">
	<input id="id" 				type="hidden" name="afiliadoDTO.id" value="21185">
	<input id="nombreApellido"	type="hidden" name="afiliadoDTO.nombreApellido" value="Nicolás Ledesma">
	<input id="tipoDoc"			type="hidden" name="afiliadoDTO.tipoDoc" value="DNI">
	<input id="numeroDoc"		type="hidden" name="afiliadoDTO.numeroDoc" value="34232855">
	<input id="direccion"		type="hidden" name="afiliadoDTO.direccion" value="Av. Gral. Las Heras 2320">
	<input id="telefono"		type="hidden" name="afiliadoDTO.telefono" value="4655-4323">
	<input id="mail"			type="hidden" name="afiliadoDTO.mail" value="nikito@fbi.com">
	<input id="fechaNacimiento"	type="hidden" name="afiliadoDTO.fechaNacimiento" value="02/02/1995">	
	<input id="sexo"			type="hidden" name="afiliadoDTO.sexo" value="M">	
	<input id="estadoCivil"		type="hidden" name="afiliadoDTO.estadoCivil" value="casado/a">	
</form>

<form id="targetTurnos" action="user/addTurno"  style="display:none" method="post">
	<input id="idAfiliadoTurno" type="hidden"   name="turnoDTO.idAfiliado" value="">
</form>

<form id="targetEditarTurnos" action="user/editTurno"  style="display:none" method="post">
	<input id="editTurnoNro" type="hidden"   name="turnoDTO.nroTurn" value="">
</form>	
	
<form id="targetGenerarReporteTurnos" action="user/generateReport" style="display:none" method="post">	
	<input id = "afiliadoIdReporte" name="afiliadoDTO.id" type="hidden">
</form>
	
	<script type="text/javascript" src="views/js/user.js"></script>

</body>
</html>