package com.yasser.itblocktask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.itblocktask.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	public void addEmployee (Employee emp) {
		employeeRepository.save(emp);
		
	}
	
	public List<Employee> getAllEmployee (){
		List<Employee> employee = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}

}
