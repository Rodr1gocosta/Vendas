package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<ClienteDTO, Cliente> {
}
