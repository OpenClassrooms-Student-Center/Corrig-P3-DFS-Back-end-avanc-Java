package com.equipit.equipment;

import java.util.List;
import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public List<Equipment> findAll() {
        return repository.findAll();
    }

    public Equipment borrowEquipment(Long id, String firstName, String lastName) {
        Equipment equipment = findEquipment(id);
        if (!equipment.isAvailable()) {
            throw new EquipmentUnavailableException(id);
        }
        equipment.borrow(firstName, lastName, LocalDate.now());
        return repository.save(equipment);
    }

    public Equipment returnEquipment(Long id) {
        Equipment equipment = findEquipment(id);
        equipment.returnEquipment(LocalDate.now());
        return repository.save(equipment);
    }

    private Equipment findEquipment(Long id) {
        return repository.findById(id).orElseThrow(() -> new EquipmentNotFoundException(id));
    }
}