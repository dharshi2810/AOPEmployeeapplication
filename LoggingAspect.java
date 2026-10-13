package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.example.EmployeeService1.*(..))")
	public void logAddEmployee() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* com.example.EmployeeService1.displayEmployee(..))")
    public void logDisplayEmployee() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* com.example.EmployeeService1.calculateSalary(..))")
    public void logCalculateSalary() {
        System.out.println("Logging: Calculating salary");
    }
}
