package com.itau.solicitudes.services;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.solicitudes.data.entities.Historial;
import com.itau.solicitudes.data.repositories.HistorialRepository;

@Service
public class HistorialService {

	@Autowired
	HistorialRepository historialRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public com.itau.solicitudes.model.Historial[] findByIdSolicitud(Long id) {
		Set<Historial> result = this.historialRepository.findByIdSolicitud(id);
		
		return this.modelMapper.map(result, com.itau.solicitudes.model.Historial[].class);
	}
	
	public com.itau.solicitudes.model.Historial save(com.itau.solicitudes.model.Historial historial) {
		Historial entity = this.modelMapper.map(historial, Historial.class);
		
		entity = this.historialRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Historial.class);
	}
}
