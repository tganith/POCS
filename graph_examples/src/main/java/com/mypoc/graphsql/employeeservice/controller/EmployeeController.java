package com.mypoc.graphsql.employeeservice.controller;

import com.mypoc.graphsql.employeeservice.service.EmployeeService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/employeeservice")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public ResponseEntity<Object> getEmployees(@RequestBody String body){

        ExecutionResult execute= employeeService.getGraphQL().execute(body);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
