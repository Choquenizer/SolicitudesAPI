package com.itau.solicitudes.data.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historial")
public class Historial {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long idSolicitud;
	private Long idGestion;
	private Long idInstancia;
	private Long idUsuario;
	private String rolUsuario;
	private Date fechaAsignacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String nombreTarea;
	private String respuestaTarea;
	private String observacion;
	private String siguienteTarea;
	private String pendientePor;
	private String motivo;
	
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
	public Long getIdGestion() {
		return idGestion;
	}
	public void setIdGestion(Long idGestion) {
		this.idGestion = idGestion;
	}
	public Long getIdInstancia() {
		return idInstancia;
	}
	public void setIdInstancia(Long idInstancia) {
		this.idInstancia = idInstancia;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public String getRespuestaTarea() {
		return respuestaTarea;
	}
	public void setRespuestaTarea(String respuestaTarea) {
		this.respuestaTarea = respuestaTarea;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getSiguienteTarea() {
		return siguienteTarea;
	}
	public void setSiguienteTarea(String siguienteTarea) {
		this.siguienteTarea = siguienteTarea;
	}
	public String getPendientePor() {
		return pendientePor;
	}
	public void setPendientePor(String pendientePor) {
		this.pendientePor = pendientePor;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
