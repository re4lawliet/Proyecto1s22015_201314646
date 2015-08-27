package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("<title>Automatización del flujo del Transmetro</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"container\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("        \t<h1>Transmetro<span class=\"off\">Guatemala</span></h1>\n");
      out.write("            <h2>Sistema Automatizado</h2>\n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("        <div id=\"menu\">\n");
      out.write("        \t<ul>\n");
      out.write("            \t<li class=\"menuitem\"><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"index.jsp\">Acerca de</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"login.jsp\">IniciarSesion</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"leftmenu\">\n");
      out.write("\n");
      out.write("       \n");
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
      out.write("        \t<h2> Informacion: Carlos Monterroso Barrios 201314646 </h2>\n");
      out.write("        \t<p>&nbsp;</p>\n");
      out.write("           \t<p>&nbsp;</p>\n");
      out.write("       \t  <h3>Objetivos</h3>\n");
      out.write("       \t  <p>Crear una implementación de memoria dinámica a través de Objetos en Web Java Comprender y elaborar listas dinámicas y arboles AVL\n");
      out.write("Definir algoritmos de búsqueda y recorridos para las listas y arboles </p>\n");
      out.write("              <p>&nbsp;</p>\n");
      out.write("<h3>Descripcion</h3>\n");
      out.write("        \t<p> La Municipalidad de Guatemala le pide a la universidad de san Calos que le automatice el sistema de transmetro para generar un mejor control de sus estaciones, buses y paradas. Al ver los requerimientos que desea se dio una lista de pasos que él desea, uno de los requerimientos es que sea versión Web y tiene dos servidores web con Java implementado, y quieren que estén en estos servidores la página web y un web service. También por cuestiones de rapidez quieren que todo esté en memoria no importando que le toque que perder los datos.\n");
      out.write("                </p>\n");
      out.write("       \t  <p>&nbsp;</p>\n");
      out.write("        \t<h3>Implementacion</h3>\n");
      out.write("          <p>Se deberá crear una aplicación web con Java, HTML y un Web services en Java que cumpla las descripciones para los sistemas de usuarios, paradas de control, paradas generales. El Web service tiene que tener todas las estructuras específicas a continuación.</p>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content_bottom\"></div>\n");
      out.write("            \n");
      out.write("            <div id=\"footer\"><h3><a href=\"http://www.google.com\">Autor:CarlosMonterros</a></h3></div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
