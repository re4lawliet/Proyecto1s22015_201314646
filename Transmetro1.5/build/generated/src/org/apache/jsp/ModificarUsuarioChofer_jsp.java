package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ModificarUsuarioChofer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h2>Menu Modificar Chofer</h2>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        <div id=\"menu\">\n");
      out.write("        \t<ul>\n");
      out.write("            \t<<li class=\"menuitem\"><a href=\"MenuAdministrador.jsp\">MenuAdmin</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"www.google.com\">Acerca de</a></li>\n");
      out.write("                <li class=\"menuitem\"><a href=\"index.jsp\">Cerrar Sesion</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"leftmenu\">\n");
      out.write("\n");
      out.write("        <div id=\"leftmenu_top\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"leftmenu_main\">    \n");
      out.write("                \n");
      out.write("                <h3><font color=\"yellow\">OPCIONES ADMINISTRADORES:</font></h3>\n");
      out.write("                        \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"CrearUsuarioChofer.jsp\">Crear Chofer</a></li>\n");
      out.write("                    <li><a href=\"ModificarUsuarioChofer.jsp\">Modificar Chofer</a></li>\n");
      out.write("                    <li><a href=\"EliminarUsuarioChofer.jsp\">Eliminar Chofer</a></li>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
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
      out.write("        \t<h2>Modificar Usuario Chofer: </h2>\n");
      out.write("        \t<p>&nbsp;</p>\n");
      out.write("           \t<p>&nbsp;</p>\n");
      out.write("                \n");
      out.write("                    <form action=\"lol\" method=\"POST\">\n");
      out.write("                        <br>\n");
      out.write("                      <h5>Seleccione El Que desea Modificar: </h5> \n");
      out.write("                      <br>\n");
      out.write("                      <select name=\"ListaAdmins\">\n");
      out.write("                          <option>admin1</option>\n");
      out.write("                          <option>admin2</option>\n");
      out.write("                      </select>\n");
      out.write("                      <br>\n");
      out.write("                      <br>    \n");
      out.write("                     \n");
      out.write("                      <h5>Nombre: </h5>  \n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"text\" name=\"nombre\" value=\"\" />\n");
      out.write("                      <br>\n");
      out.write("                      <h5>Apellido: </h5>  \n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"text\" name=\"apellido\" value=\"\" />\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <h5>Contraseña: </h5>\n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"text\" name=\"contraseña\" value=\"\" />\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"submit\" value=\"MODIFICAR\" />\n");
      out.write("                      \n");
      out.write("                    </form>\n");
      out.write("                    \n");
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
