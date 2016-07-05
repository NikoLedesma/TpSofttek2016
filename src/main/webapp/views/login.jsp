<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>
<head>
<title>Academia Java Softtek 2016</title>
<link rel="stylesheet" type="text/css"
	href='views/css/login.css'>

</head>

<body>
	<h1>Softtek 2016 Academia Grupo3</h1>
	<s:if test="%{#parameters.error != null}">
		<div style="color: red">Invalid User</div>
	</s:if>
	<div>
		<s:form name="loginForm" action="j_spring_security_check"
			method="post">
			<h2>Ingrese Su Usuario</h2>
			<s:textfield name="username" label="Usuario" />
			<s:password name="password" label="Password" />
			<s:submit value="Login" />
		</s:form>


	</div>
</body>
</html>