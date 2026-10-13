package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService1 service =
                context.getBean(EmployeeService1.class);

        service.addEmployee("Sathya");
        service.displayEmployee();
        service.calculateSalary();

        context.close();
    }
}
