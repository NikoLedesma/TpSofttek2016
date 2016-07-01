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
	<h1> Agregar Paciente</h1>	
		<script type="text/javascript">

			function myFunction(){
alert("Volver a la pagina anterior");
				}

		</script>

	<form action="addPatient/save" onsubmit="myFunction()">


		Nombre Apellido:<input type="text" name="afiliadoDTO.nombreApellido">
		<br> Tipo Doc:<input type="text" name="afiliadoDTO.tipoDoc">
		<br> Numero de Documento:<input type="text"name="afiliadoDTO.numeroDoc"> 
		<br> Direccion:<input type="text" name="afiliadoDTO.direccion">
		<br> Telefono:<input type="text" name="afiliadoDTO.telefono"> 
		<br> Mail:<input type="text" name="afiliadoDTO.mail">
		<br> Fecha de Nacimiento:<input type="text" name="afiliadoDTO.fechaNacimiento">
		<br> Sexo:<input type="radio" name="afiliadoDTO.sexo" value="M"> M <input type="radio" name="afiliadoDTO.sexo" value="F"> F<br>

		Estado Civil:<select  name="afiliadoDTO.estadoCivil">
			<option value ="viudo/a">Viudo\a</option>
			<option value="casado/a">Casado\a</option>
			<option value="soltero/a">Soltero\a</option>
			<option value="concubinato" >Concubinato</option>
			<option value="Divorciado">Divorciado\a</option>
		
		</select>
		
		
		
		
		<br>




	<input type="submit" value="Agregar">
	
	</form>
	
	
	
	
</body>
</html>