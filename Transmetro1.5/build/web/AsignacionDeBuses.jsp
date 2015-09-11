<%-- 
    Document   : AsignacionDeBuses
    Created on : 7/09/2015, 12:47:23 PM
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
             	<h2> Asignacion DE Buses A Choferes:</h2>
                </br>
                </br>
                <h4> Seleccione El Bus Que Desea Asignar:</h4>
                </br>
                <form action="AsignacionDeBuses.jsp">
                <select name="listaBuses">
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
                </br>
                <h4> Seleccione La Ruta Que le Asignara a Este Bus:</h4>
                </br>
                <select name="listaRutas">
                   
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
                </br>
                <h4> Seleccione El Chofer Que le Asignara a Este Bus: (recargar)</h4>
                </br>
                <select name="ListaChoferes">
                    
                
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
                </br>
               
                
    <h4> Seleccione Los Horarios y la Fecha: </h4>
                </br>
    Hora Inicio: <input type="text" name="horainicio" value="" /><br>
        <br>
    Hora Fin:     <input type="text" name="horafin" value="" /><br>
        <br>
    Fecha:     <input type="text" name="fecha" value="" /><br>
        <br>
        
        <input type="submit" value="Asignacion" />
        
        
        
            <%-- start web service invocation --%><hr/>
    <%
    
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	
        if (request.getParameter("listaBuses")!=null && request.getParameter("listaRutas")!=null &&
            request.getParameter("ListaChoferes")!=null && request.getParameter("horainicio")!="" &&
            request.getParameter("horafin")!="" && request.getParameter("fecha")!=""
            ){
        //String mensaje="<script language='javascript'>alert('Entra xq hay datos');</script>"; 
        //out.println(mensaje);
               
        //Resive La id Del Bus
        int Bus=Integer.parseInt(request.getParameter("listaBuses"));
        //Resive Nombre de La Ruta
        String Ruta=request.getParameter("listaRutas");
        //resive el Id del Chofer:
        int Chofer=Integer.parseInt(request.getParameter("ListaChoferes"));
        //resive la Hora Inicio:
        String HoraInicio=request.getParameter("horainicio");
        //resive la Hora Final
        String HoraFinal=request.getParameter("horafin");
        //resive la Fecha
        String Fecha=request.getParameter("fecha");
        
        String msje =port.asignacionDeBuses(Bus, Ruta, Chofer, HoraInicio, HoraFinal, Fecha);
        String mensajeExito="<script language='javascript'>alert('"+msje+"');</script>"; 
        out.println(mensajeExito);
        
        }else{
        String mensaje="<script language='javascript'>alert('REquisitos Incompletos');</script>"; 
        out.println(mensaje);
        }    
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
    
    %>
    <%-- end web service invocation --%><hr/>

        
        
        </form>
        
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

