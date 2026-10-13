package com.example;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService1 {
	public void addEmployee(String name) {
		System.out.println("Employee added: "+name);
	}
	public void displayEmployee() {
        System.out.println("Employee ID: 101");
        System.out.println("Employee Name: Sathya");
    }

    public void calculateSalary() {
        double salary = 25000.0;
        System.out.println("Employee Salary: " + salary);
    }
}
