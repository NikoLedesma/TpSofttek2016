<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <!-- Latest compiled and minified CSS --> 
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" /> -->
<!-- <!-- Optional theme --> 
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"/> -->

<!-- <!-- Latest compiled and minified JavaScript -->
<%-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" > --%>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

</head>
<body>
	<script type="text/javascript">
// 		$(document).ready(function() {
// 			$('#example').DataTable();
// 		});
	</script>

	<h1>HELLO</h1>
	<s:property value="patientDTO.name" />
	<s:property value="patientDTO.lastName" />
	<br>



<!-- 	<table id="example" class="display" cellspacing="0" width="100%"> -->
<!-- 		<thead> -->
<!-- 			<tr> -->
<!-- 				<th>id</th> -->
<!-- 				<th>firstName</th> -->
<!-- 				<th>lastName</th> -->
<!-- 			</tr> -->
<!-- 		</thead> -->
<!-- 		<tfoot> -->
<!-- 			<tr> -->
<!-- 				<th>id</th> -->
<!-- 				<th>firstName</th> -->
<!-- 				<th>lastName</th> -->
<!-- 			</tr> -->
<!-- 		</tfoot> -->
<!-- 		<tbody> -->


<%-- 			<s:iterator value="list" var="user"> --%>
<!-- 				<tr> -->
<%-- 					<td><s:property value="#user.id" /></td> --%>
<%-- 					<td><s:property value="#user.FirstName" /></td> --%>
<%-- 					<td><s:property value="#user.lastName" /></td> --%>
<!-- 				</tr> -->
<%-- 			</s:iterator> --%>
<!-- 		</tbody> -->
<!-- 	</table> -->

<div class="row"> 
 
 <div class="col-sm-8" style="background-color: green">.col-sm-8</div>
  <div class="col-sm-4" style="background-color: pink">.col-sm-4</div>

</div>


</body>
</html>