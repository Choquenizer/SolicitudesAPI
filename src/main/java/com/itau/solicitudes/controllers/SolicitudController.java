package com.itau.solicitudes.controllers;

import java.util.HashMap;
import java.util.Map;

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
	public ResponseEntity<Object> save(@RequestBody Solicitud solicitud) {
		try {
			solicitud = this.solicitudService.save(solicitud);
			
			Map<String, Long> resp = new HashMap<String, Long>();
			resp.put("idSolicitud", solicitud.getIdSolicitud());
			
			return ResponseEntity.ok(resp);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseBody
	public ResponseEntity<Object> update(@RequestBody Solicitud solicitud, @PathVariable("id") Long id) {
		try {
			solicitud.setIdSolicitud(id);
			solicitud = this.solicitudService.update(solicitud);
			
			return ResponseEntity.ok("");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("id") Long id) {
		try {
			Solicitud solicitud = this.solicitudService.findById(id);
			
			return ResponseEntity.ok(solicitud);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}/estado")
	@ResponseBody
	public ResponseEntity<Object> getEstadoById(@PathVariable("id") Long id) {
		try {
			String estado = this.solicitudService.getSolicitudEstado(id);
			
			Map<String, Object> resp = new HashMap<String, Object>();
			resp.put("idSolicitud", id);
			resp.put("estado", estado);
			
			return ResponseEntity.ok(resp);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}/estado")
	@ResponseBody
	public ResponseEntity<Object> setEstadoById(@RequestBody Map<String, Object> body, @PathVariable("id") Long id) {
		try {
			this.solicitudService.setSolicitudEstado(id, (String) body.get("estado"));
			
			return ResponseEntity.ok("");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}

}
