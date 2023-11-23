package com.daytwo.exercise_three;

import com.daytwo.exercise_three.exceptions.ExistInDataBaseException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private final List<Employee> employees;
    private int employeeId = 1;

    public EmployeeRepository() {
        this.employees = new ArrayList<Employee>();
    }

    public Employee addEmployee(Employee employee) {
        if(getAllEmployees().isEmpty()){
            employee.setEmployeeId(employeeId);
        }else {
            employee.setEmployeeId(++employeeId);
        }
        employees.add(employee);
        return employee;
    }

    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        throw new ExistInDataBaseException("This employee do not exist");
    }

    public Employee updateEmployee(Employee updatedEmployee, int id) {
        Employee employee = getEmployeeById(id);
        employee.setName(updatedEmployee.getName());
        employee.setRole(updatedEmployee.getRole());
        employee.setDateOfJoining(updatedEmployee.getDateOfJoining());
        return employee;
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
