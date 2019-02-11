package com.itau.solicitudes.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.solicitudes.data.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
