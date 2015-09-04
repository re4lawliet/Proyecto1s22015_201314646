<%-- 
    Document   : MostrarAdministradores
    Created on : 3/09/2015, 09:44:12 PM
    Author     : carlos
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
            <h2>Tabla De Administradores</h2>
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
                
                <h3><font color="yellow">OPCIONES ADMINISTRADORES:</font></h3>
                        
                <ul>
                    <li><a href="MostrarAdministradores.jsp">Tabla De Administradores</a></li>
                    <li><a href="CrearUsuarioAdministrador.jsp">Crear Administradores</a></li>
                    <li><a href="ModificarUsuarioAdministrador.jsp">Modificar Administradores</a></li>
                    <li><a href="EliminarUsuarioAdministrador.jsp">Eliminar Administradores</a></li>
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	
                        
                
            <h3>Aqui Van los Administradores En TAblas :v</h3>
            <br>
            <br>
            
        ________________________________________________________________________<br>
        |..............................DATOS.....................................<br>                 
        |_______________________________________________________________________|<br> 
        |Numero.......Clave.......Correo.........Contraseña......<br>    
        |_______________________________________________________________________|<br>     
            
            
        <%
        
        try {
        
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();	
        
        int y=port.imprimirAdminRetorno().size();
        int count=0;        
        if(port.imprimirAdminRetorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getAdmin(i).toString();
         //AQui SE EScribe Para Q Imprima en la Mierda De TAbla
         
        %>  
        
        *--<%=count%>---------------<%= mensaje2%><br>
        |_______________________________________________________________________|<br>       
         <%
         count=count+1;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
    %>
            
            
            
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
