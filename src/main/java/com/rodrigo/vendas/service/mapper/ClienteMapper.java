package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<ClienteDTO, Cliente> {

    @Override
    @Mapping(target = "endereco", source = "enderecoDTO")
    Cliente toEntity(ClienteDTO clienteDTO);

    @Override
    @Mapping(target = "enderecoDTO", source = "endereco")
    ClienteDTO toDto(Cliente cliente);
}
