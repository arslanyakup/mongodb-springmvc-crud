package com.arslanyakup.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arslanyakup.model.Employee;


public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	
	
}
