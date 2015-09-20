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
                    <li><a href="Resumen.jsp">Resumen</a></li>
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
        //String mensaje="<script language='javascript'>alert('Grafico Arbol Admin');</script>"; 
        //out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="Arbol1.jpg";
        %>
        
        <h3>Arbol AvL Administradores:</h3>
        <br>
        <br>
        <IMG src="Arbol1.jpg">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        //String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        //out.println(mensaje);
        
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

    <br>
    <br>
    
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	boolean result = port.graficarArbolEstacionClave();
	out.println("Result = "+result);
        
        if(result==true){//grafico
        //String mensaje="<script language='javascript'>alert('Grafico Arbol EstacionClave');</script>"; 
        //out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="Arbol2.jpg";
        %>
        
        <h3>Arbol AvL EstacionesClave:</h3>
        <br>
        <br>
        <IMG src="<%=arbol%>">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        //String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        ////out.println(mensaje);
        
        %>
        
        <h3>Arbol AVL Estaciones Clave: </h3>
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
         <br>
         <br>
                    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	boolean result = port.graficarArbolEstacionGeneral();
	out.println("Result = "+result);
        
        if(result==true){//grafico
        //String mensaje="<script language='javascript'>alert('Grafico Arbol EstacionGeneral');</script>"; 
        //out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="Arbol3.jpg";
        %>
        
        <h3>Arbol AvL Estaciones Generales:</h3>
        <br>
        <br>
        <IMG src="<%=arbol%>">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        //String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        //out.println(mensaje);
        
        %>
        
        <h3>Arbol AVL EstacionesGenerales: </h3>
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
    
    <br>
         <br>  
             
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	boolean result = port.graficarArbolChofer();
	out.println("Result = "+result);
        
        if(result==true){//grafico
       // String mensaje="<script language='javascript'>alert('Grafico Arbol EstacionClave');</script>"; 
        //out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="Arbol4.jpg";
        %>
        
        <h3>Arbol AvL Choferes:</h3>
        <br>
        <br>
        <IMG src="<%=arbol%>">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        //String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        //out.println(mensaje);
        
        %>
        
        <h3>Arbol AVL Choferes: </h3>
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
         <br>
         <br>  
                            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	boolean result = port.graficarListaBuses();
	out.println("Result = "+result);
        
        if(result==true){//grafico
       // String mensaje="<script language='javascript'>alert('Grafico Lista de Buses');</script>"; 
       // out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="Lista1.jpg";
        %>
        
        <h3>Lista Buses:</h3>
        <br>
        <br>
        <IMG src="<%=arbol%>">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
       // String mensaje="<script language='javascript'>alert('No Se Genero Lista Buses Falta De Datos');</script>"; 
       // out.println(mensaje);
        
        %>
        
        <h3>Lista Buses: </h3>
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
         <br>
         <br>  
        <h3>Lista de buses asignados de un solo chofer: </h3>
        <br>
        <br>
            <form name="buses" action="graficas.jsp" method="POST">
                
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
        <input type="submit" value="Graficar" />
        <br>
        <br>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int arg0 = Integer.parseInt(request.getParameter("listaChoferes"));
	// TODO process result here
	boolean result = port.graficarListaDeBusesAunChofer(arg0);
	//out.println("Result = "+result);
        
        
        if(result==true){//grafico
       // String mensaje="<script language='javascript'>alert('Grafico Arbol EstacionClave');</script>"; 
        //out.println(mensaje);
        //SEtear Imagen Del Arbol En Pagina
        String arbol="ListaDeBusesDeUnChofer.jpg";
        %>
        
        <h3>Lista Buses De Un Chofer:</h3>
        <br>
        <br>
        <IMG src="<%=arbol%>">    
        <br>                
        <br>    
        <%
        }else{//no Grafico
        //String mensaje="<script language='javascript'>alert('No Se Genero Arbol Admin Falta De Datos');</script>"; 
        //out.println(mensaje);
        
        %>
        
        <h3>Vacio: </h3>
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
    
                
        </form>
             
             
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>
