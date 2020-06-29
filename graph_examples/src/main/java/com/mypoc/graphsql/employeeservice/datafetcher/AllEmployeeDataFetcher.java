package com.mypoc.graphsql.employeeservice.datafetcher;

import com.mypoc.graphsql.employeeservice.entities.Employee;
import com.mypoc.graphsql.employeeservice.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllEmployeeDataFetcher implements DataFetcher<List<Employee>>{
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> get(DataFetchingEnvironment environment) {
		return repository.findAll();
	}
}
