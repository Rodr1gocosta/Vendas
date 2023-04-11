package com.rodrigo.vendas.service;

import com.rodrigo.vendas.domain.Cliente;
import com.rodrigo.vendas.repository.ClienteRepository;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import com.rodrigo.vendas.service.mapper.ClienteMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteService(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        Cliente result = clienteRepository.save(cliente);
        return clienteMapper.toDto(result);
    }
}
