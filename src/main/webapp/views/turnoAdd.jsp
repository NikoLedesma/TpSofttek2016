<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Turno</title>
</head>
<body>
	<h1>Crear Turno</h1>
	<form action="addTurno/saveTurno" onsubmit="myFunction()">

		Fecha de Inicio:<input type="text" name="turnoDTO.fechaInicio"><br>
		Fecha de llegada:<input type="text" name="turnoDTO.fechaLlegada"><br>
		Prestador:<input type="text" name="turnoDTO.idPrestador"><br>
		Practica:<input type="text" name="turnoDTO.codigoPractica"><br>
		Importe:<input type="text" name="turnoDTO.importe"><br>
		Comentarios:<input type="text" name="turnoDTO.observaciones"><br>



		<button type="submit">Agregar</button>
	</form>

</body>
</html>