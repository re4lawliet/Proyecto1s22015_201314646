<%-- 
    Document   : MoverBuses
    Created on : 19/09/2015, 01:17:53 AM
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
                    <li><a href="MoverBuses.jsp">Agregar Usuarios de Estaciones</a></li>
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
                    <li><a href="Resumen.jsp">Resumen</a></li>
                    <li><a href="graficas.jsp">Graficas</a></li>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
             	<h2> Mover Buses :v: </h2>
                <br>
                <br>
        	Seleccione Ruta:
                </br>
                    
                <form name="boton1" action="MoverBuses.jsp" method="POST">    
                <select name="listaRutas">
                 <option value="...">...</option><br>    
                        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int arg0 = 0;
	// TODO process result here
	//java.lang.String result = port.retornarNombresDeRutas(arg0);
	
        int y=port.retornarListaRutas();
        
         for (int i=y-1; i>=0;i--){
         String x=port.retornarNombresDeRutas(i);
          %>
        
        <option value="<%= x%>"><%= x%></option><br>
        
          <%      
             
         }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>   
                </select>
                <br>               
                <br>
                <input type="submit" value="select" /><br>
                <br>
                 
        <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int arg0 = 0;
	String Ruta=request.getParameter("listaRutas");
        if(Ruta!="..."&&Ruta!=null){
        String x = port.buscarRuta(Ruta);
        //out.print(x);
        %>
        
        <%= x%>
        
          <% 
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>            
                
                        
                    </form>
                
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

