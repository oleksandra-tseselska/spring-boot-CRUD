package com.daytwo.exercise_one_xml;

import lombok.Data;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

@Data
public class EmployeeSetterDI {
    private int employeeId;
    private String name;
    private String role;
    private int dateOfJoining;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationEmployee_SetDI.xml");

        EmployeeSetterDI employeeSetterDI = (EmployeeSetterDI) context.getBean("employee");
        System.out.println(employeeSetterDI);

    }
}
