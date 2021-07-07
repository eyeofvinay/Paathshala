package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class ViewReview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    String name=request.getParameter("name");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
     PreparedStatement st=con.prepareStatement("select * from teacherfeedback where TName=?");
        st.setString(1,name);    
        
            ArrayList list1=new ArrayList();
            ArrayList list2=new ArrayList();
            ArrayList list3=new ArrayList();
            ArrayList list4=new ArrayList();
            ArrayList list5=new ArrayList();
            ArrayList list6=new ArrayList();
            ArrayList list7=new ArrayList();
            ArrayList list8=new ArrayList();
            ArrayList list9=new ArrayList();
        ResultSet rs=st.executeQuery();
        
        while(rs.next())
        {
            list1.add(rs.getString(1));
            list2.add(rs.getString(2));
            list3.add(rs.getString(3));
            list4.add(rs.getString(4));
            list5.add(rs.getString(5));
            list6.add(rs.getString(6));
            list7.add(rs.getFloat(7));
            list8.add(rs.getString(8));
            list9.add(rs.getString(9));        
          
        }

      out.write("\n");
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
      out.write("    font-size: 17px;\n");
      out.write("    align-content: center;\n");
      out.write("    opacity: 1px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    font-weight: 200;\n");
      out.write("    color:#2d4259;\n");
      out.write("    margin-left: 20px;\n");
      out.write("    border-right: 1px solid black;\n");
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
      out.write("  height: 780px;\n");
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
      out.write("  width: 12%;\n");
      out.write("  height: 35px;\n");
      out.write("  margin-top: 30px;\n");
      out.write("  margin-left: 420px;\n");
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
      out.write("        <form class=\"register\" action=\"\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h1 class=\"heading\"> Student Reviews</h1>\n");
      out.write("            <hr style='width:35%;margin-left: 30px; margin-top: -33px; margin-bottom: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <hr style='width:35%;margin-left: 670px; margin-top: 0px; border: 1.5px solid grey;'>\n");
      out.write("            <h2 style='font-size:18px;font-family: arial; color:#2d4259;padding-top: 10px;padding-left: 45px;font-weight: 500;'>Thank you for using Paathshala! We value all our customers and strive to meet everyone's needs.</h2>\n");
      out.write("            <table class=\"tdtheme\" style=\"margin-left:200px; border:none;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tdtheme\" style=\"border:none; width:270px; margin-left: 70px;\" >\n");
      out.write("                        Enter your name\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"tdtheme\" style=\"border:none; width: 250px;\">\n");
      out.write("                        <input type=\"text\" name=\"name\" class=\"fields\">\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"View\" class=\"button\" style=\"margin-top: -20px; \">\n");
      out.write("            <br>\n");
      out.write("            <table class=\"tdtheme\" style=\"border:none;\">\n");
      out.write("                <tr>\n");
      out.write("                <th class=\"tdtheme\">Date</th>\n");
      out.write("                <th class=\"tdtheme\">Name</th>\n");
      out.write("                <th class=\"tdtheme\">Course</th>\n");
      out.write("                <th class=\"tdtheme\">Quality Education</th>\n");
      out.write("                <th class=\"tdtheme\">Issues with Faculty</th>\n");
      out.write("                <th class=\"tdtheme\">Abusive behaviour</th>\n");
      out.write("                <th class=\"tdtheme\">Rating</th>\n");
      out.write("                <th class=\"tdtheme\">Remarks</th>\n");
      out.write("                <th class=\"tdtheme\">Contact</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for(int i=0;i<list1.size();i++)
                    {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list1.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list2.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list3.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list4.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list5.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list6.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list7.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list8.get(i));
      out.write("</td>\n");
      out.write("                    <td class=\"tdtheme\">");
      out.print(list9.get(i));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
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
