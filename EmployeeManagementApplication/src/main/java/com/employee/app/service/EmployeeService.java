package com.employee.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.domain.Employee;
import com.employee.app.exception.ResourceNotFoundException;
import com.employee.app.repository.EmployeeRepository;

@Service // This means that this class is a service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	//get all employees
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	//save an employee
	public void saveEmployee(Employee emp) {
		
		employeeRepository.save(emp);
	}

	//get employee by id
	public Employee getEmployeeById(Integer id) {
		
		Employee emp = employeeRepository.getById(id);

		if (emp == null) {
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
		return emp;

	}

	//delete employee by id
	public String deleteEmployeeById(Integer id) {
		
		Employee emp = employeeRepository.getById(id);

		if (emp == null) {
			throw new RuntimeException("Employee not found");
		}

		employeeRepository.deleteById(id);
		return "Deleted: " + emp.getEmpName();
	}
}
