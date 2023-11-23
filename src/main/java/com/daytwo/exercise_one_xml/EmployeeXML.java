package com.daytwo.exercise_one_xml;

import lombok.Data;

@Data
public class EmployeeXML {
    private String name;
    private int employeeId;
    private String role;
    private int dateOfJoining;

    public int getDateOfJoining() {
        return this.dateOfJoining;
    }

    public void setDateOfJoining(int dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
