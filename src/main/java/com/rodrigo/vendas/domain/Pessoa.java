package com.rodrigo.vendas.domain;

import com.rodrigo.vendas.domain.enumeration.Sexo;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Column(name = "nome", length = 255)
    protected String nome;

    @Column(name = "sexo")
    protected Sexo sexo;

    @Column(name = "telefone")
    protected String telefone;

    @Column(name = "cpf_cnpj")
    protected String cpfEcnpj;

    @OneToOne()
    @JoinColumn(name = "endereco_id")
    protected Endereco endereco;
}
