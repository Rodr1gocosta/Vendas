package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-10T20:12:02-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        return cliente;
    }

    @Override
    public ClienteDTO toDto(Cliente entity) {
        if ( entity == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        return clienteDTO;
    }

    @Override
    public List<Cliente> toEntity(List<ClienteDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( dtoList.size() );
        for ( ClienteDTO clienteDTO : dtoList ) {
            list.add( toEntity( clienteDTO ) );
        }

        return list;
    }

    @Override
    public List<ClienteDTO> toDto(List<Cliente> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( entityList.size() );
        for ( Cliente cliente : entityList ) {
            list.add( toDto( cliente ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Cliente entity, ClienteDTO dto) {
        if ( dto == null ) {
            return;
        }
    }
}
