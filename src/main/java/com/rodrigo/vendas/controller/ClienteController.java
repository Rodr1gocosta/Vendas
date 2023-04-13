package com.rodrigo.vendas.controller;

import com.rodrigo.vendas.service.ClienteService;
import com.rodrigo.vendas.service.dto.ClienteDTO;
import com.rodrigo.vendas.service.dto.ClienteFiltroDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/clientes")
public class ClienteController {
    private final Logger log = LoggerFactory.getLogger(ClienteController.class);

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO clienteDTO) {
        log.info("Solicitação REST para salvar Cliente {}", clienteDTO);

        ClienteDTO result = clienteService.save(clienteDTO);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<ClienteDTO>> findAll(Pageable pageable) {
        log.info("Solicitação REST para obter páginas de Clientes");

        Page<ClienteDTO> result = clienteService.findAll(pageable);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable(value = "id") Long id) {
        log.info("Solicitação REST para obter um Cliente");

        ClienteDTO clienteDTO = clienteService.findById(id);
        return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
    }

    @GetMapping("/pesquisa")
    public ResponseEntity<Page<ClienteDTO>> search(@RequestBody ClienteFiltroDTO filtro, Pageable pageable){
        log.info("Solicitação REST para obter pesquisa de clientes");

        Page<ClienteDTO> result =  clienteService.search(filtro, pageable);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updadeCliente(@PathVariable(value = "id") Long id, @RequestBody ClienteDTO clienteDTO) {
        log.info("Solicitação REST para atualizar cliente");

        clienteService.updateCliente(id, clienteDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable(value = "id") Long id) {
        log.info("Solicitação REST para deletar cliente");

        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

