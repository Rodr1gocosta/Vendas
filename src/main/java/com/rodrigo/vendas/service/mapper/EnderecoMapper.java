package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Endereco;
import com.rodrigo.vendas.service.dto.EnderecoDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco>{
}
