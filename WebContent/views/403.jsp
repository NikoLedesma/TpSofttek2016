<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Denied</title>
    </head>
    <body>
        <h1>Access Denied for ${pageContext.request.userPrincipal.name}!!!</h1>
<!--         <a href="login">Back</a> -->
<%--     para hacer esto se debe usar el action    <a href= "<s:url action="login"  />" >back</a> --%>
        <a href="/TpGrupo3Softtek/login">Back</a>  
       <h1>Hello ${pageContext.request.userPrincipal.name}</h1>  
        <a href="/TpGrupo3Softtek/j_spring_security_logout">Back and Logout</a>
    </body>
</html>