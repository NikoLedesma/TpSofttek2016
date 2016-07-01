<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <body>
        <h1 style="background-color: lime;">Softtek 2016 Academia Grupo3</h1> 
        <s:if test="%{#parameters.error != null}">
            <div style="color: red">Invalid User</div>
        </s:if>
        <s:form name="loginForm" action="j_spring_security_check" method="post">
            <s:textfield name="username" label="Username"/>
            <s:password name="password" label="Password"/>
            <s:submit value="Login"/>
        </s:form>
         
    </body>
</html>