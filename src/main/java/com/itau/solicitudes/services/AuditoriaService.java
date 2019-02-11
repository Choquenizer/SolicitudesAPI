package com.itau.solicitudes.services;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.solicitudes.data.entities.Auditoria;
import com.itau.solicitudes.data.repositories.AuditoriaRepository;

@Service
public class AuditoriaService {

	@Autowired
	AuditoriaRepository auditoriaRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public com.itau.solicitudes.model.Auditoria[] findByIdSolicitud(Long id) {
		Set<Auditoria> result = this.auditoriaRepository.findByIdSolicitud(id);
		
		return this.modelMapper.map(result, com.itau.solicitudes.model.Auditoria[].class);
	}
	
	public com.itau.solicitudes.model.Auditoria save(com.itau.solicitudes.model.Auditoria auditoria) {
		Auditoria entity = this.modelMapper.map(auditoria, Auditoria.class);
		
		entity = this.auditoriaRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Auditoria.class);
	}
}
