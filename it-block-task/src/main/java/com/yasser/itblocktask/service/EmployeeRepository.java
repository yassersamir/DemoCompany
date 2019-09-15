package com.yasser.itblocktask.service;


import org.springframework.data.repository.CrudRepository;

import com.yasser.itblocktask.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
