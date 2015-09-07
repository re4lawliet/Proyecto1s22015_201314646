<%-- 
    Document   : CrearUsuarioEstacionClave
    Created on : 25-ago-2015, 12:22:58
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
            <h2>Menu Crear Estacion Clave</h2>
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
                    <li><a href="MostrarEstacionesClave.jsp">Tabla de Estaciones Clave</a></li>
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
        	<h2>Crear Usuario de Estacion Clave: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="CrearUsuarioEstacionClave.jsp" method="POST">
                        <br>
                      <h5>Id Estacion: </h5>  
                      <br>
                      <input type="text" name="numeroid" value="" />      
                      <br>
                      <br>  
                      <h5>Nombre De la Estacion: </h5>  
                      <br>
                      <input type="text" name="nombreestacion" value="" />
                      <br>
                      <br>
                      <h5>Contraseña: </h5>
                      <br>
                          <input type="password" name="contraestacion" value="" />
                      <br>
                      <br>
                      <input type="submit" value="CREAR" />
                      
                    </form>
                
                    <%-- start web service invocation --%><hr/>
    <%
   if (request.getParameter("numeroid") != null){
    try {
        
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int clave = Integer.parseInt(request.getParameter("numeroid"));
        java.lang.String correo = request.getParameter("nombreestacion");
	String contraseña = request.getParameter("contraestacion");
	// TODO process result here
	boolean result = port.existeEstacionClave(clave);
	//out.println("Datos Invalidos");
        
        if(result==true){//existe Ese Usuario
        String mensaje="<script language='javascript'>alert('Esta EstacionClave Ya Existe');</script>"; 
        out.println(mensaje);    
        }else{//no existe Tonces Insertar
        String msg=port.insertarEstacionClave(clave, correo, contraseña);
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
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
