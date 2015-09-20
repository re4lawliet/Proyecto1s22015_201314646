<%-- 
    Document   : MenuEstacionClave
    Created on : 25-ago-2015, 10:12:49
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
            <h2>Menu Estacion Clave</h2>
        </div>    
        
        <div id="menu">
        	<ul>
            	<<li class="menuitem"><a href="MenuEstacionClave.jsp">MenuEstacionClave</a></li>
                <li class="menuitem"><a href="www.google.com">Acerca de</a></li>
                <li class="menuitem"><a href="index.jsp">Cerrar Sesion</a></li>
            </ul>
        </div>
        
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">OPCIONES ESTACION:</font></h3>
                        
                <ul>
                    <li><a href="#">Pedir Bus</a></li>                    
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
          
            <h2>Estacion Clave : Tal</h2><br>
            <br>
            Insertar Numero De Usuarios De LA Estacion:
            <br>
            <form name="usuariosdeestacion" action="MenuEstacionClave.jsp" method="POST">
            <input type="text" name="usuarios" value="" />
            <input type="submit" value="InsertarUsuarios" />
            <br>    
                
                
            </form>
            
        
        
            
            
            
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
