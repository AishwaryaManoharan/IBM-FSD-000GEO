package com.example.springjoke.service;

package com.example.springh2.service;

import java.util.List;

import com.example.springh2.model.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}