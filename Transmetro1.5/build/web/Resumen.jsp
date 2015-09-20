<%-- 
    Document   : Resumen
    Created on : 17/09/2015, 11:51:20 AM
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
             	
           
        
        <h3>RESUMEN DE BUS ESPECIFICO::</h3>
        <br>
        <br>
        <form action="Resumen.jsp" method="POST" name="buses">
        <select name="listaBuses">
        <option value="...">...</option><br>    
                     <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	java.lang.String result = port.imprimirListaBusesParaAsignar();
	%>
        
        <%= result%>
        
    <%    
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                </select>
        
        <br>
        <input type="submit" value="ResumenBus" />
        <br>
        <br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>    
        :::RESUMEN BUS SELECCIONADO::::::::::::::::::::::::::::::<br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>
        <br>
        <br>
             <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
        String v=request.getParameter("listaBuses");
	int nombre = Integer.parseInt(request.getParameter("listaBuses"));
	// TODO process result here
        
        if (v!="..."){
        
	java.lang.String result = port.resumenBus(nombre);
	//out.println("Result = "+result);
        
        %>
        <%= result%>
    <%    
        
        }else{
            //nada
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
         <br>
         :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>
        </form>
         <br>
         <br>
         <h3>RESUMEN DE ChoFer ESPECIFICO::</h3>
         <br>
         <br>    
             <form name="choferes" action="Resumen.jsp" method="POST">
             <select name="listaChoferes">
             <option value="...">...</option><br>    
                                 <%
    try {servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();	
        
        int y=port.imprimirChoferREtorno().size();
        int y1=port.imprimirChoferREtorno2().size();
        int count=0;        
        if(port.imprimirChoferREtorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getChoferNombre(i).toString();
         String mensaje3=port.getChofer2(i).toString();
         //AQui SE EScribe Para Q Imprima en la Mierda De TAbla
         
        %>  
        
        <option value="<%= mensaje2%>"><%= mensaje3%></option>
               
         <%
         count=count+1;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    </select> 
        <br>
        <input type="submit" value="ResumenBus" />
        <br>
        <br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>    
        :::RESUMEN Chofer SELECCIONADO:::::::::::::::::::::::<br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>
        <br>
        <br>
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	String v=request.getParameter("listaChoferes");
	int nombre = Integer.parseInt(request.getParameter("listaChoferes"));
	// TODO process result here
	if (v!="..."){
        
	java.lang.String result = port.resumenChofer(nombre);
	//out.println("Result = "+result);
        
        %>
        <%= result%>
    <%    
        
        }else{
            //nada
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <br>
        <br>         
             </form>
             
             
             
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

