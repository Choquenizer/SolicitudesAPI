package com.itau.solicitudes.data.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.solicitudes.data.entities.Historial;


@Repository
public interface HistorialRepository extends CrudRepository<Historial, Long> {

	public Set<Historial> findByIdSolicitud(Long idSolicitud);
}
