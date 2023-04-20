package com.rodrigo.vendas.domain;

import com.rodrigo.vendas.domain.enumeration.Sexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clienteSequence")
    @SequenceGenerator(name = "clienteSequence")
    @Column(name = "id")
    protected Long id;

    @Column(name = "nome", nullable = false)
    protected String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    protected Sexo sexo;

    @Column(name = "telefone", nullable = false)
    protected String telefone;

    @Column(name = "cpf_cnpj", nullable = false)
    protected String cpfEcnpj;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", nullable = false)
    protected Endereco endereco;
}
