<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Turno</title>
</head>
<body>
	<h1>Crear Turno</h1>
	<form action="addTurno/saveTurno" >
		<input id="userIdHidden" name="turnoDTO.idAfiliado" type="hidden" value='<s:property value="turnoDTO.idAfiliado" />'>
		Fecha de Inicio:<input type="text" name="turnoDTO.fechaInicio"><br>
		Fecha de llegada:<input type="text" name="turnoDTO.fechaLlegada"><br>
		Prestador:
		
		<s:select label="Elija el plan del usuario" 
 				headerKey="-1" headerValue="Elijan Presador" 
 				list="prestadoresCombo"  
				name="turnoDTO.prestador"  
 				/><br> 
				
		Practica:				
		
		<s:select label="Elija el plan del usuario" 
				headerKey="-1" headerValue="Elijan Practica" 
				list="practicasCombo"  
 				name="turnoDTO.practica"  
				/><br> 
		Importe:<input type="text" name="turnoDTO.importe"><br>
		Comentarios:<input type="text" name="turnoDTO.observaciones"><br>



		<button id="botonCrearTurno" type="submit">Agregar</button>
	</form>

</body>
</html>