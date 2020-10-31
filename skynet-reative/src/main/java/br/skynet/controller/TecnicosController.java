package br.skynet.controller;

import br.skynet.dto.TecnicosDTO;
import br.skynet.repository.TecnicosRepository;
import br.skynet.services.TecnicosService;
import com.skynet.documents.Tecnicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("tecnicos")
@RestController
public class TecnicosController {

    @Autowired
    TecnicosService tecnicosService;

    @Autowired
    TecnicosRepository tecnicosRepository;

    @RequestMapping(value="/tecnicos", method= RequestMethod.GET)
    public ResponseEntity<List<TecnicosDTO>> findAll() {
        Flux<Tecnicos> listFlux = tecnicosService.findAll();
        List<TecnicosDTO> listDto = listFlux.toStream()
                .sorted(Comparator.comparing(Tecnicos::getId).reversed())
                .map(TecnicosDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ResponseEntity<Tecnicos>> create(@RequestBody Tecnicos tecnicos) {
        return tecnicosService.save(tecnicos)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/buscacpf/{cpf}")
    public Mono<ResponseEntity<Tecnicos>> getByCpf(@PathVariable String cpf) {
        return tecnicosRepository.findByCpf(cpf)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tecnicos> streamAreaStatus() {
        return tecnicosService.findAll().delayElements(Duration.ofSeconds(1));
    }

}
