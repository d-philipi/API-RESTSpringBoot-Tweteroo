package com.api.tweteroo.dto;

import jakarta.validation.constraints.NotBlank;

public record PersonDTO(
    @NotBlank String username,
    @NotBlank String avatar
) {
}
