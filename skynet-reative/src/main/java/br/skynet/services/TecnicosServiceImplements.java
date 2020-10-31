package br.skynet.services;

import br.skynet.repository.TecnicosRepository;
import com.skynet.documents.Tecnicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 30/10/2020
 */

@Service
public class TecnicosServiceImplements implements TecnicosService{

    @Autowired
    TecnicosRepository tecnicosRepository;

    @Override
    public Flux<Tecnicos> findAll() {
        return tecnicosRepository.findAll();
    }

    @Override
    public Mono<Tecnicos> save(Tecnicos tecnicos) {
        return tecnicosRepository.save(tecnicos);
    }
}
