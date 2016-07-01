<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Afiliado</title>
</head>
<body>

<h2>La lista de los Afiliado</h2>
<table border="1">
    <tr>
        <th>Nombre&Apellido</th>
        <th>Tipo</th>
        <th>Numero Documento</th>
        <th>Direccion</th>
        <th>Telefono</th>
        <th>Mail</th>
        <th>Fecha De Nacimiento</th>
        
        
    </tr>
    <s:iterator value="list" Var= "i">
        <tr>
            <td><s:property value="users"/></td>
           
        </tr>
    </s:iterator> 
</table>

</body>
</html>