package comm.test;

import java.util.List;

public interface EmpInterface {
	public void createEmp(Employee emp);
	public List<Employee> getAllEmp();
	public Employee getEmpById(int id);

}