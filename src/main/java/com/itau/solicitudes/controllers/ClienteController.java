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

import com.itau.solicitudes.model.Cliente;
import com.itau.solicitudes.services.ClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/solicitudes/solicitudes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{idSolicitud}/clientes/{idCliente}", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Object> update(@RequestBody Cliente cliente, @PathVariable("idCliente") Long idCliente, @PathVariable("idSolicitud") Long idSolicitud) {
		try {
			cliente.setIdCliente(idCliente);
			cliente = this.clienteService.update(cliente);
			
			return ResponseEntity.ok("");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{idSolicitud}/clientes/{idCliente}", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("idCliente") Long idCliente, @PathVariable("idSolicitud") Long idSolicitud) {
		try {
			Cliente cliente = this.clienteService.findById(idCliente);
			cliente.setIdSolicitud(idSolicitud);
			
			return ResponseEntity.ok(cliente);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}

}
