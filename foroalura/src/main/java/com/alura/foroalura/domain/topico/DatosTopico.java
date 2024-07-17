package com.alura.foroalura.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotBlank
        String respuestas
) {
}
