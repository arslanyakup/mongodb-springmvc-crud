package com.arslanyakup.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.arslanyakup.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	MongoTemplate mongoTemplate;

	@Autowired
	public EmployeeDAOImpl(MongoTemplate mongoTemplate) {
		super();
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		mongoTemplate.insert(employee);
		return employee;
	}

	@Override
	public List<Employee> insertAllEmployees(List<Employee> employees) {
		mongoTemplate.insert(employees, Employee.class);
		return employees;
	}

}
