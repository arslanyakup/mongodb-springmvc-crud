package com.arslanyakup.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.arslanyakup.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


	private final MongoOperations mongos;

	@Autowired
	public EmployeeDAOImpl(final MongoOperations mongos) {
		super();
		this.mongos = mongos;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		mongos.insert(employee);
		return employee;
	}

	@Override
	public void insertAllEmployees(List<Employee> employees) {
		mongos.insert(employees, Employee.class);
	}

	@Override
	public List<Employee> findAll() {
		return mongos.findAll(Employee.class);
	}

	@Override
	public List<Employee> findAllBy(String name) {

		Query query = new Query().addCriteria(Criteria.where("name").is(name));
		return mongos.find(query, Employee.class);
	}

	@Override
	public void removeEmployee(String id) {
		mongos.remove(findBy(id));
	}

	@Override
	public Employee findBy(String id) {
		Query query = Query.query(Criteria.where("id").is(id));
		Employee employee = mongos.findOne(query, Employee.class);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return null;
	}

}
