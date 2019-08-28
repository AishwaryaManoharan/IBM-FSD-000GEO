package comm.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import com.mysql.cj.xdevapi.PreparableStatement;

//import comm.example.model.League;
@WebServlet("/action.do")
public class EmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	EmployeeModel e=new EmployeeModel();
	
	private String name,password,email,country;
	
    private List<String> errMsgs;   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try {
				doProcess(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try {
				doProcess(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		errMsgs=new LinkedList<String>();
		
		//country
		String country = request.getParameter("country");
		if(country.equals("Unknown"))
		{
			errMsgs.add("please select a valid country");
		}
		
		
		//email
		email=request.getParameter(email);
		
		//name
		name=request.getParameter("name");
		if(name.toString().length()<2)
		{
			errMsgs.add("Name is too short.");
		}
		
		//password
		password=request.getParameter("password");
		if(password.toString().length()<5)
		{
			errMsgs.add("Password is too short.Security issues");
		}
		
		if(errMsgs.isEmpty())
		{
			request.setAttribute("SUCCESS", new EmployeeModel(name,password,email,country));
			Connection connection=MyConnectionFactory.getMySqlConnectionForAISH();
			PreparedStatement pst=connection.prepareStatement("insert into empl(name,password,email,country,uid) values(?,?,?,?,?)");
			
			pst.setString(1, name);
			pst.setString(2, password);
			pst.setString(3, email);
			pst.setString(4,country);
			
			pst.setInt(5, e.serialVersionUID++);
			
			pst.executeUpdate();
			RequestDispatcher  view=request.getRequestDispatcher("savesuccess.view");
			view.forward(request, response);
		}
		else {
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view=request.getRequestDispatcher("action.do");
			view.forward(request, response);
		}
		
	}


}