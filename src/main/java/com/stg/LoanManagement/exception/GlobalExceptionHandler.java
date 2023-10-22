package com.stg.LoanManagement.exception;


import com.stg.LoanManagement.responsehandler.ResponseDto;
import com.stg.LoanManagement.responsehandler.ResponseHandler;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@ControllerAdvice

public class GlobalExceptionHandler {
    @Autowired
    ResponseHandler responseHandler;
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ResponseDto> resourceNotFoundException(ValidationException resourceNotFoundException){
        return responseHandler.badRequest(resourceNotFoundException.getMessage());
    }
    @ExceptionHandler(ResourceNotFoundExeption.class)
    public ResponseEntity<ResponseDto> resourceNotFoundException(ResourceNotFoundExeption resourceNotFoundExeption){
        return responseHandler.notFound(resourceNotFoundExeption.getMessage());
    }
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseDto> resourceNotFoundException(NullPointerException resourceNotFoundException){
        return responseHandler.badRequest(resourceNotFoundException.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> resourceNotFoundException(Exception resourceNotFoundException){
        return responseHandler.badRequest(resourceNotFoundException.getMessage());
    }
    @ExceptionHandler
    public ResponseEntity<ResponseDto> validationSpring(ConstraintViolationException exception) {
        Set<String> errors = new HashSet<>();
        for (ConstraintViolation<?> violation : exception.getConstraintViolations()) {
            errors.add(violation.getMessage());
        }
        return errors.size() == 1 ? responseHandler.badRequest((String) errors.toArray()[0]) : responseHandler.badRequest(errors.toString());
    }

    @ExceptionHandler
    public ResponseEntity<ResponseDto> validation(MethodArgumentNotValidException exception) {
        Set<String> errorMessages = exception.getBindingResult().getAllErrors()
                .stream().filter(objectError -> objectError.contains(ConstraintViolation.class))
                .map(objectError -> objectError.unwrap(ConstraintViolation.class))
                .map(ConstraintViolation::getMessage).collect(Collectors.toSet());
        return errorMessages.size() == 1 ? responseHandler.badRequest((String) errorMessages.toArray()[0]) : responseHandler.badRequest( errorMessages.toString());
    }

}
