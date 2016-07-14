<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Turno</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/TpGrupo3Softtek/views/css/turnoAdd.css ">

</head>
<body>
	<h1>Editar Turno</h1>
	<form action="editTurno/updateTurno" >
		<input id="userIdHidden" name="turnoDTO.nroTurn" type="hidden" value='<s:property value="turnoDTO.nroTurn" />'>
		<input name="turnoDTO.prestador" type="hidden" value='<s:property value="turnoDTO.prestador" />'>
		<input name="turnoDTO.practica" type="hidden" value='<s:property value="turnoDTO.practica" />'>
		Fecha de Inicio:<input type="text" name="turnoDTO.fechaInicio" value='<s:property value="turnoDTO.fechaInicio" />'><br>
		Fecha de llegada:<input type="text" name="turnoDTO.fechaLlegada" value='<s:property value="turnoDTO.fechaLlegada" />'><br>
		Importe:<input type="text" name="turnoDTO.importe" value='<s:property value="turnoDTO.importe" />'><br>
		Comentarios:<input type="text" name="turnoDTO.observaciones" value='<s:property value="turnoDTO.observaciones" />'><br>



		<button id="botonCrearTurno" type="submit">Guardar</button>
	</form>

</body>
</html>