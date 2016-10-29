package com.arslanyakup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="departments",language="turkish")
public class Department {

	@Id
	private String id;
	private String dept_name;
	private int dept_no;

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department(String dept_name, int dept_no) {
		super();
		this.dept_name = dept_name;
		this.dept_no = dept_no;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dept_name=" + dept_name + ", dept_no=" + dept_no + "]";
	}
	
	



}
