package com.alura.foroalura.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosCreacionTopico(
        String titulo,
        String mensaje,
        String fecha
) {
}
