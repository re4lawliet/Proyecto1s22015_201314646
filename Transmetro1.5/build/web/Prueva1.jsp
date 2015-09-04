<%-- 
    Document   : Prueva1
    Created on : 24-ago-2015, 21:53:29
    Author     : carlosmonterroso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Prueva1.jsp" method="POST">
            
            <input type="text" name="caja1" value="" />
            <input type="submit" value="calcular" />
            
        </form>
          
    
<<<<<<< HEAD
      <%-- start web service invocation --%><hr/>
    <%
    if (request.getParameter("caja1") != null){ 
=======



    <%-- start web service invocation --%><hr/>
    <%
>>>>>>> origin/master
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	 // TODO initialize WS operation arguments here
	int radio = Integer.parseInt(request.getParameter("caja1"));
	// TODO process result here
	int result = port.volumen(radio);
	out.println("Result = "+result);
<<<<<<< HEAD
        response.sendRedirect("CrearUsuarioAdministrador.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>
    <%-- end web service invocation --%><hr/>





=======
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

>>>>>>> origin/master
        
    </body>
</html>
