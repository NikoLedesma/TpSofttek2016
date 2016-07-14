<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar un Paciente</title>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/TpGrupo3Softtek/views/css/patientAdd.css" />
<!-- <link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->

<!-- <link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"> -->
<%-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="<s:url value="views/css/????.css"/>">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> --%>
	
	<body>
	
			<h1>Agregar Paciente</h1>
			<br>

	<div class="contenedor">
		<form action="addPatient/save" onsubmit="myFunction()" method="post">

			<label>Nombre Apellido</label> <input type="text"
				name="afiliadoDTO.nombreApellido" placeholder="Nombre Apellido"required><br> 
				<label>Tipo Doc</label>  
				<select
				name="afiliadoDTO.tipoDoc">
				<option selected>  Seleccione Documento  </option>
				<option value="DNI">DNI</option>
				<option value="PASS">PASS</option>
				<option value="CUIL">CUIL</option>
				</select><br>
			<label>Numero De Documento</label> 
				<input type="text"name="afiliadoDTO.numeroDoc" placeholder="33784567" required><br>
			<label>Direccion</label> 
				<input type="text"name="afiliadoDTO.direccion" placeholder="Belgrano 100" required><br>
			<label>Telefono</label> 
				<input type="text"name="afiliadoDTO.telefono" placeholder="11-22222222" required><br>
			<label>Correo</label>
				<input type="mail" name="afiliadoDTO.mail"placeholder="juanAlbertoPerez@mail.com" required><br> 
			<label>Fecha De Nacimiento</label> 
				<input id="fecha" type="text" name="afiliadoDTO.fechaNacimiento" placeholder="02/04/2014"><br>
            
               Hombre  <input type="radio" name="afiliadoDTO.sexo" value="M" checked>
				Mujer	<input type="radio" name="afiliadoDTO.sexo" value="F"><br> 
			
			<label>Estado Civil</label> 
			<select	name="afiliadoDTO.estadoCivil">
					<option selected align="center">  Seleccione el estado civil  </option>
					<option value="viudo/a">Viudo\a</option>
					<option value="casado/a">Casado\a</option>
					<option value="soltero/a">Soltero\a</option>
					<option value="concubinato">Concubinato</option>
					<option value="Divorciado">Divorciado\a</option>
				</select><br>
				
				<s:select label="Elija el plan del paciente" 
				headerKey="-1" headerValue="Select Search Engines"
				list="planesCombo" 
				name="afiliadoDTO.plan" 
				/>
				 <input type="submit" value="Agregar">

			</form>

		</div>
	</body>
</html>