package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.addEmployee("Sathya");
        System.out.println();
        
        employeeService.displayEmployeeDetails(101, "Sathya");
        System.out.println();
        
        employeeService.calculateSalary(25000.0);

        context.close();
    }
}