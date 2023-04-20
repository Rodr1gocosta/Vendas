package com.rodrigo.vendas.controller.rest_erro;

import com.rodrigo.vendas.exception.ClienteException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ApplicationControllerAdvice {
    @ExceptionHandler(ClienteException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleRegraNegocioExcepiton(ClienteException ex) {
        String message = ex.getMessage();
        return new ApiErrors(message);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleMethodNotValidException(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(erro -> erro.getDefaultMessage()).collect(Collectors.toList());
        return new ApiErrors(errors);
    }
}
