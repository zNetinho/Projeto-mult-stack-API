package br.com.treinaweb.adoteumpet.api.common.handlers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;

import br.com.treinaweb.adoteumpet.api.common.dtos.ErrorResponse;
import lombok.var;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private final SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        var body = ErrorResponse.builder()
                .status(status.value())
                .error(status.getReasonPhrase())
                .cause(ex.getClass().getSimpleName())
                .message("Houveram erros na validação dos campos")
                .timestamp(LocalDateTime.now())
                .errors(converteFieldErrors(ex.getBindingResult().getFieldErrors()))
                .build();

        return new ResponseEntity<>(body, status);
    }

    private Map<String, List<String>> converteFieldErrors(List<FieldError> fieldErrors) {
        var errors = new HashMap<String, List<String>>();
        fieldErrors.stream().forEach(fieldError -> {
            var field = snakeCaseStrategy.translate(fieldError.getField());
            if (errors.containsKey((field))) {
                errors.get(field).add(fieldError.getDefaultMessage());
            } else {
                var errorList = new ArrayList<String>();
                errorList.add(fieldError.getDefaultMessage());
                errors.put(field, errorList);
            }
        });
        return errors;
    }
}
