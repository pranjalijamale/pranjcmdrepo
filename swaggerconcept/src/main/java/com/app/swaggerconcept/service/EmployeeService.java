package com.app.swaggerconcept.service;

import com.app.swaggerconcept.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);

	public Employee getEmployee(String uname, String pw);

}
