package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"container\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("        \t<h1>Transmetro<span class=\"off\">Guatemala</span></h1>\n");
      out.write("            <h2>Menu Administrador</h2>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        <div id=\"menu\">\n");
      out.write("        \t<ul>\n");
      out.write("            \t<<li class=\"menuitem\"><a href=\"MenuAdministrador.jsp\">MenuAdmin</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"/index.jsp\">Acerca de</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"\">Cerrar Sesion</a></li>\n");
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
      out.write("                    <li><a href=\"#\">Asignacion de Buses</a></li>\n");
      out.write("                    <li><a href=\"#\">Agregar Usuarios de Estaciones</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <h3><font color=\"yellow\">AdministrarUsuarios:</font></h3>                   \n");
      out.write("                    <li><a href=\"CrearUsuarioAdministrador.jsp\">Administradores:</a></li>\n");
      out.write("                    <li><a href=\"CrearUsuarioEstacionClave.jsp\">Estaciones Claves:</a></li>\n");
      out.write("                    <li><a href=\"#\">Estaciones Generales:</a></li>\n");
      out.write("                    <li><a href=\"#\">Choferes:</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    <h3><font color=\"yellow\">Reportes:</font></h3>\n");
      out.write("                    <li><a href=\"#\">Resumen</a></li>\n");
      out.write("                    <li><a href=\"#\">Graficas</a></li>\n");
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
      out.write("        \t<h2>You may use this template in any manner you like. All I ask is that you leave\n");
      out.write("                    the link back to my site at the bottom of the page. </h2>\n");
      out.write("        \t<p>&nbsp;</p>\n");
      out.write("           \t<p>&nbsp;</p>\n");
      out.write("       \t  <h3>Template Notes</h3>\n");
      out.write("       \t  <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor \n");
      out.write("              incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud \n");
      out.write("              exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute \n");
      out.write("              irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla \n");
      out.write("              pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \n");
      out.write("              deserunt mollit anim id est laborum.</p>\n");
      out.write("        \t<p>&nbsp;</p>\n");
      out.write("<h3>More information</h3>\n");
      out.write("        \t<p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor\n");
      out.write("                    incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\n");
      out.write("                    nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore \n");
      out.write("                    eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt \n");
      out.write("                    in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("       \t  <p>&nbsp;</p>\n");
      out.write("        \t<h3>Template Notes</h3>\n");
      out.write("            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor \n");
      out.write("                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis \n");
      out.write("                nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu \n");
      out.write("                fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in \n");
      out.write("                culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("          <p></p>\n");
      out.write("<p>&nbsp;</p>\n");
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
