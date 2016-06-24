<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Index</title>
</head>
<body>
	<h1>Pacientes</h1>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Nivel</th>
		</tr>

		<tr>
			<td>Ivan</td>
			<td>goren</td>
			<td>10</td>
		</tr>

		<tr>
			<td>Ivan</td>
			<td>goren</td>
			<td>10</td>
		</tr>
		<tr>
			<td>Ivan</td>
			<td>goren</td>
			<td>10</td>
		</tr>
		<tr>
			<td>Ivan</td>
			<td>goren</td>
			<td>10</td>
		</tr>
		<tr>
			<td>Ivan</td>
			<td>goren</td>
			<td>10</td>
		</tr>

	</table>

<!-- 	<br> -->
<!-- 	<form action="addPerson" method="get"> -->
<!-- 		<br> name:<input type="text" name="name"><br> -->
<!-- 		lastName:<input type="text" name="lastName"><br> <input type="submit"> -->
<!-- 	</form> -->

        <s:form action="admin/addPatient" method="get">
            <s:textfield name="patientDTO.name" label="name" />
            <s:textfield name="patientDTO.lastName" label="lastName" />
            <s:submit value="save??" />
        </s:form>


	<h1>Hello ${pageContext.request.userPrincipal.name}</h1>
	<a href="j_spring_security_logout">Logout</a>
</body>
</html>