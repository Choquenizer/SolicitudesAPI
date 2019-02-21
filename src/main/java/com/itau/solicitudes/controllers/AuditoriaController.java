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

import com.itau.solicitudes.model.Auditoria;
import com.itau.solicitudes.services.AuditoriaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/logs/v1/auditorias")
public class AuditoriaController {

	@Autowired
	AuditoriaService auditoriaService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> update(@RequestBody Auditoria auditoria) {
		try {
			auditoria = this.auditoriaService.save(auditoria);
			
			return ResponseEntity.ok("");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{idAuditoria}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("idAuditoria") Long idAuditoria) {
		try {
			Auditoria[] auditoria = this.auditoriaService.findByIdSolicitud(idAuditoria);
			
			return ResponseEntity.ok(auditoria);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}

}
