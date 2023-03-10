package com.greatlearning.ems.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;
import com.greatlearning.ems.service.EmployeeService;

@Service


public class EmployeeServiceImpl implements EmployeeService{
private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();

	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}


}