package com.equipit.equipment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EquipmentDataInitializer {
    @Bean
    CommandLineRunner seedEquipment(EquipmentRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Equipment("MacBook Pro", "Computer"));
                repository.save(new Equipment("Dell monitor", "Screen"));
                repository.save(new Equipment("Mechanical keyboard", "Keyboard"));
            }
        };
    }
}