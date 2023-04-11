package com.rodrigo.vendas.domain;

import com.rodrigo.vendas.domain.enumeration.TipoPessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente extends Pessoa {

    @Column(name = "tipo_pessoa")
    private TipoPessoa tipoPessoa;
}


