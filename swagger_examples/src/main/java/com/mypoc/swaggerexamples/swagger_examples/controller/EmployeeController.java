package com.mypoc.swaggerexamples.swagger_examples.controller;

import com.mypoc.swaggerexamples.swagger_examples.beans.Employee;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController {

    List<Employee> employeeList = new ArrayList<>();

    @GetMapping(path = "/employees")
    @ApiOperation(value = "getAllEmps" ,authorizations = {@Authorization(value = "basicAuth")})
    public List<Employee> getEmployees(){
        loadData();
        return employeeList;
    }

    private void loadData() {
        employeeList.add(new Employee(100,"ganitha","bangalore"));
        employeeList.add(new Employee(101,"krishna","bangalore"));
        employeeList.add(new Employee(102,"rama","bangalore"));
    }

    @GetMapping(path = "/employees/{empId}")
    @ApiOperation(value = "getEmp" ,authorizations = {@Authorization(value = "basicAuth")})
    public Employee getEmployee(@PathVariable(name = "empId") int empId){
        loadData();
        Employee employee = employeeList.stream().filter(emp-> empId == emp.getEmpId()).findAny().orElse(null);
        return employee;
    }
}
