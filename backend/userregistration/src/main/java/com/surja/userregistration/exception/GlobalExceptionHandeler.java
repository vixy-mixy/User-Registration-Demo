package com.surja.userregistration.exception;

import com.surja.userregistration.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandeler {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ApiResponse> nullPointerExceptionHandaler(NullPointerException e) {
        String message = e.getMessage();
        ApiResponse apiResponse = new ApiResponse(message,false,200);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
