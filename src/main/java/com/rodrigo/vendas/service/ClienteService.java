package com.rodrigo.vendas.service;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.exception.ClienteException;
import com.rodrigo.vendas.repository.ClienteRepository;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import com.rodrigo.vendas.service.dto.ClienteFiltroDTO;
import com.rodrigo.vendas.service.mapper.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        Cliente result = clienteRepository.save(cliente);
        return clienteMapper.toDto(result);
    }

    @Transactional(readOnly = true)
    public Page<ClienteDTO> findAll(Pageable pageable) {
        return clienteRepository.findAll(pageable).map(obj -> mapperToDto(obj));
    }


    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        return clienteRepository.findById(id)
                .map(obj -> mapperToDto(obj))
                .orElseThrow(() -> new ClienteException("CLIENTE NÃO ENCONTRATO!"));
    }

    @Transactional(readOnly = true)
    public Page<ClienteDTO> search(ClienteFiltroDTO filtro, Pageable pageable) {

        Cliente cliente = new Cliente();
        cliente.setNome(filtro.getNome());
        cliente.setSexo(filtro.getSexo());
        cliente.setTelefone(filtro.getTelefone());
        cliente.setCpfEcnpj(filtro.getCpfEcnpj());
        cliente.setTipoPessoa(filtro.getTipoPessoa());

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(cliente, matcher);

        return clienteRepository.findAll(example, pageable);
    }

    public void updateCliente(Long id, ClienteDTO clienteDTO) {
        ClienteDTO clienteDTO1 = findById(id);
        clienteDTO.setId(clienteDTO1.getId());
        clienteRepository.save(mapperToEntity(clienteDTO));
    }

    public void deleteCliente(Long id) {
        ClienteDTO clienteDTO = findById(id);
        clienteRepository.delete(mapperToEntity(clienteDTO));
    }

    //MAPEAMENTO DE ENTIDADE E DTO
    public ClienteDTO mapperToDto(Cliente cliente) {
        return clienteMapper.toDto(cliente);
    }

    public Cliente mapperToEntity(ClienteDTO clienteDTO) {
        return clienteMapper.toEntity(clienteDTO);
    }

}
