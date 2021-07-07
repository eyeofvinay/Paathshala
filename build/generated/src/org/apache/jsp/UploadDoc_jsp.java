package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadDoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("    .topbar \n");
      out.write("    {\n");
      out.write("  width: 400px;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  line-height: 58px;\n");
      out.write("  margin: 25px auto;\n");
      out.write("  font-family: Arial;\n");
      out.write("  font-size: 30px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  text-shadow: 2px 1px 2px black;\n");
      out.write("  background: slategrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("    }\n");
      out.write("    .fields\n");
      out.write("  {\n");
      out.write("  width: 70%;\n");
      out.write("  height: 35px;\n");
      out.write("  margin-top: 2px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  background: none;\n");
      out.write("  border: 0;\n");
      out.write("  border-bottom: 1px solid;\n");
      out.write("  margin-left:40px;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    .tdtheme\n");
      out.write("    {\n");
      out.write("        border: 0px;\n");
      out.write("        border-bottom: 2px;\n");
      out.write("        margin: 0px auto;\n");
      out.write("        padding: 10px;\n");
      out.write("        font-family: arial;\n");
      out.write("        font-size: 20px;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        opacity: 1px;\n");
      out.write("        margin-top: 25px;\n");
      out.write("        font-weight: 200;\n");
      out.write("        color:#2d4259;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .links\n");
      out.write("    {\n");
      out.write("        color: #2d4259;\n");
      out.write("        text-decoration: none;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("  .register \n");
      out.write(" {\n");
      out.write("  margin: 0 auto;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  width: 1000px;\n");
      out.write("  height: 620px;\n");
      out.write("  padding: 25px;\n");
      out.write("  background: #f4f4f4;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write(".heading {\n");
      out.write("  margin: 40px auto;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  font-size: 24px;\n");
      out.write("  font-family: Verdana;\n");
      out.write("  color: #5e578c;\n");
      out.write("  text-align: center;\n");
      out.write("  font-weight: normal;\n");
      out.write("}\n");
      out.write(".checkbox\n");
      out.write("{\n");
      out.write("    margin: 0 auto;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 2px;\n");
      out.write("    font-family: Arial;\n");
      out.write("    display: inline;\n");
      out.write("    font-size: 18px;\n");
      out.write("    color: #2d4259;\n");
      out.write("    padding-right: 15px;     \n");
      out.write("    border-right: 0.5px solid grey;\n");
      out.write("}\n");
      out.write(".checkbox input{\n");
      out.write("  margin: 0 5px 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body style='background-color: #2d4259;'>\n");
      out.write("    <div class=\"topbar\">Certificate Requirement \n");
      out.write("    </div>\n");
      out.write("    <div>   \n");
      out.write("        <form class=\"register\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h1 class=\"heading\"> Your Details</h1>\n");
      out.write("            <hr style='width:32%;margin-left:10px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:32%;margin-left: 665px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <h2 style='font-size:16px;font-family: arial; color:#2d4259;padding-top: 10px;padding-left: 45px;font-weight: bold;'>Please enter your valid details. </h2>\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tdtheme\">\n");
      out.write("                        What is your highest qualification?\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"tdtheme\">\n");
      out.write("                        <input type=\"text\" class=\"fields\" name=\"qualification\" placeholder=\"eg. M.tech in CSE\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\t<a href=\"SubjectSelection.jsp\">\n");
      out.write("                <img src=\"back1.png\" width=\"30px\" height=\"30px\" alt=\"Back\" style=\"margin-top: 50px; margin-left: 15px;\">\n");
      out.write("            </a>\n");
      out.write("            <a href=\"LoginRegister.jsp\">\n");
      out.write("                <img src=\"next.jpg\" width=\"30px\" height=\"30px\" alt=\"Back\" style=\"margin-top: -30px; margin-left:  950px;\">\n");
      out.write("            </a>           \n");
      out.write(" \n");
      out.write("        </form>\n");
      out.write("    </div>    \n");
      out.write("    <br>\n");
      out.write("    \n");
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
