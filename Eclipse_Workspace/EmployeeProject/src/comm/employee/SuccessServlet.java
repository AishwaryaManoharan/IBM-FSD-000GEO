package comm.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import comm.example.model.League;

@WebServlet("/savesuccess.view")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		EmployeeModel e = (EmployeeModel) request.getAttribute("SUCCESS");
		out.println("Name : "+e.getName()
				+"<br/>"
				+ "Password : "+e.getPassword()
				+"<br/>"
				+ "Email : "+e.getEmail()
				+"<br/>"
				+"Country : "+e.getCountry());
		out.println("Entries added to db sucessfully...");


	}
}