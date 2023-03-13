package com.denisselitsky.spring.rest;

import com.denisselitsky.spring.rest.configuration.MyConfig;
import com.denisselitsky.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",  Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
//
//        Employee emp = new Employee("Sveta", "Kovaleva","HR", 900);
//        emp.setId(6);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(7);
    }
}
