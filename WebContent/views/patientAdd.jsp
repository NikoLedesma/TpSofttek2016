<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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


</head>
<body>
	<h1>Create patient</h1>	
		<script type="text/javascript">

			function myFunction(){
alert("Volver a la pagina anterior");
				}

		</script>

	<form action="addPatient/save" onsubmit="myFunction()">


		nombre y apellido:<input type="text" name="afiliadoDTO.nombreApellido">
		<br> tipo de documento:<input type="text" name="afiliadoDTO.tipoDoc">
		<br> numero de documento:<input type="text"
			name="afiliadoDTO.numeroDoc"> <br> direccion:<input
			type="text" name="afiliadoDTO.direccion"> <br> telefono:<input
			type="text" name="afiliadoDTO.telefono"> <br> mail:<input
			type="text" name="afiliadoDTO.mail"> <br> fecha de
		nacimiento:<input type="text" name="afiliadoDTO.fechaNacimiento">
		<br> sexo:<input type="text" name="afiliadoDTO.sexo"> <br>

		estado civil:<input type="text" name="afiliadoDTO.estadoCivil">
		<br>




	<input type="submit" value="agregar afiliado">
	
	</form>
	
	<form action="turnos" value="PedirTurno"></form>
	
	
</body>
</html>