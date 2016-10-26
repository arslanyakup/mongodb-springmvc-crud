package com.arslanyakup.dao;

import java.util.List;

import com.arslanyakup.model.Employee;

public interface EmployeeDAO {
	public Employee insertEmployee(Employee employee);

	public List<Employee> insertAllEmployees(List<Employee> employees);

	
}
