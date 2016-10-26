package com.arslanyakup.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arslanyakup.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
}
