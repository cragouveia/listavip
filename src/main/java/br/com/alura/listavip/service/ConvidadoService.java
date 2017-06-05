package br.com.alura.listavip.service;

import br.com.alura.listavip.domain.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by carlos on 04/06/2017.
 */
@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;

    public Iterable<Convidado> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Convidado save(Convidado convidado) {
        return repository.save(convidado);
    }
}
