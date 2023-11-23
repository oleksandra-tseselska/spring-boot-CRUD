package com.daytwo.exercise_three;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Employee> saveEmployee(
            @RequestBody @Valid Employee employee
    ) {
        Employee employeeSaved = service.saveEmployee(employee);
        return ResponseEntity.ok(employeeSaved);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAllEmployees() {
        List<Employee> employees = service.findAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/edit/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable @NotNull int employeeId,
            @RequestBody @Valid  Employee employee,
            BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }
        Employee updateEmployee = service.updateEmployee(employee, employeeId);
        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable @NotNull int employeeId
    ) {
        service.deleteEmployee(employeeId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
