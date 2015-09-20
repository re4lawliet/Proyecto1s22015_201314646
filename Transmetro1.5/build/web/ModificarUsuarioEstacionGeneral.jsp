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
        	<h2>Modificar Usuario de EstacionGeneral: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="ModificarUsuarioEstacionGeneral.jsp" method="POST">
                        <br>
                       <input type="radio" name="radio1" value="1" />Modificar Correo y Contraseña
                      <br>    
                      <input type="radio" name="radio1" value="2" />Modificar Solo Contraseña
                      <br> 
                      <br> 
                      <h5>Seleccione El Que desea Modificar: </h5> 
                      <br>
                      <select name="Lista">
                      <option value="...">...</option>                                                  <%-- start web service invocation --%><hr/>
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
    <%-- end web service invocation --%><hr/>
                      </select>
                      <br>
                      <br>    
                       <h5>ID De La EStacion: </h5>  
                      <br>
                      <input type="text" name="id" value="" />
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
                      
                                      <%-- start web service invocation --%><hr/>
    <%
     
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
        String list=request.getParameter("Lista");
        
	int arg0 = Integer.parseInt(request.getParameter("Lista"));
	java.lang.String arg1 = request.getParameter("correo");//nombre de LA estacion
	java.lang.String arg2 = request.getParameter("contramod"); 
        //int id=Integer.parseInt(request.getParameter("id"));
        
        int vali1 = Integer.parseInt(request.getParameter("radio1"));
	// TODO process result here
        
        if (!list.equals("...")){ //ejecutar
            
            if(vali1==2){
        java.lang.String result = port.modificarEstacionGeneral(arg0, arg1, arg2);
	out.println("Result = "+result);
        
        String msg=result;
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
        out.println(mensaje);    
            }else{
                int id=Integer.parseInt(request.getParameter("id"));
                boolean result2=port.existeEstacionGeneral(id);
        
        if(result2==true){//existe Ese Usuario
        String mensaje="<script language='javascript'>alert('Este Admin Ya Existe');</script>"; 
        out.println(mensaje);    
        }else{//no existe Tonces Insertar
        port.eliminarEstacionGeneral(arg0);//lo Elimina y procede a Incertar Nuevo
        
        String msg=port.insertarEstacionGeneral(id, arg1, arg2);
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
        out.println(mensaje);
                
        }
            
        }      
        }//Se cierran Los puntos
        
        
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

