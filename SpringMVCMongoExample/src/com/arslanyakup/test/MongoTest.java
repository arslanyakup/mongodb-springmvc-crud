package com.arslanyakup.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arslanyakup.dao.EmployeeDAO;
import com.arslanyakup.dao.EmployeeRepository;
import com.arslanyakup.model.Department;
import com.arslanyakup.model.Employee;

public class MongoTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/springContext.xml");
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		Department department1 = new Department("Computer Eng.", 1);
		Department department2 = new Department("Electrical Eng.", 2);
		Department department3 = new Department("Machine Eng.", 3);
		Department department4 = new Department("Mechatronic Eng.", 4);

		Employee employee1 = new Employee("Muhammet", "Güler", 3000, department1);
		Employee employee2 = new Employee("Emre", "Tunç", 5000, department2);
		Employee employee3 = new Employee("Fýrat", "Ay", 2000, department3);
		Employee employee4 = new Employee("Selim", "Hamzaoðullarý", 3000, department4);
		Employee employee5 = new Employee("Emre", "Yýlmaz", 4000, department1);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee5);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);

		//employeeDAO.insertAllEmployees(employees);
	}
}
