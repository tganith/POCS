package com.mypoc.graphsql.employeeservice.entities;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    Long id;

    String name;

    int age;

    @Column(name = "mobilenumber")
    String mobileNumber;

    String role;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(foreignKey = @ForeignKey(name = "dept_id"), name = "deptid")
    Department department;


    public Employee() {
    }

    public Employee(String name, int age, String mobileNumber, String role) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
