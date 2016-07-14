/**
 * 
 */

var tableTurnos;
$(document).ready(function() {
	tableTurnos = $('#exampleTurnos').DataTable({
		"lengthChange" : false,
		select : true,
		keys : true
	});
	$("#contentTurnos").hide();
});

var table;
var tableTurnos;
$(document)
		.ready(
				function() {
					table = $('#example').DataTable({
						"lengthChange" : false,
						select : true,
						keys : true
					});

					table
							.off("select")
							.on(
									"select",
									function(e, dt, type, indexes) {
										console.log(e, dt, type, indexes);// el
																			// indexes
																			// indica
																			// el
																			// indice
																			// de
																			// la
																			// fila
																			// seleccionada
										var rowData = table.rows(indexes)
												.data().toArray();
										var json = JSON.stringify(rowData)
										person = {
											name : rowData[0][0],
											position : rowData[0][1],
											office : rowData[0][2],
											age : rowData[0][3],
											date : rowData[0][4],
											salary : rowData[0][5]
										}
										console.log(e, dt, type, indexes);
										console.log(person.name,
												person.position, person.office,
												person.age, person.date,
												person.salary);// muestra el
																// turno
										$("#contentTurnos").show();
										// ACA va la consulta ajax
										var y = table.rows('.selected').data();
										$
												.ajax({
													url : "http://localhost:8080/TpGrupo3Softtek/user/traerTurnos",
													dataType : 'JSON',
													type : "POST",
													data : {
														'turnoDTO.idAfiliado' : y[0][0]
													},
													success : function(data) {

														$
																.each(
																		data,
																		function(
																				index) {
																			var xx = [
																					data[index].nroTurn,
																					data[index].afiliado.nombreApellido,
																					data[index].afiliado.id,
																					data[index].afiliado.plan.id ];
																			$(
																					'#exampleTurnos')
																					.dataTable()
																					.fnAddData(
																							xx);
																		});
														// },
														// error : function() {
														// alert("error al
														// cargar turnos");
														// }
													}
												});

									}).on('deselect',function(e, dt, type, indexes) {
										var rowData = table.rows(indexes)
												.data().toArray();
										$("#contentTurnos").hide();
									});

					$('#btnMostrarSeleccionado')
							.click(
									function() {
										var x = table.rows('.selected').data();// me
																				// devuelve
																				// el
																				// array
																				// con
										// todos los seleccionados
										console.log(x.length
												+ 'row(s) selected');
										if (x.length > 0) {
											alert("id:" + x[0][0]
													+ "  nombre y apellido:"
													+ x[0][1]);
										} else {
											alert("se necesita seleccionar algun afiliado");
										}

									});

				});

$("#btnMinus").click(function() {
	// TODO: cambiar a borrar
	// alert("Delete an patient");
	var arr = table.rows('.selected').data();
	console.log(arr.length + 'row(s) selected');
	if (arr.length > 0) {

	} else {
		alert("se necesita seleccionar algun afiliado");
	}
	var r = confirm("Esta seguro que desea dar de baja el usuario?");
	if (r == true) {

		$.ajax({
			url : "http://localhost:8080/TpGrupo3Softtek/user/bajaPatient",
			dataType : 'JSON',
			type : "POST",
			data : {
				'afiliadoDTO.id' : arr[0][0]
			},
			success : function(data) {
				alert("ok");
			},
			error : function() {
				alert("error");
			}
		});
		table.row('.selected').remove().draw(false);
	}
	return false;
});

$("#btnPlus").click(function() {
	var url = 'user/addPatient';
	window.location.href = url;
	return false;
});

$("#btnEdit").click(function() {
	var arr = table.rows('.selected').data();
	var url = 'user/editPatient';
	console.log(arr.length + 'row(s) selected');
	if (arr.length > 0) {
		alert(arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3]);
		$("#id").val(arr[0][0]);
		$("#nombreApellido").val(arr[0][1]);
		$("#tipoDoc").val(arr[0][2]);
		$("#numeroDoc").val(arr[0][3]);
		$("#direccion").val(arr[0][4]);
		$("#telefono").val(arr[0][5]);
		$("#mail").val(arr[0][6]);
		$("#fechaNacimiento").val(arr[0][7]);
		$("#target").submit();
	} else {
		alert("se necesita seleccionar algun afiliado");
	}
	return false;
});
// se define el evento para el btnFile

$("#btnFile").click(function() {

	alert("download an pdf");
});

$("#btnAjax").click(
		function() {
			table.clear().draw();
			$.ajax({
				url : "http://localhost:8080/TpGrupo3Softtek/user/ajaxRQS",
				dataType : 'JSON',
				type : "POST",
				data : {
					'afiliadoDTO.nombreApellido' : $('#txtNombreYApp').val(),
					'afiliadoDTO.numeroDoc' : $('#txtNumeroDoc').val(),
					'afiliadoDTO.plan' : $('#txtPlan').val(),
					'afiliadoDTO.id' : $('#txtNumeroUsuario').val()
				},
				success : function(data) {

					$.each(data,
							function(index) {
								var xx = [ data[index].id,
										data[index].nombreApellido,
										data[index].tipoDoc,
										data[index].numeroDoc,
										data[index].direccion,
										data[index].telefono, data[index].mail,
										data[index].fechaNacimiento ];
								$('#example').dataTable().fnAddData(xx);
							});
				},
				error : function() {
					alert("error");
				}
			});
		});

$("#btnMinusTurno").click(function() {
	// TODO: cambiar a borrar
	alert("Delete el turno");
	// var url= 'user/addTurno';
	// window.location.href =url;
	// return false;
});
// se define el evento para el btnPlus

//$("#botonCrearTurno").click(function() {
//	var arr = table.rows('.selected').data();// me devuelve el array con
//	var url = 'addTurno/saveTurno';
//	window.location.href = url;
//	return false;
//});

$("#btnPlusTurno").click(function() {
	var arr = table.rows('.selected').data();// me devuelve el array con
alert(arr[0][0]);						// todos los seleccionado	
	$('#idAfiliadoTurno').val(arr[0][0]);
	$("#targetTurnos").submit();	
	return false;
});
// se define el evento para el btnEdit

$("#btnEditTurno").click(function() {

	var arr = tableTurnos.rows('.selected').data();// me devuelve el array con
													// todos los seleccionados
	var url = 'user/editTurno?id=';
	console.log(arr.length + 'row(s) selected');
	if (arr.length > 0) {
		url = url + arr[0][0];
		window.location.href = url;
	}

	else {
		alert("se necesita seleccionar algun turno para modificar");
	}
	return false;
});
