package com.arslanyakup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arslanyakup.dao.DepartmentDAO;
import com.arslanyakup.dao.EmployeeDAO;
import com.arslanyakup.model.Department;
import com.arslanyakup.model.Employee;

@Controller
public class EmployeeController {

	private EmployeeDAO employeeDAO;

	private DepartmentDAO departmentDAO;

	@Autowired
	public EmployeeController(EmployeeDAO employeeDAO, DepartmentDAO departmentDAO) {
		super();
		this.employeeDAO = employeeDAO;
		this.departmentDAO = departmentDAO;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage(Model model) {
		model.addAttribute("newEmployee", new Employee());
		model.addAttribute("empList", employeeDAO.findAll());
		model.addAttribute("deptList", departmentDAO.findAllDepartment());
		return "/index";
	}

	@RequestMapping(value = "/employee.add", method = RequestMethod.POST)
	public String employeeAddMethod(@ModelAttribute("newEmployee") Employee employee) {
		Department department = departmentDAO.findBy(employee.getDepartment().getId());
		employee.setDepartment(department);
		employeeDAO.insertEmployee(employee);
		return "redirect:/";
	}

	@RequestMapping(value = "/employee.delete{empId}", method = RequestMethod.GET)
	public String employeeDelete(@RequestParam("empId") String id) {
		employeeDAO.removeEmployee(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/employee.edit{empId}", method = RequestMethod.GET)
	public String employeeEdit(@RequestParam("empId") String emp_id, Model model) {
		Employee employee = employeeDAO.findBy(emp_id);
		model.addAttribute("newEmployee", employee);
		model.addAttribute("deptList", departmentDAO.findAllDepartment());
		model.addAttribute("empList", employeeDAO.findAll());
		model.addAttribute("update", "update");
		System.out.println(employee);
		return "/index";
	}

	@RequestMapping(value = "/employee.update{empId}", method = RequestMethod.POST)
	public String employeeUpdate(@ModelAttribute("newEmployee") Employee employee) {
		Department department = departmentDAO.findBy(employee.getDepartment().getId());
		employee.setDepartment(department);
		System.out.println(employee);
		employeeDAO.updateEmployee(employee);
		System.out.println("update çalýþtý...");
		return "redirect:/";
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

}
