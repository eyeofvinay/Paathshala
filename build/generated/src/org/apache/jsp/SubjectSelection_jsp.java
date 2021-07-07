package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SubjectSelection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/SecurityPage.jsp");
  }

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

 
response.addHeader("Pragma","no-cache");
response.addHeader("Cache-Control","no-Store");
response.setHeader("Cache-Control","no-Store");

String value=(String)session.getAttribute("ID");
if(value==null)
{
    response.sendRedirect("LoginRegister.jsp");
}
if(session==null)
{
    response.sendRedirect("LoginRegister.jsp");
}

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
      out.write(".button\n");
      out.write("{\n");
      out.write("  width: 20%;\n");
      out.write("  height: 42px;\n");
      out.write("  margin-top: 25px;\n");
      out.write("  margin-left: 450px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  text-align: center;\n");
      out.write("  background: none;\n");
      out.write("  border: 1px solid;\n");
      out.write("  border-color: graytext;\n");
      out.write("  border-radius: 2px;  \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body style='background-color: #2d4259;'>\n");
      out.write("    <div class=\"topbar\">Subjects you teach\n");
      out.write("    </div>\n");
      out.write("    <div>   \n");
      out.write("        <form class=\"register\" action=\"SubSelectLogic.jsp\">\n");
      out.write("          \n");
      out.write("            <h1 class=\"heading\"> Science</h1>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 620px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <br>\n");
      out.write("            <div >\n");
      out.write("                <div class='checkbox'><input type=\"checkbox\" name=\"subject\" value=\"Physics\">Physics</div>                \n");
      out.write("                <div class='checkbox'><input type=\"checkbox\" name=\"subject\" value=\"Chemistry\">Chemistry</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox' name=\"subject\" value=\"Biology\">Biology</div>\n");
      out.write("                <div class='checkbox'><input type=\"checkbox\" name=\"subject\" value=\"Mathematics\">Mathematics</div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h3 class=\"heading\"> Programming</h3>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 620px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <br>\n");
      out.write("            <div >\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Java2.0\">Java2.0</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Python\">Python</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Python with ML\">Python with ML</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"CCpp\">C and C++</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"DSA\">Data Structure Algorithms</div>\n");
      out.write("                            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h3 class=\"heading\"> Music</h3>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px;  border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 620px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <br>\n");
      out.write("            <div >\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Vocal\">Vocal</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Guitar\">Guitar</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Sitar\">Sitar</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Flute\">Flute</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Piano\">Piano</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Tabla\">Tabla</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Violin\">Violin</div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h3 class=\"heading\"> Language</h3>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 620px; margin-top: 0px;  border: 1.5px solid grey;'>\n");
      out.write("            <br>\n");
      out.write("            <div >\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"English\">English</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Hindi\">Hindi</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Sanskrit\">Sanskrit</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"French\">French</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"German\">German</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Spanish\">Spanish</div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h3 class=\"heading\"> Sports</h3>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px;border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 620px; margin-top: 0px;border: 1.5px solid grey;'>\n");
      out.write("            <br>\n");
      out.write("            <div >\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Cricket\">Cricket</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Football\">Football</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Tennis\">Tennis</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"TT\">Table Tennis</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Hockey\">Hockey</div>\n");
      out.write("                <div class='checkbox'><input type='checkbox'name=\"subject\" value=\"Badminton\">Badminton</div>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class=\"button\">\n");
      out.write("                          \n");
      out.write("               \n");
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
