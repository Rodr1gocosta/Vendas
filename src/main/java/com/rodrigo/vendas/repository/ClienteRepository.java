package com.rodrigo.vendas.repository;

import com.rodrigo.vendas.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
