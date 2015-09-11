<%-- 
    Document   : AgregarRuta
    Created on : 6/09/2015, 05:24:13 PM
    Author     : carlos
--%>

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
            
             <form action="AgregarRuta.jsp" method="POST"> 
            
             	<h2> MEnu Agregar Ruta:</h2>
                </br>
                </br>
                <h3>Seleccione Las Estaciones Por Las Que ingresa La Ruta Nueva:</h3>
                </br>
                </br>
        ________________________________________________________________________<br>
        |..............................EstacionesClave.....................................<br>                 
        |_______________________________________________________________________|<br> 
        |Numero.......Clave.......NOmbreEstacion.............<br>    
        |_______________________________________________________________________|<br>     
            

                    <%
    try {servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();	
        
        int y=port.imprimirEstacionClaveRetorno().size();
        int x=port.imprimirEstacionClaveRetorno2().size();
        int count=0;     
        int radiocontador=0;
        if(port.imprimirEstacionClaveRetorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getEstacionClaveNombre(i).toString();//numero
         String mensaje3=port.getEstacionClave2(i).toString();//nombre
         //AQui SE EScribe Para Q Imprima en la Mierda De TAbla
         
        %>  
        
        <input type="radio" name="radio1<%= mensaje2%>" value="<%= mensaje3%>" />--<%= count%>)------------<%= mensaje3%>
        </br>
         
         <%
         count=count+1;
         radiocontador++;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
        ________________________________________________________________________<br>
        |..............................EstacionesGenerales.....................................<br>                 
        |_______________________________________________________________________|<br> 
        |Numero.......Clave.......NOmbreEstacion.............<br>    
        |_______________________________________________________________________|<br>     
            
                       <%
    try {servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();	
        
        int y=port.imprimirEstaGeREtorno().size();
        int x=port.imprimirEstaGeREtorno2().size();
        int count=0;     
        int radiocontador=0;
        if(port.imprimirEstaGeREtorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getEstacionGeneralNombre(i).toString();//numero
         String mensaje3=port.getEstacionGeneral2(i).toString(); //nombre
         //AQui SE EScribe Para Q Imprima en la Mierda De TAbla
         
        %>  
        
        <input type="radio" name="radio2<%= mensaje2%>" value="<%= mensaje3%>" />--<%= count%>)------------<%= mensaje3%>
        </br>
         
         <%
         count=count+1;
         radiocontador++;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                    </br>
                    </br>

                
                    <h3>Nombre de La Ruta</h3>                        
                    </br>
                   
             <input type="text" name="nombreruta" value="" />     
             <input type="submit" value="Agregar" />
    
    <%-- start web service invocation --%><hr/>
    <%
        if(request.getParameter("nombreruta")!=null){
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("nombreruta");
	
        
        //ArrayList <String> Lista= new ArrayList <> ();
        //--------------------------------------------------------------
        
        int y=port.imprimirEstacionClaveRetorno().size();
        int x=port.imprimirEstacionClaveRetorno2().size();
        int count=0;     
        int radiocontador=0;
        //................EScarion Clave..........................................
        if(port.imprimirEstacionClaveRetorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getEstacionClaveNombre(i).toString();//numero
         String mensaje3=port.getEstacionClave2(i).toString();//nombre
         int numero=Integer.parseInt(mensaje2);
         String v="radio1"+mensaje2;
         
         
         String otra=request.getParameter(mensaje3);
         
         String otra1 = request.getParameter("radio1"+mensaje2);
         
         if(request.getParameter(v)!=null){//si esta marcado
         port.agregarNumeroExtacion(numero);        
         port.agregarNombreRuta(mensaje3);
         
         }else{//esta Desmarcado
                 
         }
         
        }
        }
        //_----------------------------------------------------------------------
                //................EScarion General..........................................
        if(port.imprimirEstaGeREtorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getEstacionGeneralNombre(i).toString();//numero
         String mensaje3=port.getEstacionGeneral2(i).toString();//nombre
         int numero=Integer.parseInt(mensaje2);
         String v="radio2"+mensaje2;
         
         
         String otra=request.getParameter(mensaje3);
         
         String otra1 = request.getParameter("radio2"+mensaje2);
         
         if(request.getParameter(v)!=null){//si esta marcado
                  
         port.agregarNombreRuta(mensaje3);
         port.agregarNumeroExtacion(numero);
         
         }else{//esta Desmarcado
                 
         }
         
        }
        }
        //_----------------------------------------------------------------------
        //CREAR LA RUTA_-------------------------------------------
        if(port.existeRuta(nombre)==true){//si la Ruta Existe no se Crea
            
        }else {//de lo contrario si no existe se CREA
            
        port.crearRuta(nombre);
        String mensaje="<script language='javascript'>alert('Ruta : "+nombre+" Creada :v');</script>"; 
        out.println(mensaje);
        
        }
        
	
        
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>
    <%-- end web service invocation --%><hr/>

            
    
        </br>
             
         </form>    

    </br>
    </br>
    </br>
    
    <h3>Listado De Rutas Existentes</h3>
                </br>
                </br>
        ________________________________________________________________________<br>
        |..............................Rutas.....................................<br>                 
        |_______________________________________________________________________|<br>   
        ***********************************************************************<br>      
            
        <%-- start web service invocation --%><hr/>
    <%if(request.getParameter("nombreruta")!=null){
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	//java.util.List<java.lang.Object> result = port.retornarListaRutas();
         
        int y=port.retornarListaRutas();
        
         for (int i=y-1; i>=0;i--){
         String x=port.retornarNombresDeRutas(i);//jala El nombre De La Ruta en i
        %>     
        ***********************************************************************<br> 
        ----------------------RUTA:- <%= x%>----------------------------------- <br> 
        Estaciones:<br> 
        <%    
        int y1=port.retornarListaDeNombresDeEstaciones(i);
        for (int j=y1-1; j>=0;j--){
        String x2 = port.retornarNombresDeRutasEstaciones(i,j);
         %>     
        >>> <%= x2%>  <br> 
        
        <%   
            
         }       
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

