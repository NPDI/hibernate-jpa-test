package br.com.npdi.bank.repository;

import br.com.npdi.bank.model.Conta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Long> {

    public Conta findById(long id);
    public List<Conta> findByBanco (String banco);
    public List<Conta> findByBancoAndAgencia (String banco, String agencia);
    
}
