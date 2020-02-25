package com.morningstar;

public class EmployeeRun {
    public static void main(String[] args) {
        ManageEmployee manageEmployee = new ManageEmployee();
        manageEmployee.addEmployee(1234,"ABC", "Female", 10000.22,"abc@.com");
        manageEmployee.addEmployee(45454,"BHVF", "Female", 1223.22,"abc@.com");
        manageEmployee.printEmployee();
        manageEmployee.deleteEmployee(1234);
        manageEmployee.printEmployee();
        EmployeeInfo employeeInfo= new EmployeeInfo(1234,"hsgdg",282982.22,"Male","ehvdh");
        manageEmployee.updateEmployee(employeeInfo);
        manageEmployee.printEmployee();
        EmployeeInfo employeeInfo1 = manageEmployee.findEmployee(1234);
        manageEmployee.printEmployee(employeeInfo1);

    }
}

