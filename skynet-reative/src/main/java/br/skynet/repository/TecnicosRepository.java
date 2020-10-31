package br.skynet.repository;

import com.skynet.documents.Tecnicos;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */

public interface TecnicosRepository extends ReactiveMongoRepository<Tecnicos, String> {
    Mono<Tecnicos> findByCpf(String cpf);
    Flux<Tecnicos> findByNome(String nome);
}
