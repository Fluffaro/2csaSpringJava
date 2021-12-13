package com.csa.samplefullstack.entity;


import javax.persistence.*;

@Entity
@Table(name="tbl_employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String department;
    private String location;

    public Employee(Long employeeId, String name, String department, String location){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.location = location;
    }


    public Employee(){

    }


    public Long getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(Long employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }


}