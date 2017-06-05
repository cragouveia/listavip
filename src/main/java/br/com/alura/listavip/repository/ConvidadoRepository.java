package br.com.alura.listavip.repository;

import br.com.alura.listavip.domain.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by carlos on 04/06/2017.
 */
@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
