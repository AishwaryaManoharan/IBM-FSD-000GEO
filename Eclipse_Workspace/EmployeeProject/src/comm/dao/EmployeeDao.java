package comm.dao;

import java.util.List;

import comm.employee.EmployeeModel;

public interface EmployeeDao {
	
	public void createEmployee(EmployeeModel employee);
	public List<EmployeeModel> getAllEmployees();
	public EmployeeModel getEmployeeById(int id);

}
