<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Displayed Successfully.</h2>
<table border="1">
    <tr>
        <th>Username</th>
        <th>Password</th>
    </tr>
    <s:iterator>
        <tr>
            <td><s:property value="users"/></td>
            <td><s:property value="passwords"/></td>
        </tr>
    </s:iterator> 
</table>

</body>
</html>