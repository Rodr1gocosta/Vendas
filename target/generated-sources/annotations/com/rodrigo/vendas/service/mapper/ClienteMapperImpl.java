package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.domain.Endereco;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import com.rodrigo.vendas.service.dto.EnderecoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T11:05:27-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

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
        if ( dto.getTipoPessoa() != null ) {
            entity.setTipoPessoa( dto.getTipoPessoa() );
        }
    }

    @Override
    public Cliente toEntity(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setEndereco( enderecoDTOToEndereco( clienteDTO.getEnderecoDTO() ) );
        cliente.setId( clienteDTO.getId() );
        cliente.setNome( clienteDTO.getNome() );
        cliente.setSexo( clienteDTO.getSexo() );
        cliente.setTelefone( clienteDTO.getTelefone() );
        cliente.setCpfEcnpj( clienteDTO.getCpfEcnpj() );
        cliente.setTipoPessoa( clienteDTO.getTipoPessoa() );

        return cliente;
    }

    @Override
    public ClienteDTO toDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setEnderecoDTO( enderecoToEnderecoDTO( cliente.getEndereco() ) );
        clienteDTO.setId( cliente.getId() );
        clienteDTO.setNome( cliente.getNome() );
        clienteDTO.setSexo( cliente.getSexo() );
        clienteDTO.setTelefone( cliente.getTelefone() );
        clienteDTO.setCpfEcnpj( cliente.getCpfEcnpj() );
        clienteDTO.setTipoPessoa( cliente.getTipoPessoa() );

        return clienteDTO;
    }

    protected Endereco enderecoDTOToEndereco(EnderecoDTO enderecoDTO) {
        if ( enderecoDTO == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setId( enderecoDTO.getId() );
        endereco.setLogradouro( enderecoDTO.getLogradouro() );
        endereco.setNumero( enderecoDTO.getNumero() );
        endereco.setCidade( enderecoDTO.getCidade() );
        endereco.setUf( enderecoDTO.getUf() );
        endereco.setCep( enderecoDTO.getCep() );
        endereco.setBairro( enderecoDTO.getBairro() );
        endereco.setComplemento( enderecoDTO.getComplemento() );

        return endereco;
    }

    protected EnderecoDTO enderecoToEnderecoDTO(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setId( endereco.getId() );
        enderecoDTO.setLogradouro( endereco.getLogradouro() );
        enderecoDTO.setNumero( endereco.getNumero() );
        enderecoDTO.setCidade( endereco.getCidade() );
        enderecoDTO.setUf( endereco.getUf() );
        enderecoDTO.setCep( endereco.getCep() );
        enderecoDTO.setBairro( endereco.getBairro() );
        enderecoDTO.setComplemento( endereco.getComplemento() );

        return enderecoDTO;
    }
}
