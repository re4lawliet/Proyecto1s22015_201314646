<%-- 
    Document   : ModificarUsuarioChofer
    Created on : 25-ago-2015, 13:04:54
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
            <h2>Menu Modificar Chofer</h2>
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
                          <li><a href="MostrarChofer.jsp">Tabla De Choferes</a></li>
                    <li><a href="CrearUsuarioChofer.jsp">Crear Chofer</a></li>
                    <li><a href="ModificarUsuarioChofer.jsp">Modificar Chofer</a></li>
                    <li><a href="EliminarUsuarioChofer.jsp">Eliminar Chofer</a></li>
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	<h2>Modificar Usuario Chofer: </h2>
        	<p>&nbsp;</p>
           	<p>&nbsp;</p>
                
                    <form action="ModificarUsuarioChofer.jsp" method="POST">
                        <br>
                      <h5>Seleccione El Que desea Modificar: </h5> 
                      <br>
                          
                      <br>
                       <input type="radio" name="radio1" value="1" />Modificar Correo y Contraseña
                      <br>    
                      <input type="radio" name="radio1" value="2" />Modificar Solo Contraseña (no escribir el Id)
                      <br> 
                      <br> 
                      <select name="ListaAdmins">
                      <option value="...">...</option>
                                                      <%-- start web service invocation --%><hr/>
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
    <%-- end web service invocation --%><hr/>
  
                      </select>
                      <br>
                      <br>    
                       <h5>ID De La EStacion: </h5>  
                      <br>
                      <input type="text" name="id" value="" />
                      <br>
                      <br>
                      <h5>Nombre: </h5>  
                      <br>
                      <input type="text" name="nombre" value="" />
                      <br>
                      <h5>Apellido: </h5>  
                      <br>
                      <input type="text" name="apellido" value="" />
                      <br>
                      <br>
                      <h5>Contraseña: </h5>
                      <br>
                          <input type="password" name="contralol" value="" />
                      <br>
                      <br>
                      <input type="submit" value="MODIFICAR" />
                      
                    
                    
        
        <%-- start web service invocation --%><hr/>
    <%
    
    try {
        
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
        String list=request.getParameter("ListaAdmins");
        
	int arg0 = Integer.valueOf(request.getParameter("ListaAdmins"));
	java.lang.String arg1 = request.getParameter("nombre");
	java.lang.String arg2 = request.getParameter("apellido");
        java.lang.String arg3 = request.getParameter("contralol");
        
        int vali1 = Integer.parseInt(request.getParameter("radio1"));
	// TODO process result here
        
        if (!list.equals("...")){ //ejecutar
            
            if(vali1==2){
        java.lang.String result = port.modificarChofer(arg0, arg1, arg2,arg3);
	out.println("Result = "+result);
        
        String msg=result;
        String mensaje="<script language='javascript'>alert('"+msg+"');</script>"; 
        out.println(mensaje);  
            }else{
                int id=Integer.parseInt(request.getParameter("id"));
                boolean result2=port.existeChofer(id);
        
        if(result2==true){//existe Ese Usuario
        String mensaje="<script language='javascript'>alert('Este Chofer Ya Existe');</script>"; 
        out.println(mensaje);    
        }else{//no existe Tonces Insertar
        port.eliminarChofer(arg0);//lo Elimina y procede a Incertar Nuevo
        
        String msg=port.insertarChofer(id, arg1, arg2, arg3);
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

