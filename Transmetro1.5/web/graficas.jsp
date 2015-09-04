<%-- 
    Document   : graficas
    Created on : 4/09/2015, 01:18:19 AM
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
            <h2>Menu Administrador</h2>
        </div>    
        
        <div id="menu">
        	<ul>
            	<<li class="menuitem"><a href="MenuAdministrador.jsp">MenuAdmin</a></li>
                <li class="menuitem"><a href="www.google.com">Acerca de</a></li>
                <li class="menuitem"><a href="index.jsp">Cerrar Sesion</a></li>
                
            </ul>
        </div>
        
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">OPCIONES ADMINISTRADOR:</font></h3>
                        
                <ul>
                    <li><a href="#">Asignacion de Buses</a></li>
                    <li><a href="#">Agregar Usuarios de Estaciones</a></li>
                    </br>
                    </br>
                    <h3><font color="yellow">AdministrarUsuarios:</font></h3>                   
                    <li><a href="MostrarAdministradores.jsp">Administradores:</a></li>
                    <li><a href="CrearUsuarioEstacionClave.jsp">Estaciones Claves:</a></li>
                    <li><a href="CrearUsuarioEstacionGeneral.jsp">Estaciones Generales:</a></li>
                    <li><a href="CrearUsuarioChofer.jsp">Choferes:</a></li>
                    </br>
                    <h3><font color="yellow">Reportes:</font></h3>
                    <li><a href="#">Resumen</a></li>
                    <li><a href="graficas.jsp">Graficas</a></li>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
             	
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	boolean result = port.graficarArbolAdministrador();
	out.println("Result = "+result);
        
        if(result==true){//grafico
        String mensaje="<script language='javascript'>alert('Grafico Arbol Admin');</script>"; 
        out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        %>
        
        <h3>Arbol AvL Administradores:</h3>
        <br>
        <br>
        <IMG src="Arbol1.jpg">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        out.println(mensaje);
        
        %>
        
        <h3>Arbol AVL Administradores: </h3>
        <br>
        <br>
        <h3>Esta VAcio</h3>            
        <br>
        <br>    
            
        <%
        
        }       
    } catch (Exception ex) {
	// TODO handle custom exceptions here
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
