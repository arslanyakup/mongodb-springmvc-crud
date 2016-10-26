package com.arslanyakup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arslanyakup.dao.EmployeeDAO;
import com.arslanyakup.dao.EmployeeRepository;
import com.arslanyakup.model.Employee;

@Controller
public class EmployeeController {

	private EmployeeRepository employeeRepository;

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository, EmployeeDAO employeeDAO) {
		super();
		this.employeeRepository = employeeRepository;
		this.employeeDAO = employeeDAO;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage(Model model) {
		model.addAttribute("newEmployee", new Employee());
		return "/anasayfa";
	}

	@RequestMapping(value = "employee.add", method = RequestMethod.POST)
	public String personAddMethod(@ModelAttribute("newEmployee") Employee employee, Model model) {
		employeeDAO.insertEmployee(employee);
		return "redirect:/anasayfa";
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

}
