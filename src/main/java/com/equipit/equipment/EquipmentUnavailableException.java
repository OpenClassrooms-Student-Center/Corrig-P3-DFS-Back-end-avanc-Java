package com.equipit.equipment;

public class EquipmentUnavailableException extends RuntimeException {
    public EquipmentUnavailableException(Long id) {
        super("Equipment is unavailable: " + id);
    }
}