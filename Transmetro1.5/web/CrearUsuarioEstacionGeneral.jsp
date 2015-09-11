<%-- 
    Document   : CrearUsuarioEstacionGeneral
    Created on : 25-ago-2015, 12:39:27
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
            <h2>Menu Crear Estacion General</h2>
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
                    <li><a href="MostrarEstacionesGenerales.jsp">Tabla de Estaciones Generales</a></li>
                    <li><a href="CrearUsuarioEstacionGeneral.jsp">Crear EstacionGeneral</a></li>
                    <li><a href="ModificarUsuarioEstacionGeneral.jsp">Modificar EstacionGeneral</a></li>
                    <li><a href="EliminarUsuarioEstacionGeneral.jsp">Eliminar EstacionGeneral</a></li>
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	<h2>Crear Usuario de Estacion General: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="CrearUsuarioEstacionGeneral.jsp" method="POST">
                      <br>
                      <h5>Id Estacion: </h5>  
                      <br>
                      <input type="text" name="numeroidesta" value="" />      
                      <br>
                      <br>  
                      <h5>Nombre De la Estacion: </h5>  
                      <br>
                      <input type="text" name="nombreestaciongeneral" value="" />
                      <br>
                      <br>
                      <h5>Contraseña: </h5>
                      <br>
                          <input type="password" name="modestaciongeneral" value="" />
                      <br>
                      <br>
                      <input type="submit" value="CREAR" />
                      
                    </form>
                
                   <%
   if (request.getParameter("numeroidesta") != null){
    try {
        
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int clave = Integer.parseInt(request.getParameter("numeroidesta"));
        java.lang.String correo = request.getParameter("nombreestaciongeneral");
	String contraseña = request.getParameter("modestaciongeneral");
	// TODO process result here
	boolean result = port.existeEstacionGeneral(clave);
	//out.println("Datos Invalidos");
        
        if(result==true){//existe Ese Usuario
        String mensaje="<script language='javascript'>alert('Esta EstacionClave Ya Existe');</script>"; 
        out.println(mensaje);    
        }else{//no existe Tonces Insertar
        String msg=port.insertarEstacionGeneral(clave, correo, contraseña);
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
        out.println(mensaje);
        }
                
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>
                    
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
