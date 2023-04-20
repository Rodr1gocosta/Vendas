package com.rodrigo.vendas.domain;

import com.rodrigo.vendas.domain.enumeration.TipoPessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente extends Pessoa {

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", nullable = false)
    private TipoPessoa tipoPessoa;
}


