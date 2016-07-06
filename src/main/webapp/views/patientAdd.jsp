<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/TpGrupo3Softtek/views/css/patientAdd.css" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<%-- <link rel="stylesheet" type="text/css" href="<s:url value="views/css/????.css"/>"> --%>

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<body>
	<div id="contenedor">
		<h1>Agregar Paciente</h1>

		<script type="text/javascript">
// 			function myFunction() {
// 				var fecha = $("#fechaAux").val();
// 				alert(fecha);
// 				alert($("#fechaAux").val());
// 				var arr = fecha.split("-");
// 				$("#fecha").val(arr[2] + "/" + arr[1] + "/" + arr[0]);
// 				alert("Volver a la pagina anterior" + $("#fecha").val());
// 			}
		</script>

		<form action="addPatient/save" onsubmit="myFunction()">

			<label>Nombre Apellido</label> <input type="text"
				name="afiliadoDTO.nombreApellido" placeholder="Nombre Apellido"
				required> <label>Tipo Doc</label>  <select
				name="afiliadoDTO.tipoDoc">
				<option selected>-----Seleccione Documento------</option>
				<option value="viudo/a">DNI</option>
				<option value="casado/a">PASS</option>
				<option value="soltero/a">CUIL</option>
			<label>Numero De Documento</label> <input type="text"
				name="afiliadoDTO.numeroDoc" placeholder="33784567" required>
			<label>Direccion</label> <input type="text"
				name="afiliadoDTO.direccion" placeholder="Belgrano 100" required>
			<label>Telefono</label> <input type="text"
				name="afiliadoDTO.telefono" placeholder="11-22222222" required>
			<label>Correo</label> <input type="mail" name="afiliadoDTO.mail"
				placeholder="juanAlbertoPerez@mail.com" required> <label>Fecha
				De Nacimiento</label> 
				
<!-- 				<input id="fechaAux" type="date" placeholder="02/04/2014" required> <label>Sexo</label>  -->
				
				<input id="fecha" type="text" name="afiliadoDTO.fechaNacimiento" placeholder="02/04/2014">


			<input type="radio" name="afiliadoDTO.sexo" value="M" checked>
			Hombre <input type="radio" name="afiliadoDTO.sexo" value="F">
			Mujer<br> <label>Estado Civil</label> <select
				name="afiliadoDTO.estadoCivil">
				<option selected>-----Seleccione el estado civil------</option>
				<option value="viudo/a">Viudo\a</option>
				<option value="casado/a">Casado\a</option>
				<option value="soltero/a">Soltero\a</option>
				<option value="concubinato">Concubinato</option>
				<option value="Divorciado">Divorciado\a</option>
				
<!-- 				<label>Plan</label>  <select
				name="afiliadoDTO.plan">
				<option selected>-----Seleccione Plan------</option>
				<option value="viudo/a">201</option>
				<option value="casado/a">301</option>
				<option value="soltero/a">401</option>
				<option value="soltero/a">501</option> -->
			</select> <input type="submit" value="Agregar">

		</form>



	</div>
</body>
</html>