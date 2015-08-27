<%-- 
    Document   : login
    Created on : 25-ago-2015, 9:12:14
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
            <h2>Sistema Automatizado</h2>
        </div>   
        
        <div id="menu">
        	<ul>
            	<li class="menuitem"><a href="index.jsp">Inicio</a></li>
                <li class="menuitem"><a href="index.jsp">Acerca de</a></li>
                <li class="menuitem"><a href="login.jsp">IniciarSecion</a></li>
                             
            </ul>
        </div>
        
        <div id="leftmenu">

       
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	<h2> Inicio De Sesion: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
       	  <h3>Ingrese Datos:</h3>
          <br>
          <br>
          <form action="index.html" method="POST">
              <h5>Usuario:</h5>
              <input type="text" name="usuario" value="" />
              <br>
              <br>
              <h5>Contraseña:</h5>
              <input type="password" name="contraseña" value="" />
              <br>
              <br>    
              <input type="submit" value="Iniciar Sesion" />
              
          </form>

        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
