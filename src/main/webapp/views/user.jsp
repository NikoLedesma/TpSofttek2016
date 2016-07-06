
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/select/1.2.0/css/select.dataTables.min.css">



<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>




<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

<script type="text/javascript"
	src="https://cdn.datatables.net/select/1.1.2/js/dataTables.select.min.js"></script>

<link rel="stylesheet" type="text/css" href="views/css/turnos.css">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


</head>
<body>

	<h1>Pacientes</h1>

	<script type="text/javascript">
		//inicializa la tabla
		var table;
		$(document).ready(function() {
			table = $('#example').DataTable({
				"lengthChange" : false,
				select : true,
				keys : true
			});

			table.off("select").on("select", function(e, dt, type, indexes) {
				console.log(e, dt, type, indexes);
			});
			/*para usar cuando deselecciona*/
			// 		    table.off("select").on( "deselect", function( e, dt, type, indexes ) {
			// 		    	alert("holaa");  
			// 		        console.log( e, dt, type, indexes );
			// 		    } );
			//para usar las key.focus tengo q linkear el .js ir a https://datatables.net/extensions/keytable/examples/initialisation/events.html
			// 		    table
			// 		    .on( 'key-focus', function ( e, datatable, cell ) {
			// 		        var rowData = datatable.row( cell.index().row ).data();
			// 		        $('#details').html( 'Cell in '+rowData[0]+' focused' );
			// 		    } )
			// 		    .on( 'key-blur', function ( e, datatable, cell ) {
			// 		        $('#details').html( 'No cell selected' );
			// 		    } );
			/////////////////
			$('#button').click(function() {
				var x = table.rows('.selected').data();//me devuelve el array con todos los seleccionados
				console.log(x.length + 'row(s) selected');
				if (x.length > 0) {
					alert("name:" + x[0][0] + "  position:" + x[0][1]);//del array agarro el primero y del primero agarro el primer,luego el segundo, etc....
				} else {
					alert("se necesita seleccionar algun afiliado");
				}

				// 		    	alert (x[0][0]);
				// 		    	console.log(x[1])

				// 		        var ids = $.map(table.rows('.selected').data(), function (item) {
				// 		            return item[0]
				// 		        });
				// 		        console.log(ids)
				// 		        alert(table.rows('.selected').data().length + ' row(s) selected');

			});

		});
	</script>



	<h1 class="loginUser">Hello
		${pageContext.request.userPrincipal.name}</h1>
	<a href="j_spring_security_logout">Logout</a>
	<div class="content">

		<div class="contentTable">
			<table id="example" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th>Id</th>
						<th>Name</th>
					</tr>
				</tfoot>
				<tbody>
					<tr>
						<td>1</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>2</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>3</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>4</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>5</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>6</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>7</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>8</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>9</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>10</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>11</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>12</td>
						<td>System Architect</td>
					</tr>
					<tr>
						<td>13</td>
						<td>System Architect</td>
					</tr>
				</tbody>
			</table>
		</div>

		<div class="contentIcon">
			<ul class="list-group">
				<li id="btnMinus" class="list-group-item"><span
					class="glyphicon glyphicon-minus-sign"></span></li>
				<li id="btnPlus" class="list-group-item"><span
					class="glyphicon glyphicon-plus-sign"></span></li>
				<li id="btnEdit" class="list-group-item"><span
					class="glyphicon glyphicon-edit"></span></li>
				<li id="btnFile" class="list-group-item"><span
					class="glyphicon glyphicon-file"></span></li>
			</ul>
		</div>
	</div>



	<br>
	<p id="details">HOLAA</p>




	<input id="button" type="button" value="show" />



	<input id="btnAjax" type="button" value="ajax">





	<script type="text/javascript">
		//se define el evento para el btnMinus
		$("#btnMinus").click(function() {
			//TODO: cambiar a borrar
			//alert("Delete an patient");
			var url = 'user/addTurno';
			window.location.href = url;
			return false;
		});
		//se define el evento para el btnPlus

		$("#btnPlus").click(function() {
			var url = 'user/addPatient';
			window.location.href = url;
			return false;
			//alert("clickeaste +");
		});
		//se define el evento para el btnEdit

		$("#btnEdit").click(function() {

			var arr = table.rows('.selected').data();//me devuelve el array con todos los seleccionados
			var url = 'user/editPatient';
			console.log(arr.length + 'row(s) selected');
			if (arr.length > 0) {
				alert("name:" + arr[0][0] + "  position:" + arr[0][1]);//del array agarro el primero y del primero agarro el primer,luego el segundo, etc....
				window.location.href = url;
			} else {
				alert("se necesita seleccionar algun afiliado");
			}
			return false;
		});
		//se define el evento para el btnFile

		$("#btnFile").click(function() {

			alert("download an pdf");
		});











		$("#btnAjax").click(function() {
			//$(this).val("pepe");
			
			table.clear().draw();

			$.ajax({
				url:"http://localhost:8080/TpGrupo3Softtek/user/ajaxRQS",
				dataType: 'JSON',
				type:"POST",
				data :{'lastName':'Ledesma'},
				success:function(data){
// 				alert(data[0].id);
// 				alert(data[0].nombreApellido);
				/*$.each(data.persons, function(key, value) {					
					var xx=[key,value];
					//	alert("id:"+key+"  "+"value:"+value);
			        });*/
				   $.each(data, function(index) {					   
						var xx=[data[index].id,data[index].nombreApellido];
						$('#example').dataTable().fnAddData(xx);					
					    });   	        
				},
				error:function(){
					alert("error");
				}				
			});
		});
		





		
	</script>




</body>
</html>