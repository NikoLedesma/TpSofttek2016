<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear turno</title>
</head>
<body>
	<form action="addTurno/saveTurno" onsubmit="myFunction()">
		
		Fecha de Inicio:<input type="text" name="turnoDTO.fechaInicio"><br>
		Fecha de llegada:<input type="text" name="turnoDTO.fechaLlegada"><br>
		Prestador:<input type="text" name="turnoDTO.prestadores"><br>
		Practica:<input type="text" name="turnoDTO.practica"><br>
		Importe:<input type="text" name="turnoDTO.importe"><br>
		Comentarios:<input type="text" name="turnoDTO.observaciones"><br>
		
		
	
	<button type="submit">Agregar Turno</button>
	</form>
	
</body>
</html>