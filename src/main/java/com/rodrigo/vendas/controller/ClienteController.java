package com.rodrigo.vendas.controller;

import com.rodrigo.vendas.service.ClienteService;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import com.rodrigo.vendas.service.dto.ClienteFiltroDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {
    private final Logger log = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO clienteDTO) {
        log.info("Solicitação REST para salvar Cliente {}", clienteDTO);

        ClienteDTO result = clienteService.save(clienteDTO);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping(value = "/buscar")
    public ResponseEntity<List<ClienteDTO>> findAll() {
        log.info("Solicitação REST para obter páginas de Clientes");
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable(value = "id") Long id) {
        log.info("Solicitação REST para obter um Cliente");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> search(@RequestBody ClienteFiltroDTO filtro){
        log.info("Solicitação REST para obter pesquisa de clientes");

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        //repository com example

        return null;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> updadeCliente(@PathVariable(value = "id") Long id, @RequestBody ClienteDTO clienteDTO) {
        log.info("Solicitação REST para atualizar cliente");
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable(value = "id") Long id) {
        log.info("Solicitação REST para deletar cliente");
        return null;
    }
}
