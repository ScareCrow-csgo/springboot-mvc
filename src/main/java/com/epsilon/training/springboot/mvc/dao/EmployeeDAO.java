package com.epsilon.training.springboot.mvc.dao;

import java.util.List;

import com.epsilon.training.springboot.mvc.model.Employee;

public interface EmployeeDAO {
	
	Employee save(Employee employee); //Inserting
	List<Employee> getAllEmployees();  //Fetching
	Employee findEmployeeById(int Id); //Fetching
	List<Employee> findEmployeeByName(String Name); //Fetching
	List<Employee> findEmployeeByNameAndAge(String Name, int Age); //Fetching
	boolean updateEmployee(Employee employee); //Update
	boolean deleteEmployee(int Id);  //Delete by Id
	boolean deleteEmployee(String Name);	 //Delete By Name

}
