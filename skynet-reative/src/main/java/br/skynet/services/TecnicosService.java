package br.skynet.services;

import com.skynet.documents.Tecnicos;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */

public interface TecnicosService {
    Flux<Tecnicos> findAll();
    Mono<Tecnicos> save(Tecnicos tecnicos);
}
