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

import com.itau.solicitudes.model.Historial;
import com.itau.solicitudes.services.HistorialService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/logs/v1/historiales")
public class HistorialController {

	@Autowired
	HistorialService historialService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> update(@RequestBody Historial historial) {
		try {
			historial = this.historialService.save(historial);
			
			return ResponseEntity.ok("");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{idHistorial}")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("idHistorial") Long idHistorial) {
		try {
			Historial[] historial = this.historialService.findByIdSolicitud(idHistorial);
			
			return ResponseEntity.ok(historial);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}

}
