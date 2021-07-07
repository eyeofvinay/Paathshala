package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FeedbackWebsite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write(".topbar \n");
      out.write("{\n");
      out.write("  width: 450px;\n");
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
      out.write(".fields\n");
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
      out.write(".tdtheme\n");
      out.write("{\n");
      out.write("    border: 0px;\n");
      out.write("    border-bottom: 2px;\n");
      out.write("    margin: 0px auto;\n");
      out.write("    padding: 13px;\n");
      out.write("    font-family: arial;\n");
      out.write("    font-size: 20px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    opacity: 1px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    font-weight: 200;\n");
      out.write("    color:#2d4259;\n");
      out.write("    margin-left: 20px;\n");
      out.write("}\n");
      out.write(".links\n");
      out.write("{\n");
      out.write("    color: #2d4259;\n");
      out.write("    text-decoration: none;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".register \n");
      out.write("{\n");
      out.write("  margin: 0 auto;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  width: 1100px;\n");
      out.write("  height: 700px;\n");
      out.write("  padding: 25px;\n");
      out.write("  background: #f4f4f4;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write(".heading \n");
      out.write("{\n");
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
      out.write("  margin-left: 320px;\n");
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
      out.write("    <div class=\"topbar\">Help us provide you best\n");
      out.write("    </div>\n");
      out.write("    <div>   \n");
      out.write("        <form class=\"register\" action=\"FeedbackWebLogic.jsp\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h1 class=\"heading\"> Feedback Form</h1>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 670px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <h2 style='font-size:18px;font-family: arial; color:#2d4259;padding-top: 10px;padding-left: 45px;font-weight: 500;'>Thank you for using Paathshala! We value all our customers and strive to meet everyone's needs.</h2>\n");
      out.write("            <table class='tdtheme'>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        Date(enter today's date)\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <input type=\"date\" class=\"fields\" placeholder=\"Enter today's date\" name=\"Date\" >\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Were you satisfied with the customer service provided by us?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Yes\"name=\"radio1\" value=\"Yes\"><label for=\"Yes\">Yes</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"No\"name=\"radio1\" value=\"No\"><label for=\"No\">No</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Somewhat\" name=\"radio1\" value=\"Somewhat\"><label for=\"Somewhat\">Somewhat</label></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Was the customer service provided to you in an accessible manner?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Yes\"name=\"radio2\" value=\"Yes\"><label for=\"Yes\">Yes</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"No\"name=\"radio2\" value=\"No\"><label for=\"No\">No</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Somewhat\" name=\"radio2\" value=\"Somewhat\"><label for=\"Somewhat\">Somewhat</label></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Did you experience any problem accessing our website services?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Yes\"name=\"radio3\" value=\"Yes\"><label for=\"Yes\">Yes</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"No\"name=\"radio3\" value=\"No\"><label for=\"No\">No</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Somewhat\" name=\"radio3\" value=\"Somewhat\"><label for=\"Somewhat\">Somewhat</label></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Would you recommend this website to your friends?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Yes\"name=\"radio4\" value=\"Yes\"><label for=\"Yes\">Yes</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"No\"name=\"radio4\" value=\"No\"><label for=\"No\">No</label></div>\n");
      out.write("                        <div class='checkbox'><input type=\"radio\" id=\"Somewhat\" name=\"radio4\" value=Somewhat\"><label for=\"Somewhat\">Somewhat</label></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        How much would you like to rate our website out of 5?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <input type=\"text\" class=\"fields\" placeholder=\"Rating out of 5\" name=\"Rating\" >\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Any suggestions?\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <input type=\"textarea\" class=\"fields\" placeholder=\"Comments\" name=\"suggest\" >\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class='tdtheme' >\n");
      out.write("                        Your contact number\n");
      out.write("                    </td>\n");
      out.write("                    <td class='tdtheme'>\n");
      out.write("                        <input type=\"text\" class=\"fields\" placeholder=\"Contact number(optional)\" name=\"contactNo\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"reset\" class=\"button\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class=\"button\" style=\"margin-top: -20px; margin-left: 10px;\">\n");
      out.write("                \n");
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
