package com.equipit.equipment;

import jakarta.validation.constraints.NotBlank;

public record BorrowRequest(@NotBlank String firstName, @NotBlank String lastName) { }