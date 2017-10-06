package br.com.npdi.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Conta {

    @Id
    @GeneratedValue
    private Long id;
    private String agencia;
    private String banco;
    private String numero;
    private String titular;
    
    public Conta() {
    }

    public Conta(String agencia, String banco, String numero, String titular) {
        this.agencia = agencia;
        this.banco = banco;
        this.numero = numero;
        this.titular = titular;
    }
}
