package com.alura.foroalura.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosTopicoActualizado(
        @NotNull
        Long id,
        String titulo,
        String mensaje
) {
}
