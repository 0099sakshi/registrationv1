package com.api.exception;

import com.api.payload.Errordto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;



@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<Errordto> resourceNotFound(
            ResourceNotFoundException r,
  WebRequest request
    ){
Errordto error = new Errordto(r.getMessage(),new Date(),request.getDescription(true));
      return  new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }


@ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(
            Exception e
    ){
        return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
