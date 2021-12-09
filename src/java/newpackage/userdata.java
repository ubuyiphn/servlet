package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class userdata extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {   
        response.setContentType("text/html");
        
        PrintWriter writer =  response.getWriter();
        
        String name = request.getParameter("user.name");
        
        String email = request.getParameter("user.email");
        
        String phone = request.getParameter("user.phone");
        
        String gender = request.getParameter("user.gender");
        
        writer.println("Today date and time is "+new Date().toString()+"");
        
        writer.println("<h2>Name : "+name+"</h2>");
        
        writer.println("<h2>Email : "+email+"</h2>");
         
        writer.println("<h2>Phone : "+phone+"</h2>");
          
        writer.println("<h2>Gender : "+gender+"</h2>");
    }
  
}
