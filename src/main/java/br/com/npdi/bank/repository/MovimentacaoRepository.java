package br.com.npdi.bank.repository;

import br.com.npdi.bank.model.Movimentacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface MovimentacaoRepository extends CrudRepository<Movimentacao, Long>{
    
}
