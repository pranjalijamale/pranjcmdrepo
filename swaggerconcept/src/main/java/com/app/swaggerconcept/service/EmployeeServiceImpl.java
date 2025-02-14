package com.app.swaggerconcept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.swaggerconcept.model.Employee;
import com.app.swaggerconcept.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo er;

	@Override
	public Employee addEmployee(Employee emp) {
		Employee emps= er.save(emp);
		return emps;
	}

	@Override
	public Employee getEmployee(String uname, String pw) {
		Employee emps=	er.findByUnameAndPw(uname, pw);
		return emps;
	}
	
	
	
}
