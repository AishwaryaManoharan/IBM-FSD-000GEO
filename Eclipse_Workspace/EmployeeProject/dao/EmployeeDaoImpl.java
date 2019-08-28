import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.employee.MyConnectionFactory;
import comm.employee.EmployeeModel;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	

	public EmployeeDaoImpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
	}

	

	@Override
	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> list=new ArrayList<EmployeeModel>();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from employee");
			while(resultSet.next())
			{
				list.add(new EmployeeModel(resultSet.getString(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public EmployeeModel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void createEmployee(EmployeeModel employee) {
	try {
		pStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
		pStatement.setString(1, employee.getName());
		pStatement.setString(2, employee.getPassword());
		pStatement.setString(3, employee.getEmail());
		pStatement.setString(4, employee.getCountry());
		pStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		System.out.println("duplicate id");
		
		e.printStackTrace();
	} finally {
		
	}	
	}

}