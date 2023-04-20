package com.rodrigo.vendas.service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class EnderecoDTO {

    private Long id;

    private String logradouro;

    private String numero;

    @NotNull(message = "Cidade não deve ser nulo!")
    private String cidade;

    private Character uf;

    private String cep;

    private String bairro;

    private String complemento;
}
