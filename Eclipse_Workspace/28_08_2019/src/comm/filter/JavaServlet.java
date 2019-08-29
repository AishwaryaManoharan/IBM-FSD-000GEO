package comm.filter;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/servlet")  
public class JavaServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = -1910928249217674411L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
        out.print("<br>welcome to servlet<br>");  
          
    }  
  
}  