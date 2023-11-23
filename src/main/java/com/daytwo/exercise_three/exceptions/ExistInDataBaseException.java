package com.daytwo.exercise_three.exceptions;

public class ExistInDataBaseException extends IllegalArgumentException {
    public ExistInDataBaseException(String message) {
        super(message);
    }
}