package com.app.swaggerconcept.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.swaggerconcept.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	
	public  Employee findByUnameAndPw(String uname, String pw);
	
}
