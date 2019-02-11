package com.itau.solicitudes.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.solicitudes.data.entities.Solicitud;
import com.itau.solicitudes.data.repositories.SolicitudRepository;

@Service
public class SolicitudService {

	@Autowired
	SolicitudRepository solicitudRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public void setSolicitudEstado(Long solicitudId, String estado) {
		com.itau.solicitudes.model.Solicitud solicitud = this.findById(solicitudId);
		if (solicitud != null) {
			solicitud.setEstado(estado);
			this.update(solicitud);
		}
	}
	
	public String getSolicitudEstado(Long solicitudId) {
		com.itau.solicitudes.model.Solicitud solicitud = this.findById(solicitudId);
		if (solicitud != null) 
			return solicitud.getEstado();
		else
			return null;
	}
	
	public com.itau.solicitudes.model.Solicitud findById(Long id) {
		Optional<Solicitud> result = this.solicitudRepository.findById(id);
		if (!result.isPresent())
			return null;
		
		return this.modelMapper.map(result.get(), com.itau.solicitudes.model.Solicitud.class);
	}
	
	public com.itau.solicitudes.model.Solicitud save(com.itau.solicitudes.model.Solicitud solicitud) {
		this.cleanIds(solicitud);
		Solicitud entity = this.modelMapper.map(solicitud, Solicitud.class);
		
		entity = this.solicitudRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Solicitud.class);
	}
	
	public com.itau.solicitudes.model.Solicitud update(com.itau.solicitudes.model.Solicitud solicitud) {
		Solicitud entity = this.modelMapper.map(solicitud, Solicitud.class);
		
		entity = this.solicitudRepository.save(entity);
		
		return this.modelMapper.map(entity, com.itau.solicitudes.model.Solicitud.class);
	}
	
	public void cleanIds(com.itau.solicitudes.model.Solicitud solicitud) {
		solicitud.setIdSolicitud(0);
		
		if (solicitud.getPrestamoPersonal() != null) solicitud.getPrestamoPersonal().setIdPP(null);
		if (solicitud.getCuentaComitente() != null) solicitud.getCuentaComitente().setIdCC(null);
		if (solicitud.getPaquete() != null) solicitud.getPaquete().setIdPaquete(null);
		if (solicitud.getPaquete() != null && solicitud.getPaquete().getCheque() != null) solicitud.getPaquete().getCheque().forEach(c -> c.setIdCheque(null));
		if (solicitud.getPaquete() != null && solicitud.getPaquete().getTC() != null) solicitud.getPaquete().getTC().forEach(c -> c.setIdTC(null));
		if (solicitud.getPaquete() != null && solicitud.getPaquete().getTD() != null) solicitud.getPaquete().getTD().forEach(c -> c.setIdTD(null));
		if (solicitud.getPaquete() != null && solicitud.getPaquete().getCuenta() != null) solicitud.getPaquete().getCuenta().forEach(c -> c.setIdCuenta(null));
		if (solicitud.getAumentoLinea() != null) solicitud.getAumentoLinea().setIdAL(null);
		if (solicitud.getAumentoLinea() != null && solicitud.getAumentoLinea().getTarjeta() != null) solicitud.getAumentoLinea().getTarjeta().forEach(c -> c.setIdTarjeta(null));
		if (solicitud.getCliente() != null) solicitud.getCliente().forEach(c -> {
			c.setIdCliente(null);
			c.setIdSolicitud(0);
			if (c.getFATCA()!= null) c.getFATCA().forEach(f -> f.setIdFATCA(null));
			if (c.getOCRDocumentData()!= null) c.getOCRDocumentData().forEach(f -> f.setIdOCRDoc(null));
		});
	}
}
