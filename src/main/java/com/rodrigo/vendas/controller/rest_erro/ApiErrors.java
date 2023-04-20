package com.rodrigo.vendas.controller.rest_erro;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ApiErrors {

    private List<String> erros;

    public ApiErrors(List<String> erros) {
        this.erros = erros;
    }

    public ApiErrors(String mensagemErro) {
        this.erros = Arrays.asList(mensagemErro);
    }
}
