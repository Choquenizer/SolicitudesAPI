package com.itau.solicitudes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itau.solicitudes.model.Solicitud;
import com.itau.solicitudes.services.SolicitudService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/solicitudes/solicitudes")
public class SolicitudController {

	@Autowired
	SolicitudService solicitudService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Solicitud> save(@RequestBody Solicitud solicitud) {
		solicitud = this.solicitudService.saveOrUpdate(solicitud);
		
		return ResponseEntity.ok(solicitud);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseBody
	public ResponseEntity<Solicitud> findById(@PathVariable("id") Long id) {
		Solicitud solicitud = this.solicitudService.findById(id);
		
		return ResponseEntity.ok(solicitud);
	}

}
