package com.morningstar.controller;

import com.morningstar.EmployeeInfo;
import com.morningstar.ManageEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    ManageEmployee manageEmployee;

    @GetMapping("/employee/{employeeId}")
    public EmployeeInfo getEmployee(@PathVariable("employeeId") int employeeId){
        EmployeeInfo employeeInfo= manageEmployee.findEmployee(employeeId);
        return employeeInfo;

    }

    @GetMapping("/employee")
    public List<EmployeeInfo> listEmployee() {
       return manageEmployee.employeeInfoList;
    }

    @PostMapping("/employee")
    public String addEmployee(@RequestBody EmployeeInfo employeeInfo){
        if(manageEmployee.findEmployee(employeeInfo.getEmployeeId())==null) {
            manageEmployee.addEmployee(employeeInfo.getEmployeeId(),employeeInfo.getName(),employeeInfo.getGender(),employeeInfo.getSalary(),employeeInfo.getEmailId());
            return "Successfully Added";
        }
        else{
            return "Employee already exist in the employee list";
        }
    }

    @DeleteMapping("/employee")
    public String deleteEmployee(@RequestBody EmployeeInfo employeeInfo){
        if(manageEmployee.findEmployee(employeeInfo.getEmployeeId())!=null){
            manageEmployee.deleteEmployee(employeeInfo.getEmployeeId());
            return "Employee deleted from the list";
        }
        else{
            return "Employee is not available to delete";
        }
    }

    @PutMapping("/employee")
    public String putEmployee(@RequestBody EmployeeInfo employeeInfo){
        if(manageEmployee.findEmployee(employeeInfo.getEmployeeId())!=null){
            manageEmployee.updateEmployee(employeeInfo);
            return "Employee updated in the list";
        }
        else{
            return "Employee is not available to update";
        }
    }
}
