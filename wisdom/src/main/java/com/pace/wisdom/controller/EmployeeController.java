package com.pace.wisdom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pace.wisdom.model.Employee;
import com.pace.wisdom.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Task 1
	@PostMapping("/addEmployye")
	public Employee addNewEmployee(@RequestBody Employee employee) {
		return employeeService.SaveEmployee(employee);
	}

	@PostMapping("/addManyEmployee")
	public List<Employee> addNewManyEmployee(@RequestBody List<Employee> employee) {
		return employeeService.SaveAllEmployee(employee);
	}

	// Task 2
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	// Task 3
	@GetMapping("/getById/{id}")
	public Employee getDetailsById(@PathVariable Integer id) {
		return employeeService.findEmployee(id);
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllDetails() {
		return employeeService.getAllEmployee();
	}

	// Task 4
	@PutMapping("/deleteEmployeeById/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return employeeService.deleteEmployee(id);
	}

}
