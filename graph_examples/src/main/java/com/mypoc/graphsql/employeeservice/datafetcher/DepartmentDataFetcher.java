package com.mypoc.graphsql.employeeservice.datafetcher;

import com.mypoc.graphsql.employeeservice.entities.Department;
import com.mypoc.graphsql.employeeservice.entities.Employee;
import com.mypoc.graphsql.employeeservice.repository.DepartmentRepository;
import com.mypoc.graphsql.employeeservice.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDataFetcher implements DataFetcher<Department> {
    @Autowired
    DepartmentRepository repository;

    @Override
    public Department get(DataFetchingEnvironment environment) {
        Long deptId = environment.getArgument("id");
        return repository.findById(deptId).get();
    }
}
