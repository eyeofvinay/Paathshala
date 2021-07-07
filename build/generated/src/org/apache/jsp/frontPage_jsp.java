package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frontPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("    .sidebar {\n");
      out.write("        background-color: #f4f4f4;\n");
      out.write("        margin-top:20px;\n");
      out.write("        width: 15%;\n");
      out.write("        height: 550px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .topbar {\n");
      out.write("        background-color: #2d4259;\n");
      out.write("        margin:10px auto;\n");
      out.write("        width:100%;\n");
      out.write("        height:60px;\n");
      out.write("    }\n");
      out.write("    .contents {\n");
      out.write("        background-color:slategray;\n");
      out.write("        width:83%;\n");
      out.write("        height:700px;\n");
      out.write("        margin-left: 250px;\n");
      out.write("        margin-top:-565px;\n");
      out.write("     \n");
      out.write("    }\n");
      out.write("    .bottominfo{\n");
      out.write("        background-color: #2d4259;\n");
      out.write("        height: 250px;\n");
      out.write("        margin-top:20px;\n");
      out.write("        width: 100%;\n");
      out.write("    } \n");
      out.write("    .tdtheme\n");
      out.write("    {\n");
      out.write("        margin: 0px auto;\n");
      out.write("        padding: 8px;\n");
      out.write("        font-family: arial;\n");
      out.write("        font-size: 17px;\n");
      out.write("        border-radius: 2px;\n");
      out.write("        margin-top: 20px;\n");
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
      out.write("    a:hover\n");
      out.write("    {\n");
      out.write("        background-color: transparent;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .heading {\n");
      out.write("\n");
      out.write("  margin-left: 9px; \n");
      out.write("  font-size: 30px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  color: white;\n");
      out.write("  text-shadow: 2px 1px 2px black;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"topbar\">\n");
      out.write("        <div >\n");
      out.write("            <h1  class=\"heading\" style=\"padding-top: 13px;\">Welcome to<font style='color:lightblue; font-weight:bold;'>Paathshala</font>\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"topbar\" style=\"margin-left:1350px; width: 50px;  align-content: center; margin-top: -58px;height: 20px;\">\n");
      out.write("            <a href=\"FeedbackTeacher.jsp\" class=\"links\" style=\"color:#f4f4f4; font-size: 16px; font-family: Verdana;\">Teacher Review</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"topbar\" style=\"margin-left:1230px; width: 50px;  align-content: center; margin-top: -20px; height: 20px;\">\n");
      out.write("            <a href=\"FeedbackWebsite.jsp\" class=\"links\" style=\"color:#f4f4f4; font-size: 16px; padding-top: 30px; font-family: Verdana;\">Feedback</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"topbar\" style=\"margin-left:1150px; width: 50px;  align-content: center; margin-top: -30px; height: 20px;\">\n");
      out.write("            <a href=\"frontPage.jsp\" class=\"links\" style=\"color:#f4f4f4; font-size: 16px; padding-top: 30px; font-family: Verdana;\">Home</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"sidebar\"> \n");
      out.write("        <br>\n");
      out.write("        <table style=\"margin-top:10px; width: 95%\">\n");
      out.write("            <tr>\n");
      out.write("          <td style=\"font-family: Verdana; color:#2d4259; font-size: 21px; padding-left:9px;\">SUBJECTS</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\" style=\"padding-top:15px;\"><a href=\"Physics.jsp\" class=\"links\">Physics</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\" ><a href=\"Chemistry.jsp\" class=\"links\">Chemistry</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Biology.jsp\" class=\"links\">Biology</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Mathematics.jsp\" class=\"links\">Mathematics</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Programming.jsp\" class=\"links\">Programming</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Music.jsp\" class=\"links\">Music</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Language.jsp\" class=\"links\">Language</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\"><a href=\"Help.jsp\" class=\"links\">Sports</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr style=\"width:90%;border: 1px solid grey;\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\">\n");
      out.write("                    <a href=\"Settings.jsp\" class=\"links\">\n");
      out.write("                    <image src=\"settings.jpg\" width=\"21px\" height=\"20px\"> &nbsp;&nbsp;Settings\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\">\n");
      out.write("                    <a href=\"SessionDestroy.jsp\" class=\"links\">\n");
      out.write("                    <image src=\"greylogout1.jpg\" width=\"21px\" height=\"20px\"> &nbsp;&nbsp;Logout\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"tdtheme\">\n");
      out.write("                    <a href=\"Help.jsp\" class=\"links\">\n");
      out.write("                    <image src=\"help.png\" width=\"21px\" height=\"20px\"> &nbsp;&nbsp;Help\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"contents\">\n");
      out.write("        <h1 style=\"color:#f4f4f4; padding-top: 10px; font-size: 25px; align-content: center; margin-left: 15px; font-family: Verdana; font-weight: normal;\">Popular Teachers</h1>\n");
      out.write("    </div>    \n");
      out.write("    <br>\n");
      out.write("    <div class=\"bottominfo\"><br><hr style=\"margin-top: 5px; height: 5px;\">\n");
      out.write("    </div>\n");
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
