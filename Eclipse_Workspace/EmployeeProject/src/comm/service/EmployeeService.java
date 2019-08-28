package comm.service;

import java.util.List;

import comm.employee.EmployeeModel;

public interface EmployeeService {
	public void createEmployee(EmployeeModel employee);
	public List<EmployeeModel> getAllEmployees();
	public EmployeeModel getEmployeeById(int uid);

}