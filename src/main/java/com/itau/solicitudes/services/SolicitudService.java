package com.itau.solicitudes.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itau.solicitudes.data.entities.Solicitud;
import com.itau.solicitudes.data.repositories.SolicitudRepository;

@Service
public class SolicitudService {

	@Autowired
	SolicitudRepository solicitudRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public com.itau.solicitudes.model.Solicitud findById(Long id) {
		Optional<Solicitud> result = this.solicitudRepository.findById(id);
		if (!result.isPresent())
			return null;
		
		return this.modelMapper.map(result.get(), com.itau.solicitudes.model.Solicitud.class);
	}
	
	public com.itau.solicitudes.model.Solicitud saveOrUpdate(com.itau.solicitudes.model.Solicitud solicitud) {
		Solicitud entity = this.modelMapper.map(solicitud, Solicitud.class);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
		System.out.println(mapper.writeValueAsString(solicitud));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
		System.out.println(mapper.writeValueAsString(entity));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entity = this.solicitudRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Solicitud.class);
	}
}
