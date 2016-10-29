package com.arslanyakup.dao;

import java.util.List;

import com.arslanyakup.model.Department;

public interface DepartmentDAO {

	public Department insertDepartment(Department department);

	public List<Department> insertAllDepartment(List<Department> deptList);

	public Department findBy(String id);

	public List<Department> findAllDepartment();
}
