package com.app.swaggerconcept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.swaggerconcept.model.Employee;
import com.app.swaggerconcept.service.EmployeeService;



@RestController
public class HomeController {
	
	@Autowired
	EmployeeService es;
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		
		Employee empl=	es.addEmployee(emp);
		System.out.println(emp);
		return new ResponseEntity<Employee>(empl, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getemp/{uname}/{pw}")
	public ResponseEntity<Employee> getEmployee(@PathVariable ("uname") String uname, @PathVariable ("pw") String pw){
		
		Employee emp=	es.getEmployee(uname,pw);
		return new ResponseEntity<Employee> (emp, HttpStatus.ACCEPTED);
		
	}
	

}
