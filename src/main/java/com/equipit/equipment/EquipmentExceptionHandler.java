package com.equipit.equipment;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EquipmentExceptionHandler {
    @ExceptionHandler(EquipmentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleNotFound(EquipmentNotFoundException exception) {
        return Map.of("error", "Equipment not found");
    }

    @ExceptionHandler(EquipmentUnavailableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleUnavailable(EquipmentUnavailableException exception) {
        return Map.of("error", "Equipment is unavailable");
    }
}