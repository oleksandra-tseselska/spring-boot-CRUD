package com.daytwo.exercise_three.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
//
//    public ErrorResponse(LocalDateTime timestamp, int status, String error, String message, String path) {
//        this.timestamp = timestamp;
//        this.status = status;
//        this.error = error;
//        this.message = message;
//        this.path = path;
//    }
}