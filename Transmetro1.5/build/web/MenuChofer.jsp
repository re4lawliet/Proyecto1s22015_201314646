<%-- 
    Document   : MenuChofer
    Created on : 25-ago-2015, 10:22:21
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
            <h2>Menu Chofer</h2>
        </div>    
        
        <div id="menu">
        	<ul>
            	<<li class="menuitem"><a href="MenuChofer.jsp">MenuChofer</a></li>
                <li class="menuitem"><a href="www.google.com">Acerca de</a></li>
                <li class="menuitem"><a href="index.jsp">Cerrar Sesion</a></li>
            </ul>
        </div>
        
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

				<div id="leftmenu_main">    
                
                <h3><font color="yellow">OPCIONES Chofer:</font></h3>
                        
                <ul>
                    <li><a href="#">Ver Informacion</a></li>                    
                    </br>
                    </br>
                </ul>
</div>
                
                
              <div id="leftmenu_bottom"></div>
        </div>
        
        
        
        
		<div id="content">
        
        
        <div id="content_top"></div>
        <div id="content_main">
        	
            
            <br>
         <br>
         <h3>RESUMEN DE ChoFer ESPECIFICO:: </h3>
         <br>
         <br>    
             <form name="choferes" action="MenuChofer.jsp" method="POST">

        <br>
        <input type="submit" value="ResumenBus" />
        <br>
        <br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>    
        :::RESUMEN Chofer:     <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	String v=request.getParameter("listaChoferes");
	int nombre=port.choferLogeado();
        String result="";
	// TODO process result here
        
          int y=port.imprimirChoferREtorno().size();
        int y1=port.imprimirChoferREtorno2().size();
        int count=0;        
        if(port.imprimirChoferREtorno().isEmpty()){
         //vacia   
        }else{//llena
         
         for (int i=y-1; i>=0;i--){
         if(Integer.parseInt(port.getChoferNombre(i).toString())==nombre){
         result=port.getChofer2(i).toString();    
         }    
         }
        
         }
    
        %>
        <%= result%>
    <%    
        
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %> :::::::::::::::::::::::<br>
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::<br>
        <br>
        <br>
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	//String v=request.getParameter("listaChoferes");
	int nombre=port.choferLogeado();
	// TODO process result here
        
	java.lang.String result = port.resumenChofer(nombre);
	//out.println("Result = "+result);
        
        %>
        <%= result%>
    <%    
        
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
            
            <div id="footer"><h3><a href="http://www.google.com">Autor:CarlosMonterros</a></h3></div>
      </div>
   </div>
</body>
</html>

