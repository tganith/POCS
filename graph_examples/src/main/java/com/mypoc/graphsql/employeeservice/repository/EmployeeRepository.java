package com.mypoc.graphsql.employeeservice.repository;

import com.mypoc.graphsql.employeeservice.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	public List<Employee> findAll();
	
}
