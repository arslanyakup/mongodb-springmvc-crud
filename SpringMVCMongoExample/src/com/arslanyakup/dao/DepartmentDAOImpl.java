package com.arslanyakup.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.arslanyakup.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	private final MongoOperations mongos;

	@Autowired
	public DepartmentDAOImpl(MongoOperations mongos) {
		super();
		this.mongos = mongos;
	}

	@Override
	public Department insertDepartment(Department department) {
		mongos.insert(department);
		return department;
	}

	@Override
	public Department findBy(String id) {
		Query query = new Query().addCriteria(Criteria.where("id").is(id));
		Department department = mongos.findOne(query, Department.class);
		return department;
	}

	@Override
	public List<Department> insertAllDepartment(List<Department> deptList) {
		mongos.insertAll(deptList);
		return deptList;
	}

	@Override
	public List<Department> findAllDepartment() {

		List<Department> deptList = mongos.findAll(Department.class);
		return deptList;
	}

}
