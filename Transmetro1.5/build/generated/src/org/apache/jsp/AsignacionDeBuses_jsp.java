package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AsignacionDeBuses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("<title>Automatización del flujo del Transmetro</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <a href=\"MenuAdministrador.jsp\"></a>\n");
      out.write("<div id=\"container\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("        \t<h1>Transmetro<span class=\"off\">Guatemala</span></h1>\n");
      out.write("            <h2>Menu Administrador</h2>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        <div id=\"menu\">\n");
      out.write("        \t<ul>\n");
      out.write("            \t<<li class=\"menuitem\"><a href=\"MenuAdministrador.jsp\">MenuAdmin</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"www.google.com\">Acerca de</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"index.jsp\">Cerrar Sesion</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"leftmenu\">\n");
      out.write("\n");
      out.write("        <div id=\"leftmenu_top\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"leftmenu_main\">    \n");
      out.write("                \n");
      out.write("                <h3><font color=\"yellow\">OPCIONES ADMINISTRADOR:</font></h3>\n");
      out.write("                        \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"AsignacionDeBuses.jsp\">Asignacion de Buses</a></li>\n");
      out.write("                    <li><a href=\"#\">Agregar Usuarios de Estaciones</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    <li><a href=\"AgregarBus.jsp\">Agregar Buses</a></li>\n");
      out.write("                    <li><a href=\"AgregarRuta.jsp\">Agregar Rutas</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <h3><font color=\"yellow\">AdministrarUsuarios:</font></h3>                   \n");
      out.write("                    <li><a href=\"MostrarAdministradores.jsp\">Administradores:</a></li>\n");
      out.write("                    <li><a href=\"MostrarEstacionesClave.jsp\">Estaciones Claves:</a></li>\n");
      out.write("                    <li><a href=\"MostrarEstacionesGenerales.jsp\">Estaciones Generales:</a></li>\n");
      out.write("                    <li><a href=\"MostrarChofer.jsp\">Choferes:</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    <h3><font color=\"yellow\">Reportes:</font></h3>\n");
      out.write("                    <li><a href=\"#\">Resumen</a></li>\n");
      out.write("                    <li><a href=\"graficas.jsp\">Graficas</a></li>\n");
      out.write("                </ul>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("              <div id=\"leftmenu_bottom\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"content_top\"></div>\n");
      out.write("        <div id=\"content_main\">\n");
      out.write("             \t<h2> Asignacion DE Buses A Choferes:</h2>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("                <h4> Seleccione El Bus Que Desea Asignar:</h4>\n");
      out.write("                </br>\n");
      out.write("\n");
      out.write("                <select name=\"listaBuses\">\n");
      out.write("                     ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	// TODO process result here
	java.lang.String result = port.imprimirListaBusesParaAsignar();
	
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.print( result);
      out.write("\n");
      out.write("        \n");
      out.write("    ");
    
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                </br>\n");
      out.write("                <h4> Seleccione La Ruta Que le Asignara a Este Bus:</h4>\n");
      out.write("                </br>\n");
      out.write("                <select name=\"listaRutas\">\n");
      out.write("                   \n");
      out.write("                        ");
      out.write("<hr/>\n");
      out.write("    ");

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
          
      out.write("\n");
      out.write("        \n");
      out.write("        <option value=\"");
      out.print( x);
      out.write('"');
      out.write('>');
      out.print( x);
      out.write("</option><br>\n");
      out.write("        \n");
      out.write("          ");
      
             
         }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>   \n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                </br>\n");
      out.write("                <h4> Seleccione El Chofer Que le Asignara a Este Bus: (recargar)</h4>\n");
      out.write("                </br>\n");
      out.write("                <select name=\"ListaChoferes\">\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    ");

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
         
        
      out.write("  \n");
      out.write("        \n");
      out.write("        <option value=\"");
      out.print( mensaje2);
      out.write('"');
      out.write('>');
      out.print( mensaje3);
      out.write("</option>\n");
      out.write("               \n");
      out.write("         ");

         count=count+1;
         }   
         
        }
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    </select>\n");
      out.write("                <br>\n");
      out.write("                </br>\n");
      out.write("                <form action=\"AsignacionDeBuses.jsp\">\n");
      out.write("                \n");
      out.write("    <h4> Seleccione Los Horarios y la Fecha: </h4>\n");
      out.write("                </br>\n");
      out.write("    Hora Inicio: <input type=\"text\" name=\"horainicio\" value=\"\" /><br>\n");
      out.write("        <br>\n");
      out.write("    Hora Fin:     <input type=\"text\" name=\"horafin\" value=\"\" /><br>\n");
      out.write("        <br>\n");
      out.write("    Fecha:     <input type=\"text\" name=\"horafin\" value=\"\" /><br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Asignacion\" />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            ");
      out.write("<hr/>\n");
      out.write("    ");

    
    try {
	servicio.SerivicioWeb_Service service = new servicio.SerivicioWeb_Service();
	servicio.SerivicioWeb port = service.getSerivicioWebPort();
	
        //String 
        
        
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
    
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div id=\"content_bottom\"></div>\n");
      out.write("            \n");
      out.write("            <div id=\"footer\"><h3><a href=\"http://www.google.com\">Autor:CarlosMonterros</a></h3></div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
