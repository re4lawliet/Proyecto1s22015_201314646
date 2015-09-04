<%-- 
    Document   : loginChofer
    Created on : 31/08/2015, 07:13:43 PM
    Author     : carlos
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

       
              <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">MENU LOGIN</font></h3>
                        
                <ul>
                    <li><a href="login.jsp">Login Administrador</a></li>
                    <li><a href="loginEstacion.jsp">Login Estacion</a></li>
                    <li><a href="loginChofer.jsp">Login Chofer</a></li>
                </ul>
</div>  
                
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
          <form action="loginChofer.jsp" method="POST">
              <h5>ID Chofer:</h5>
              <input type="text" name="id" value="id" />
              <br>
              <br>
              <h5>Contraseña:</h5>
              <input type="text" name="pass" value="pass" />
              <br>
              <br>    
              <input type="submit" value="Iniciar Sesion" />
              
          </form>
              
              <%-- start web service invocation --%><hr/>
    <%
         if (request.getParameter("id") != null){ 
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String contraseña = request.getParameter("pass");
	// TODO process result here
	boolean result = port.logearChofer(id, contraseña);
	out.println("Datos Invalidos");
        
        if(result==true){
        response.sendRedirect("MenuChofer.jsp");                
        }else{      
        String mensaje="<script language='javascript'>alert('Usuario O Contraseña Invalidos');</script>"; 
        out.println(mensaje);    
        }
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
         }
    %>
    <%-- end web service invocation --%><hr/>
    

        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
