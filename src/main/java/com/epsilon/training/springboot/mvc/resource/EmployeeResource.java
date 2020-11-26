package com.epsilon.training.springboot.mvc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epsilon.training.springboot.mvc.model.Employee;
import com.epsilon.training.springboot.mvc.service.EmployeeService;

@Controller
public class EmployeeResource {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeResource(EmployeeService service) {
		this.employeeService = service;
	}

	@RequestMapping(value = "/save", method = RequestMethod.PUT)
	public String saveEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "redicrect:/";
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {

		try {
			List<Employee> employees = employeeService.getAllEmployees();
			model.addAttribute("employees",employees);
			return "employee";
		} catch (Exception e) {

		}
		return null;
	}
}
