package com.rodrigo.vendas.service.dto;

import com.rodrigo.vendas.domain.enumeration.Sexo;
import com.rodrigo.vendas.domain.enumeration.TipoPessoa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Campo NOME obrigatório!")
    @NotNull(message = "NOME não deve ser nulo!")
    private String nome;

    @NotNull(message = "SEXO não deve ser nulo!")
    private Sexo sexo;

    @NotBlank(message = "Campo TELEFONE obrigatório!")
    @NotNull(message = "TELEFONE não ser nulo!")
    private String telefone;

    @NotBlank(message = "Campo CPF e CNPJ obrigatório!")
    @NotNull(message = "CPF e CNPJ não deve ser nulo!")
    private String cpfEcnpj;

    @NotNull(message = "ENDEREÇO não deve ser nulo!")
    private EnderecoDTO enderecoDTO;

    @NotNull(message = "TIPO PESSOA não deve ser nulo!")
    private TipoPessoa tipoPessoa;

}
