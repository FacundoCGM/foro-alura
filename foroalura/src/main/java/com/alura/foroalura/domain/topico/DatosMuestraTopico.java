package com.alura.foroalura.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosMuestraTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String status,
        String autor,
        String curso,
        String respuestas
) { public DatosMuestraTopico(Topico topico) {
this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespuestas());
}
}
