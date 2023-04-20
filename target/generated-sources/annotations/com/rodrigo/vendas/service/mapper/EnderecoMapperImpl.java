package com.rodrigo.vendas.service.mapper;

import com.rodrigo.vendas.domain.Endereco;
import com.rodrigo.vendas.service.dto.EnderecoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-19T17:23:47-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public Endereco toEntity(EnderecoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setId( dto.getId() );
        endereco.setLogradouro( dto.getLogradouro() );
        endereco.setNumero( dto.getNumero() );
        endereco.setCidade( dto.getCidade() );
        endereco.setUf( dto.getUf() );
        endereco.setCep( dto.getCep() );
        endereco.setBairro( dto.getBairro() );
        endereco.setComplemento( dto.getComplemento() );

        return endereco;
    }

    @Override
    public EnderecoDTO toDto(Endereco entity) {
        if ( entity == null ) {
            return null;
        }

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setId( entity.getId() );
        enderecoDTO.setLogradouro( entity.getLogradouro() );
        enderecoDTO.setNumero( entity.getNumero() );
        enderecoDTO.setCidade( entity.getCidade() );
        enderecoDTO.setUf( entity.getUf() );
        enderecoDTO.setCep( entity.getCep() );
        enderecoDTO.setBairro( entity.getBairro() );
        enderecoDTO.setComplemento( entity.getComplemento() );

        return enderecoDTO;
    }

    @Override
    public List<Endereco> toEntity(List<EnderecoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Endereco> list = new ArrayList<Endereco>( dtoList.size() );
        for ( EnderecoDTO enderecoDTO : dtoList ) {
            list.add( toEntity( enderecoDTO ) );
        }

        return list;
    }

    @Override
    public List<EnderecoDTO> toDto(List<Endereco> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EnderecoDTO> list = new ArrayList<EnderecoDTO>( entityList.size() );
        for ( Endereco endereco : entityList ) {
            list.add( toDto( endereco ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Endereco entity, EnderecoDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getLogradouro() != null ) {
            entity.setLogradouro( dto.getLogradouro() );
        }
        if ( dto.getNumero() != null ) {
            entity.setNumero( dto.getNumero() );
        }
        if ( dto.getCidade() != null ) {
            entity.setCidade( dto.getCidade() );
        }
        if ( dto.getUf() != null ) {
            entity.setUf( dto.getUf() );
        }
        if ( dto.getCep() != null ) {
            entity.setCep( dto.getCep() );
        }
        if ( dto.getBairro() != null ) {
            entity.setBairro( dto.getBairro() );
        }
        if ( dto.getComplemento() != null ) {
            entity.setComplemento( dto.getComplemento() );
        }
    }
}
