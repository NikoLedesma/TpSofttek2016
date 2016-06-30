<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear turno</title>
</head>
<body>
	<form action="addTurno" onsubmit="myFunction()">


		comentarios<input type="text" name="turnoDTO.observaciones"><br>
		importe:<input type="text" name="turnoDTO.importe"><br>





	<input type="submit" value="agregar turno">
	
	</form>
	
</body>
</html>