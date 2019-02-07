package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "referencia")
public class Referencia {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReferencia;
	private String nombreRef;
	private String apellidoRef;
	private String telefonoRef;
	
	public String getNombreRef() {
		return nombreRef;
	}
	public void setNombreRef(String nombreRef) {
		this.nombreRef = nombreRef;
	}
	public String getApellidoRef() {
		return apellidoRef;
	}
	public void setApellidoRef(String apellidoRef) {
		this.apellidoRef = apellidoRef;
	}
	public String getTelefonoRef() {
		return telefonoRef;
	}
	public void setTelefonoRef(String telefonoRef) {
		this.telefonoRef = telefonoRef;
	}
	public long getIdReferencia() {
		return idReferencia;
	}
	public void setIdReferencia(long idReferencia) {
		this.idReferencia = idReferencia;
	}
	
}
