package com.daytwo.exercise_two;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Log4j2
//@Component
public class LocalDateSetterDI {
    public int getLocalDate() {  //static
        LocalDate date = java.time.LocalDate.now();
        return date.getYear() * 10000 + date.getMonthValue() * 100 + date.getDayOfMonth();
    }

    public static void main(String[] args) {
        LocalDateSetterDI localDateSetterDI = new LocalDateSetterDI();
        Employee employee = new Employee(1,"Sam", "employee", localDateSetterDI); //
        log.info("Employee with fields are created: {}", employee);
    }
}