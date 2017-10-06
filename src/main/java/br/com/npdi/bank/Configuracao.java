package br.com.npdi.bank;

import br.com.npdi.bank.model.Conta;
import br.com.npdi.bank.repository.ContaRepository;
import br.com.npdi.bank.repository.MovimentacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Configuracao implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }

    @Autowired
    private MovimentacaoRepository movRepository;

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public void run(String... strings) throws Exception {

        Conta conta = new Conta("0245-9", "Banco do Brasil", "34.456", "Dulval");
        contaRepository.save(conta);

        List<Conta> findConta = contaRepository.findByBanco("Banco do Brasil");
        List<Conta> contaList = contaRepository.findByBancoAndAgencia("Banco do Brasil", "0245-9");

        findConta.forEach(System.out::println);
        System.out.println("----------------------------------");
        contaList.forEach(System.out::println);
    }

}
