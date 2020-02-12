package com.morningstar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeInfo {

    private int employeeId;
    private String name;
    //    private String position;
//    private String address;
    private double salary;
    private String gender;
    //    private int phoneNumber;
    private String emailId;
//    private String department;


    public EmployeeInfo() {
    }

    public EmployeeInfo(int employeeId, String name, double salary, String gender, String emailId) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.emailId = emailId;
    }

    public EmployeeInfo(int employeeId, String name, String gender, String emailId) {
    }
}
