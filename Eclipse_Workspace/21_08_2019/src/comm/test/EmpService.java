package comm.test;

import java.util.List;

public interface EmpService {
	public void createEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int id);
}