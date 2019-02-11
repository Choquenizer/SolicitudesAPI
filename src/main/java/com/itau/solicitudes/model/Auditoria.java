package com.itau.solicitudes.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "id" })
public class Auditoria {
	
	private Long id;
	private Long idSolicitud;
	private String usuario;
	private String rol;
	private String datoAnterior;
	private String datoNuevo;
	private String recurso;
	private Date fecha;
	private String tarea;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(Long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getDatoAnterior() {
		return datoAnterior;
	}
	public void setDatoAnterior(String datoAnterior) {
		this.datoAnterior = datoAnterior;
	}
	public String getDatoNuevo() {
		return datoNuevo;
	}
	public void setDatoNuevo(String datoNuevo) {
		this.datoNuevo = datoNuevo;
	}
	public String getRecurso() {
		return recurso;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	
}
