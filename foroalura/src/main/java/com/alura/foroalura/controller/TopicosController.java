package com.alura.foroalura.controller;

import com.alura.foroalura.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosCreacionTopico> registrarTopico(@RequestBody @Valid DatosTopico datosTopico, UriComponentsBuilder uriComponentsBuilder) {
        Topico topico =topicoRepository.save(new Topico(datosTopico));
        DatosCreacionTopico datosCreacionTopico = new DatosCreacionTopico(topico.getTitulo(), topico.getMensaje(), topico.getFecha());
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datosCreacionTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosMuestraTopico>> muestraTopicos(@PageableDefault(size = 5) Pageable paginacion) {
        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosMuestraTopico::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosTopicoEspecifico> muestraTopicoEspecifico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var topicoSeleccionado = new DatosTopicoEspecifico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespuestas());
        return ResponseEntity.ok(topicoSeleccionado);
    }

    @DeleteMapping("/id")
    @Transactional
    public ResponseEntity borrarTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizaTopico(@RequestBody @Valid DatosTopicoActualizado datosTopicoActualizado){
        Topico topico = topicoRepository.getReferenceById(datosTopicoActualizado.id());
        topico.actualizarInformacion(datosTopicoActualizado);
        return ResponseEntity.ok(new DatosTopicoEspecifico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespuestas()));
    }
}
