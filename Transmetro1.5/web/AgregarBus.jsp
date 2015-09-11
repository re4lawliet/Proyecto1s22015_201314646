<%-- 
    Document   : AgregarBus
    Created on : 5/09/2015, 09:32:28 PM
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
             	<h2> MEnu Agregar Buses:</h2>
                </br>
                </br>
                
        ________________________________________________________________________<br>
        |..............................DATOS.....................................<br>                 
        |_______________________________________________________________________|<br> 
        <br>     
            
        
               <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	java.lang.String result = port.imprimirListaBuses();
	//out.println("Result = "+result);
        %>
        
        <%= result%>
        
        <%
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
 

        |************************************************************************|<br>               

                            </br>
                            </br>
                    <h3>Ingresar Nuevo Bus</h3>
                            </br>

            <form action="AgregarBus.jsp" method="POST">
                <input type="text" name="b" value="" />
                <input type="submit" value="boton" name="boton" />
                
            </form>
            
        <%-- start web service invocation --%><hr/>
    <%
    if(request.getParameter("b")!=null){
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int arg0 = Integer.valueOf(request.getParameter("b"));
	// TODO process result here
	boolean result = port.existeBus(arg0);
	//out.println("Result = "+result);
        
        if (result==true){
            //SI EL bus Existe Tonces 
        String mensaje="<script language='javascript'>alert('Este Bus Ya Existe');</script>"; 
        out.println(mensaje);
        }else{//de lo contrario si no existe aun lo creamos
            port.agregarBus(arg0);
            response.sendRedirect("AgregarBus.jsp"); 
            String mensaje="<script language='javascript'>alert('Bus Incertado');</script>"; 
        out.println(mensaje);
        }
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }else{
        //String mensaje="<script language='javascript'>alert('Este Admin Ya Existe');</script>"; 
        //out.println(mensaje);
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
