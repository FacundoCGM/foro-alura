package com.alura.foroalura.domain.topico;

public record DatosTopicoEspecifico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String status,
        String autor,
        String curso,
        String respuestas
) {
}
