package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pep")
public class PEP {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPEP;
	private Boolean esPEP;
	private String cargo;
	private String funcion;
	private String jerarquia;
	
	public Boolean getEsPEP() {
		return esPEP;
	}
	public void setEsPEP(Boolean esPEP) {
		this.esPEP = esPEP;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public String getJerarquia() {
		return jerarquia;
	}
	public void setJerarquia(String jerarquia) {
		this.jerarquia = jerarquia;
	}
	public long getIdPEP() {
		return idPEP;
	}
	public void setIdPEP(long idPEP) {
		this.idPEP = idPEP;
	}
	
}
