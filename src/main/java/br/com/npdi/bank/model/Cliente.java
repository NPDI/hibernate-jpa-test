/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.npdi.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String profissao;
    private String endereco;
    
    @OneToOne
    private Conta conta;
}
