<%-- 
    Document   : ModificarUsuarioEstacionClave
    Created on : 25-ago-2015, 12:26:59
    Author     : carlosmonterroso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Automatización del flujo del Transmetro</title>
</head>

<body>
<div id="container">
		<div id="header">
        	<h1>Transmetro<span class="off">Guatemala</span></h1>
            <h2>Menu Modificar Estacion Clave</h2>
        </div>    
        
        <div id="menu">
        	<ul>
            	<<li class="menuitem"><a href="MenuAdministrador.jsp">MenuAdmin</a></li>
<<<<<<< HEAD
               <li class="menuitem"><a href="www.google.com">Acerca de</a></li>
                <li class="menuitem"><a href="index.jsp">Cerrar Sesion</a></li>
=======
                <li class="menuitem"><a href="index.jsp">Acerca de</a></li>
                <li class="menuitem"><a href="">Cerrar Sesion</a></li>
                
>>>>>>> origin/master
            </ul>
        </div>
        
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">OPCIONES ADMINISTRADORES:</font></h3>
                        
                <ul>
                    <li><a href="CrearUsuarioEstacionClave.jsp">Crear EstacionClave</a></li>
                    <li><a href="ModificarUsuarioEstacionClave.jsp">Modificar EstacionClave</a></li>
                    <li><a href="EliminarUsuarioEstacionClave.jsp">Eliminar EstacionClave</a></li>
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	<h2>Modificar Usuario de EstacionClave: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="lol" method="POST">
                        <br>
                      <h5>Seleccione El Que desea Modificar: </h5> 
                      <br>
                      <select name="ListaAdmins">
                          <option>admin1</option>
                          <option>admin2</option>
                      </select>
                      <br>
                      <br>    
                     
                      <h5>Nombre de Estacion: </h5>  
                      <br>
                      <input type="text" name="correo" value="" />
                      <br>
                      <br>
                      <h5>Contraseña: </h5>
                      <br>
                      <input type="text" name="contraseña" value="" />
                      <br>
                      <br>
                      <input type="submit" value="MODIFICAR" />
                      
                    </form>
                    
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

