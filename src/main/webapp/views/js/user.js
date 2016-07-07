/**
 * 
 */
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
	/* para usar cuando deselecciona */
	// table.off("select").on( "deselect", function( e, dt, type, indexes ) {
	// alert("holaa");
	// console.log( e, dt, type, indexes );
	// } );
	// para usar las key.focus tengo q linkear el .js ir a
	// https://datatables.net/extensions/keytable/examples/initialisation/events.html
	// table
	// .on( 'key-focus', function ( e, datatable, cell ) {
	// var rowData = datatable.row( cell.index().row ).data();
	// $('#details').html( 'Cell in '+rowData[0]+' focused' );
	// } )
	// .on( 'key-blur', function ( e, datatable, cell ) {
	// $('#details').html( 'No cell selected' );
	// } );
	$('#btnMostrarSeleccionado').click(function() {
		var x = table.rows('.selected').data();// me devuelve el array con
		// todos los seleccionados
		console.log(x.length + 'row(s) selected');
		if (x.length > 0) {
			alert("id:" + x[0][0] + "  nombre y apellido:" + x[0][1]);
		} else {
			alert("se necesita seleccionar algun afiliado");
		}

	});

});

$("#btnMinus").click(function() {
	// TODO: cambiar a borrar
	// alert("Delete an patient");
	var url = 'user/addTurno';
	window.location.href = url;
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
		alert("name:" + arr[0][0] + "  position:" + arr[0][1]);
		window.location.href = url;
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
					'afiliadoDTO.nombreApellido' : $('#txtNombreYApp').val()
				},
				success : function(data) {

					$.each(data, function(index) {
						var xx = [ data[index].id, data[index].nombreApellido,
						           data[index].tipoDoc,data[index].numeroDoc , data[index].direccion, data[index].telefono,data[index].mail, data[index].fechaNacimiento ];
						$('#example').dataTable().fnAddData(xx);
					});
				},
				error : function() {
					alert("error");
				}
			});
		});
