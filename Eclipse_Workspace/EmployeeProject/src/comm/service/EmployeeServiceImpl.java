package comm.service;

import java.sql.SQLException;
import java.util.List;

import comm.dao.EmployeeDao;
import comm.dao.EmployeeDaoImpl;
import comm.employee.EmployeeModel;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(EmployeeModel employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<EmployeeModel> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public EmployeeModel getEmployeeById(int id) {

		return null;
	}

}