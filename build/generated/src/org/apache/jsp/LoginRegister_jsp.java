package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class LoginRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String button1=request.getParameter("Signup");
    int REGISTER=0;
    if(button1!=null && button1.equals("Create Account"))
    {
        String name=request.getParameter("FullName");
        String userId=request.getParameter("UserId");
        String mail=request.getParameter("Email");
        String password=request.getParameter("pass");
        String contactNo=request.getParameter("Contact");
        String post=request.getParameter("who");    
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        
            if(post.equals("I'm a Teacher"))
            {
                PreparedStatement st=con.prepareStatement("select * from teacherinfo where UserId=?");
                st.setString(1,userId);        
                ResultSet rs=st.executeQuery();
                if(rs.next())
                {
                    REGISTER=1;
                }
                else
                {
                PreparedStatement ps = con.prepareStatement("insert into teacherinfo values (?,?,?,?,?)"); 
                ps.setString(1, userId);
                ps.setString(2, name);
                ps.setString(3, mail);
                ps.setString(4, password);
                ps.setString(5, contactNo); 
       
                session.setAttribute("ID", userId);
       
                ps.executeUpdate();
                response.sendRedirect("SubjectSelection.jsp");
                }
            }
            else if(post.equals("I'm a Student"))
            {
                PreparedStatement st=con.prepareStatement("select * from studentinfo where UserId=?");
                st.setString(1,userId);        
                ResultSet rs=st.executeQuery();
                if(rs.next())
                {
                    REGISTER=1;
                }
                else
                {
                PreparedStatement ps = con.prepareStatement("insert into studentinfo values (?,?,?,?,?)"); 
                ps.setString(1, userId);
                ps.setString(2, name);
                ps.setString(3, mail);
                ps.setString(4, password);
                ps.setString(5, contactNo);
                
                ps.executeUpdate();
       
                response.sendRedirect("LoginRegister.jsp");
                }
            }
            
        con.close();
    }
    
    String button=request.getParameter("Submit");
    int LOGIN=0;
    if(button!=null && button.equals("Login"))
    {
    String userId=request.getParameter("UserId");
    String password=request.getParameter("pass");
    String post=request.getParameter("who");

    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    
    if(post.equals("I'm a Teacher"))
    {
       PreparedStatement ps = con.prepareStatement("select * from teacherinfo where UserId=? and Password=?"); 
       ps.setString(1, userId);
       ps.setString(2, password);
       
       ResultSet rs=ps.executeQuery();
       if(rs.next())
       {
           session.setAttribute("ID", userId);
           response.sendRedirect("TeacherProfile.jsp");
       }
       else
       {
           LOGIN=1;
       }
      
    }
    else
    {
      PreparedStatement ps1 = con.prepareStatement("select * from studentinfo where UserId=? and Password=?"); 
       ps1.setString(1, userId);
       ps1.setString(2, password);
       
       ResultSet rs=ps1.executeQuery();
       if(rs.next())
       {
           session.setAttribute("ID", userId);
           response.sendRedirect("StudentPage.jsp");
       }
       else
       {
           LOGIN=1;
       }
    }
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("body {\n");
      out.write("  font: 20px 'Arial';\n");
      out.write("  background: #2d4259;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".heading {\n");
      out.write("  width: 270px;\n");
      out.write("  line-height: 43px;\n");
      out.write("  margin: 60px auto;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  font-size: 21px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  text-shadow: 2px 1px 2px black;\n");
      out.write("  background: slategrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".register {\n");
      out.write("  margin: 0 auto;\n");
      out.write("  width: 250px;\n");
      out.write("  padding: 20px;\n");
      out.write("  background: #f4f4f4;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  font-family: arial;\n");
      out.write("  font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fields{\n");
      out.write("  width: 100%;\n");
      out.write("  height: 38px;\n");
      out.write("  margin-top: 2px;\n");
      out.write("  font-weight: 500;\n");
      out.write("  background: none;\n");
      out.write("  border: 0;\n");
      out.write("  border-bottom: 1px solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button\n");
      out.write("{\n");
      out.write("  width: 100%;\n");
      out.write("  height: 42px;\n");
      out.write("  margin-top: 25px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  text-align: center;\n");
      out.write("  background: none;\n");
      out.write("  border: 1px solid;\n");
      out.write("  border-color: lightgrey;\n");
      out.write("  border-radius: 2px;\n");
      out.write("}\n");
      out.write(".custom-select select {\n");
      out.write("  display: none; /*hide original SELECT element: */\n");
      out.write("}\n");
      out.write(".option\n");
      out.write("{\n");
      out.write("    font-weight: 500; \n");
      out.write("    font-family: arial; \n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>    \n");
      out.write("    <body bgcolor=\"blue\">\n");
      out.write("    <h1  class=\"heading\">Welcome to <font style='color:lightblue; font-weight:bold;'>Paathshala</font>!</h1>\n");
      out.write("    \n");
      out.write("    <form class=\"register\" action=\"\">\n");
      out.write("        <input type=\"text\" class=\"fields\" placeholder=\"Full Name\" name=\"FullName\">\n");
      out.write("        <input type=\"text\" class=\"fields\" placeholder=\"Username\" name=\"UserId\">\n");
      out.write("        <input type=\"email\" class=\"fields\" placeholder=\"Email address\" name=\"Email\" >\n");
      out.write("        <input type=\"password\" class=\"fields\" placeholder=\"Password\" name=\"pass\">\n");
      out.write("        <input type=\"text\" class=\"fields\" placeholder=\"Contact Number\" name=\"Contact\">\n");
      out.write("        <select class=\"fields\" name=\"who\">\n");
      out.write("            <option>I'm a Teacher</option>\n");
      out.write("            <option>I'm a Student</option>\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"Create Account\" class=\"button\" name=\"Signup\">\n");
      out.write("        ");

        if(REGISTER==1)
        {
      out.write("\n");
      out.write("        <h2 style=\"color:red; font-size:  12px;\" >Username already exists.</h2>\n");
      out.write("        ");
}
    
      out.write("\n");
      out.write("  </form>\n");
      out.write("    \n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  <hr style=\"width:20%;border: 1px solid grey;\">\n");
      out.write("  <br>\n");
      out.write("  <form class=\"register\" action=\"\" method=\"POST\">\n");
      out.write("      <input type=\"text\" class=\"fields\" placeholder=\"Username\" name=\"UserId\" >\n");
      out.write("    <input type=\"password\" class=\"fields\" placeholder=\"Password\" name='pass'>\n");
      out.write("     <select class=\"fields\" name=\"who\">\n");
      out.write("        <option>I'm a Teacher</option>\n");
      out.write("        <option>I'm a Student</option>\n");
      out.write("    </select>\n");
      out.write("    <input type=\"submit\" value=\"Login\" class=\"button\" name=\"Submit\">\n");
      out.write("    ");

        if(LOGIN==1)
        {
      out.write("\n");
      out.write("        <h2 style=\"color:red; font-size:  12px;\" >Invalid Username or Password.</h2>\n");
      out.write("        ");
}
    
      out.write("\n");
      out.write("  </form>\n");
      out.write("</body>\n");
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
