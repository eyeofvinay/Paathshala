package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjspExtra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .formlayout\n");
      out.write("        {\n");
      out.write("            width: 250px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            background: #f4f4f4;\n");
      out.write("            padding: 30px;\n");
      out.write("            height: 150px;\n");
      out.write("            border-radius: 3px; \n");
      out.write("        }\n");
      out.write("        .textfeilds\n");
      out.write("        {\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-family: arial;\n");
      out.write("            font-weight: 500;\n");
      out.write("            height: 35px;\n");
      out.write("            border: none;\n");
      out.write("            border-bottom: 1px solid;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body bgcolor=\"lightgrey\">\n");
      out.write("        <form class=\"formlayout\">\n");
      out.write("            <input type=\"text\" class=\"textfeilds\" placeholder=\"username\">\n");
      out.write("            <input type=\"email\" class=\"textfeilds\" placeholder=\"email\"> \n");
      out.write("            <input type=\"password\" class=\"textfeilds\" placeholder=\"password\">\n");
      out.write("            <input type=\"submit\" class=\"textfeilds\" placeholder=\"Create Account\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
