package com.daytwo.exercise_two;

import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
    private int employeeId;
    private String name;
    private String role;
    private int dateOfJoining;
//    @Autowired
    private LocalDateSetterDI localDateSetterDI;

    public Employee(int employeeId, String name, String role, LocalDateSetterDI localDateSetterDI){ //
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.dateOfJoining = localDateSetterDI.getLocalDate();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
