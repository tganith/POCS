package com.mypoc.graphsql.employeeservice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    Long id;
    @Column(name = "deptname")
    String deptName;
    String location;

    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }
}
