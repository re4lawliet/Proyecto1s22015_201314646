<%-- 
    Document   : ModificarUsuarioEstacionGeneral
    Created on : 25-ago-2015, 12:41:43
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
            <h2>Menu Modificar Estacion General</h2>
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
                    <li><a href="MostrarEstacionesGenerales.jsp">Crear EstacionGeneral</a></li>
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
        	<h2>Modificar Usuario de EstacionGeneral: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="ModificarUsuarioEstacionGeneral.jsp" method="POST">
                        <br>
                      <h5>Seleccione El Que desea Modificar: </h5> 
                      <br>
                      <select name="Lista">
                                                                        <%-- start web service invocation --%><hr/>
    <%
    try {servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();	
        
        int y=port.imprimirEstaGeREtorno().size();
        int count=0;        
        if(port.imprimirEstaGeREtorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){    
         //String mensaje="<script language='javascript'>alert('"+port.getAdmin(i).toString()+"');</script>"; 
         //out.println(mensaje);
         String mensaje2=port.getEstacionGeneral(i).toString();
         //AQui SE EScribe Para Q Imprima en la Mierda De TAbla
         
        %>  
        
        <option><%= mensaje2%></option>
               
         <%
         count=count+1;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                      </select>
                      <br>
                      <br>    
                     
                      <h5>Nombre de Estacion: </h5>  
                      <br>
                      <input type="text" name="correo" value="" />
                      <br>
                      <br>
                      <h5>Contraseña: </h5>
                      <br>
                      <input type="text" name="contramod" value="" />
                      <br>
                      <br>
                      <input type="submit" value="MODIFICAR" />
                      
                    </form>
                      
                <%-- start web service invocation --%><hr/>
    <%
     if (request.getParameter("correo") != null){ 
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int arg0 = Integer.parseInt(request.getParameter("Lista"));
	java.lang.String arg1 = request.getParameter("correo");
	java.lang.String arg2 = request.getParameter("contramod");
	// TODO process result here
	java.lang.String result = port.modificarEstacionGeneral(arg0, arg1, arg2);
	out.println("Result = "+result);
        
        String msg=result;
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
        out.println(mensaje);
        
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

