package com.rodrigo.vendas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ENDERECO")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enderecoSequence")
    @SequenceGenerator(name = "enderecoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @NotNull
    @Column(name = "cidade")
    private String cidade;

    @Column(name = "uf")
    private Character uf;

    @Column(name = "cep")
    private String cep;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "complemento")
    private String complemento;
}
