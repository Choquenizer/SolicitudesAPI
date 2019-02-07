package com.itau.solicitudes.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.solicitudes.data.entities.Solicitud;

@Repository
public interface SolicitudRepository extends CrudRepository<Solicitud, Long> {

}
