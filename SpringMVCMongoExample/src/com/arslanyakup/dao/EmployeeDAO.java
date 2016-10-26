package com.arslanyakup.dao;

import java.util.List;

import com.arslanyakup.model.Employee;

public interface EmployeeDAO {
    public Employee insertEmployee(Employee employee);

    public void insertAllEmployees(List<Employee> employees);

    public List<Employee> findAll();

    public List<Employee> findAllBy(String name);

}