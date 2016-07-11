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
<h1>Edit patient</h1>
	<br>	
	<form action="editPatient/update">
	id de afiliado:<input type="text" name="afiliadoDTO.id" value="<s:property value="afiliadoDTO.id" />"  style="background-color: #E0E0E0 " readonly ><br>
	Nombre y apellido:<input type="text" name="afiliadoDTO.nombreApellido" value="<s:property value="afiliadoDTO.nombreApellido" />"  style="background-color: #E0E0E0 "  readonly><br>
	Tipo de documento:<input type="text" name="afiliadoDTO.tipoDoc" value="<s:property value="afiliadoDTO.tipoDoc" />" style="background-color: #E0E0E0 " readonly><br>
	Numero de documento:<input type="text" name="afiliadoDTO.numeroDoc" value="<s:property value="afiliadoDTO.numeroDoc" />"  style="background-color: #E0E0E0 " readonly><br>
	Direccion:<input type="text" name="afiliadoDTO.direccion" value="<s:property value="afiliadoDTO.direccion" />" ><br>
	Telefono:<input type="text" name="afiliadoDTO.telefono" value="<s:property value="afiliadoDTO.telefono" />" ><br>
	Mail:<input type="text" name="afiliadoDTO.mail" value="<s:property value="afiliadoDTO.mail" />" ><br>
	Fecha de nacimiento:<input type="text" name="afiliadoDTO.fechaNacimiento" value="<s:property value="afiliadoDTO.fechaNacimiento" />" ><br>
	Sexo:<input type="text" name="afiliadoDTO.sexo" value="<s:property value="afiliadoDTO.sexo" />" ><br>
	Estado civil:<input type="text" name="afiliadoDTO.estadoCivil" value="<s:property value="afiliadoDTO.estadoCivil" />" ><br>
	
		<input type="submit" value="modificar"/>
	</form>
	
</body>
</html>