<%-- 
    Document   : AsignacionDeBuses2
    Created on : 16/09/2015, 11:08:12 PM
    Author     : carlos
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Automatización del flujo del Transmetro</title>
</head>

<body>
    <a href="MenuAdministrador.jsp"></a>
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
                    <li><a href="AsignacionDeBuses.jsp">Asignacion de Buses</a></li>
                    <li><a href="#">Agregar Usuarios de Estaciones</a></li>
                    </br>
                    <li><a href="AgregarBus.jsp">Agregar Buses</a></li>
                    <li><a href="AgregarRuta.jsp">Agregar Rutas</a></li>
                    </br>
                    </br>
                    <h3><font color="yellow">AdministrarUsuarios:</font></h3>                   
                    <li><a href="MostrarAdministradores.jsp">Administradores:</a></li>
                    <li><a href="MostrarEstacionesClave.jsp">Estaciones Claves:</a></li>
                    <li><a href="MostrarEstacionesGenerales.jsp">Estaciones Generales:</a></li>
                    <li><a href="MostrarChofer.jsp">Choferes:</a></li>
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
             	<h2> Asignacion DE Buses A Choferes Por Medio de Archivo CSV:</h2>
                </br>
                </br>
                <h4> Seleccione El ARchivo:</h4>
                </br>
                <form action="AsignacionDeBuses2.jsp">
                
                    <input type="file" name="seleccion" value="" id="seleccion"/>
                    
                    
                        <%-- start web service invocation --%><hr/>
    <% 
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	java.lang.String arg0 = request.getParameter("seleccion");
	// TODO process result here
        
        
        
        String entrada="/home/carlos/Desktop/"+arg0;
        
        if(arg0!=null){
        
	java.lang.String result = port.leerhoteles(entrada);
	out.println("Result = "+result);
        
        }else{        
        String mensaje="<script language='javascript'>alert('No Hay Archivo Cargado');</script>"; 
        out.println(mensaje);
        }
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                    
                    
                    
                    
                    <input type="submit" value="Subir" />
        
        </form>
        
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>l>
