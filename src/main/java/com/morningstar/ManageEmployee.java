package com.morningstar;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ManageEmployee {

    public List<EmployeeInfo> employeeInfoList = new ArrayList<EmployeeInfo>();

    public void addEmployee(int employeeId, String name, String gender, double salary, String emailId) {
        EmployeeInfo employeeInfo = new EmployeeInfo(employeeId, name, salary, gender, emailId);
        employeeInfoList.add(employeeInfo);

    }

    public void printEmployee(EmployeeInfo employeeInfo) {
        System.out.print(employeeInfo.getEmployeeId() + " ");
        System.out.print(employeeInfo.getName() + " ");
        System.out.print(employeeInfo.getEmailId() + " ");
        System.out.print(employeeInfo.getGender() + " ");
        System.out.print(employeeInfo.getSalary() + " ");
        System.out.println("");
    }

    public void printEmployee() {
        for (EmployeeInfo employeeInfo : employeeInfoList) {
            System.out.print(employeeInfo.getEmployeeId() + " ");
            System.out.print(employeeInfo.getName() + " ");
            System.out.print(employeeInfo.getEmailId() + " ");
            System.out.print(employeeInfo.getGender() + " ");
            System.out.print(employeeInfo.getSalary() + " ");
            System.out.println("");
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = findIndexEmployee(employeeId);
        if (index != -1) {
            employeeInfoList.remove(index);
            System.out.println("Employee data has been deleted successfully");
        } else {
            System.out.println("Delete Employee is not available from the list");
        }


    }

    public int findIndexEmployee(int employeeId) {
        for (int i = 0; i < employeeInfoList.size(); i++) {
            if (employeeInfoList.get(i).getEmployeeId() == employeeId) {
                return i;
            }
        }
        return -1;
    }

    public void updateEmployee(EmployeeInfo employeeInfo) {
        int index = findIndexEmployee(employeeInfo.getEmployeeId());
        if (index != -1) {
            employeeInfoList.set(index, employeeInfo);
            System.out.println("updated employee info in the");
        } else {
            employeeInfoList.add(employeeInfo);
            System.out.println("added person object from the list");
        }
    }

    public EmployeeInfo findEmployee(int employeeId) {
        for (EmployeeInfo employeeInfo : employeeInfoList) {
            if (employeeInfo.getEmployeeId() == employeeId) {
                return employeeInfo;
            }
        }
        return null;
    }


}
