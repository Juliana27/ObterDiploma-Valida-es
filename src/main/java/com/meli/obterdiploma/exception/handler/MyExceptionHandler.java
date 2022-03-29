package com.meli.obterdiploma.exception.handler;

import com.meli.obterdiploma.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class MyExceptionHandler {

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    protected ResponseEntity<List<ErrorDTO>> handleDiplomaException(MethodArgumentNotValidException e) {
//        List<ObjectError> errors = e.getBindingResult().getAllErrors();
//        List<ErrorDTO> results = new ArrayList<>();
//        errors.forEach(x -> {
//            ErrorDTO error = new ErrorDTO("campo inválido", x.getDefaultMessage());
//            results.add(error);
//        });
//        return new ResponseEntity<>(results, HttpStatus.BAD_REQUEST);
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleDiplomaException(MethodArgumentNotValidException e) {
        ErrorDTO error = new ErrorDTO("campo inválido", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
