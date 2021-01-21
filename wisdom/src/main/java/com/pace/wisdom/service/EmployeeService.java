package com.pace.wisdom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pace.wisdom.model.Employee;
import com.pace.wisdom.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee SaveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> SaveAllEmployee(List<Employee> employee) {
		return employeeRepository.saveAll(employee);
	}

	public Employee findEmployee(Integer id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public String deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public Employee updateEmployee(Employee employee) {
		Employee empnew = employeeRepository.findById(employee.getId()).orElse(null);
		empnew.setFirstname(employee.getFirstname());
		empnew.setLastname(employee.getLastname());
		empnew.setEmailid(employee.getEmailid());
		empnew.setAge(employee.getAge());
		empnew.setGender(employee.getGender());
		empnew.setAddress(employee.getAddress());
		return employeeRepository.save(empnew);
	}

}
