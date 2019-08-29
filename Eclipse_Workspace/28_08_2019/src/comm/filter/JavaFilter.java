package comm.filter;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;

import javax.servlet.annotation.WebServlet;


public class JavaFilter implements Filter{  
  
	public void init(FilterConfig arg0) throws ServletException 
	{}  
	      
	public void doFilter(ServletRequest req, ServletResponse resp,  
	    FilterChain chain) throws IOException, ServletException {  
	          
	    PrintWriter out=resp.getWriter();  
	    out.print("Before filter");  
	      
	chain.doFilter(req, resp);//sends request to next resource  
	      
	out.print("Atfer filter");  
	}  

    public void destroy()
    {}  
}  