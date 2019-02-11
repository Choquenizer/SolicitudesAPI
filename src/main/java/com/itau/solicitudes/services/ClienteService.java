package com.itau.solicitudes.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.solicitudes.data.entities.Cliente;
import com.itau.solicitudes.data.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public com.itau.solicitudes.model.Cliente findById(Long id) {
		Optional<Cliente> result = this.clienteRepository.findById(id);
		if (!result.isPresent())
			return null;
		
		return this.modelMapper.map(result.get(), com.itau.solicitudes.model.Cliente.class);
	}
	
	public com.itau.solicitudes.model.Cliente save(com.itau.solicitudes.model.Cliente cliente) {
		this.cleanIds(cliente);
		Cliente entity = this.modelMapper.map(cliente, Cliente.class);
		
		entity = this.clienteRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Cliente.class);
	}
	
	public com.itau.solicitudes.model.Cliente update(com.itau.solicitudes.model.Cliente cliente) {
		Cliente entity = this.modelMapper.map(cliente, Cliente.class);
		
		entity = this.clienteRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Cliente.class);
	}
	
	public void cleanIds(com.itau.solicitudes.model.Cliente cliente) {
		cliente.setIdCliente(null);
		cliente.setIdSolicitud(0);
		if (cliente.getFATCA()!= null) cliente.getFATCA().forEach(f -> f.setIdFATCA(null));
		if (cliente.getOCRDocumentData()!= null) cliente.getOCRDocumentData().forEach(f -> f.setIdOCRDoc(null));
	}
}
