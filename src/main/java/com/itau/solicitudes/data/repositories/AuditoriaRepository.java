package com.itau.solicitudes.data.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.solicitudes.data.entities.Auditoria;

@Repository
public interface AuditoriaRepository extends CrudRepository<Auditoria, Long> {

	public Set<Auditoria> findByIdSolicitud(Long idSolicitud);
}
