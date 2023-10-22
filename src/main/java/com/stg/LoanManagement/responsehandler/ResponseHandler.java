package com.stg.LoanManagement.responsehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseHandler {

    public ResponseEntity<ResponseDto> successResponse(Object object) {
        return ResponseEntity.ok(ResponseDto.builder().data(object).build());
    }
    public ResponseEntity<ResponseDto> badRequest(String msg) {
        return new ResponseEntity<>(ResponseDto.builder().errors(getErrorList(msg,HttpStatus.BAD_REQUEST.value())).build(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<ResponseDto> notFound(String msg) {
        return new ResponseEntity<>(ResponseDto.builder().errors(getErrorList(msg,HttpStatus.NOT_FOUND.value())).build(), HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ResponseDto> unauthorized(String msg) {
        return new ResponseEntity<>(ResponseDto.builder().errors(getErrorList(msg, HttpStatus.UNAUTHORIZED.value())).build(), HttpStatus.UNAUTHORIZED);
    }
    public ResponseEntity<ResponseDto> createdResponse(Object object, String message) {
        return ResponseEntity.ok(ResponseDto.builder().data(object).message(message).build());
    }

    private List<Errors> getErrorList(String msg, int statusCode) {
        Errors errors = Errors.builder().message(msg).code(statusCode).build();
        List<Errors> errors1 = new ArrayList<>();
        errors1.add(errors);
        return errors1;
    }
}
