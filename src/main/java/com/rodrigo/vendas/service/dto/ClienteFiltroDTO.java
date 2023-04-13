package com.rodrigo.vendas.service.dto;

import com.rodrigo.vendas.domain.enumeration.Sexo;
import com.rodrigo.vendas.domain.enumeration.TipoPessoa;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteFiltroDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;

    private Sexo sexo;

    private String telefone;

    private String cpfEcnpj;

    private TipoPessoa tipoPessoa;
}
