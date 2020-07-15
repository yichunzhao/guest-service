package com.ynz.democloud.guestservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler
    public ResponseEntity<String> NotFoundExceptionHandler(RuntimeException e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}
