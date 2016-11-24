package com.arslanyakup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees", language = "turkish")
public class Employee {

	@Id
	private String id;
	private String name;
	private String surname;
	private int salary;
	private Department department;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(String name, String surname, int salary, Department department) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String id, String name, String surname, int salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.department = department;
	}
	

	public Employee(String id) {
		super();
		this.id = id;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", department="
				+ department + "]";
	}

}
