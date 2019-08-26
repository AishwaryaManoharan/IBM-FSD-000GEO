package comm.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpImpl implements EmpInterface {
	
	private MyConnectionFactory factory=null;
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	

	public EmpImpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		con=factory.getConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee");
			while(rs.next()) {
				list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void createEmp(Employee emp) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1,emp.getId());
			ps.setString(2, emp.getFname());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getEmail());
			ps.execute(); 
			
		}catch(SQLException e) {
			System.err.println("Duplicate Id");
			e.printStackTrace();
		}
			//finally{
//			System.out.println("Prgm executed");
//		}
		
	}
	
	public void deleteEmp(int id) {
		try {
			ps=con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			ps.execute();
		}catch(SQLException e) {
			System.err.println("Id not Found");
			e.printStackTrace();
		}
//		finally{
//			System.out.println("Prgm executed");
//		}
	}
	public boolean updateFname(int id,String fname) {
		try {
			ps=con.prepareStatement("update employee set fname=? where id=?");
			ps.setString(1, fname);
			ps.setInt(2, id);
			ps.execute();
			return true;
		}catch(SQLException e) {
			System.err.println("Id not found");
			return false;
		}
	}
	public boolean updateLname(int id,String lname) {
		try {
			ps=con.prepareStatement("update employee set lname=? where id=?");
			ps.setString(1, lname);
			ps.setInt(2, id);
			ps.execute();
			return true;
		}catch(SQLException e) {
			System.err.println("Id not found");
			return false;
		}
	}
	public boolean updateEmail(int id,String email) {
		try {
			ps=con.prepareStatement("update employee set email=? where id=?");
			ps.setString(1, email);
			ps.setInt(2, id);
			ps.execute();
			return true;
		}catch(SQLException e) {
			System.err.println("Id not found");
			return false;
		}
	}
	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}