package com.rodrigo.vendas.domain;

import com.rodrigo.vendas.domain.enumeration.Sexo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    @NotEmpty(message = "Campo NOME é obrigatório!")
    @Column(name = "nome")
    protected String nome;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    protected Sexo sexo;

    @NotNull
    @Column(name = "telefone")
    protected String telefone;

    @NotNull
    @Column(name = "cpf_cnpj")
    protected String cpfEcnpj;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    protected Endereco endereco;
}
