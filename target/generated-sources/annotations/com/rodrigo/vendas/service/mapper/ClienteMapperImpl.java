package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-17T15:41:49-0300",
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

        cliente.setId( dto.getId() );
        cliente.setNome( dto.getNome() );
        cliente.setSexo( dto.getSexo() );
        cliente.setTelefone( dto.getTelefone() );
        cliente.setCpfEcnpj( dto.getCpfEcnpj() );
        cliente.setEndereco( dto.getEndereco() );
        cliente.setTipoPessoa( dto.getTipoPessoa() );

        return cliente;
    }

    @Override
    public ClienteDTO toDto(Cliente entity) {
        if ( entity == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( entity.getId() );
        clienteDTO.setNome( entity.getNome() );
        clienteDTO.setSexo( entity.getSexo() );
        clienteDTO.setTelefone( entity.getTelefone() );
        clienteDTO.setCpfEcnpj( entity.getCpfEcnpj() );
        clienteDTO.setEndereco( entity.getEndereco() );
        clienteDTO.setTipoPessoa( entity.getTipoPessoa() );

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

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getNome() != null ) {
            entity.setNome( dto.getNome() );
        }
        if ( dto.getSexo() != null ) {
            entity.setSexo( dto.getSexo() );
        }
        if ( dto.getTelefone() != null ) {
            entity.setTelefone( dto.getTelefone() );
        }
        if ( dto.getCpfEcnpj() != null ) {
            entity.setCpfEcnpj( dto.getCpfEcnpj() );
        }
        if ( dto.getEndereco() != null ) {
            entity.setEndereco( dto.getEndereco() );
        }
        if ( dto.getTipoPessoa() != null ) {
            entity.setTipoPessoa( dto.getTipoPessoa() );
        }
    }
}
