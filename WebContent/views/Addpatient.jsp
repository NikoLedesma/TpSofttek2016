<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div id="contenedor">
 
<h2>Formulario de alta Patiente</h2>
 
<form method="post" action="#">
<ul>
<li class="izquierda">
  <label class="titulo" for="nombre">Nombre y apellidos <span class="requerido">*</span></label>
  <div>
    <span class="completo">
      <input id="nombre" name="nombre" value="" />
      <label for="nombre">Nombre</label>
    </span>
 
    <span class="completo">
      <input id="apellido1" name="apellido1" value="" />
      <label for="apellido1">Primer apellido</label>
    </span>
 
    <span class="completo">
      <input id="apellido2" name="apellido2" value="" />
      <label for="apellido2">Segundo apellido</label>
    </span>
  </div>
 
  <p class="ayuda">No te olvides de escribir también tu segundo apellido</p>
</li>
 
<li class="derecha">
  <label class="titulo" for="direccion">Dirección <span class="requerido">*</span></label>
 
  <div>
    <span class="completo">
      <input id="direccion" name="direccion" value="" />
      <label for="direccion">Calle, número, piso, puerta</label>
    </span>
 
  </div>
 
  <p class="ayuda">El código postal es imprescindible para poder recibir los pedidos</p>
</li>
 
<li class="izquierda">
  <label class="titulo" for="email">Email</label>
 
  <div>
    <span class="completo">
      <input id="email" name="email" value="" />
    </span>
  </div>
 
  <p class="ayuda">Asegúrate de que sea válido</p>
</li>
 
<li class="derecha">
  <label class="titulo" for="telefonofijo">Teléfono <span class="requerido">*</span></label>
 
  <div>
    <span class="mitad">
      <input id="telefonofijo" name="telefonofijo" value="" />
      <label for="telefonofijo">Fijo</label>
    </span>
 
    <span class="mitad">
      <input id="telefonomovil" name="telefonomovil" value="" />
      <label for="telefonomovil">Móvil</label>
    </span>
  </div>
 
  <p class="ayuda">Sin prefijo de país y sin espacios en blanco</p>
</li>
 
<li class="botones">
  <input id="alta" type="submit" value="Darme de alta &rarr;" />
</li>
 
</ul>
</form>
 
</div>
</body>
</html>