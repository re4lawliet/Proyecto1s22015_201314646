<%-- 
    Document   : EliminarUsuarioChofer
    Created on : 25-ago-2015, 13:07:29
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
            <h2>Menu Eliminar Chofer</h2>
        </div>    
        
        <div id="menu">
        	<ul>
            	<li class="menuitem"><a href="MenuAdministrador.jsp">MenuAdmin</a></li>
                <li class="menuitem"><a href="www.google.com">Acerca de</a></li>
                <li class="menuitem"><a href="index.jsp">Cerrar Sesion</a></li>
            </ul>
        </div>
        
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">OPCIONES ADMINISTRADORES:</font></h3>
                        
                <ul>
                    <li><a href="CrearUsuarioChofer.jsp">Crear Chofer</a></li>
                    <li><a href="ModificarUsuarioChofer.jsp">Modificar Chofer</a></li>
                    <li><a href="EliminarUsuarioChofer.jsp">Eliminar Chofer</a></li>
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	<h2>Eliminar Usuario Chofer: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="lol" method="POST">
                        <br>
                      <h5>Seleccione El Que desea Eliminar: </h5> 
                      <br>
                      <select name="ListaAdmins">
                          <option>admin1</option>
                          <option>admin2</option>
                      </select>
                      <br>
                      <br>    
                          <input type="submit" value="ELIMINAR" />
                      
                    </form>
                    
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

