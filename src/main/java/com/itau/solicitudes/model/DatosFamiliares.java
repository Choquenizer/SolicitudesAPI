package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "veraz" })
public class DatosFamiliares {

	private String parentesco;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private String numeroDocumento;
	private Date fechaNacimiento;
	private String cuil;
	private String sexo;
	private BigDecimal ingresoNetosMensuales;
	private String paisNacimiento;
	private String nacionalidad;
	private String nombrePadre;
	private String apellidoPadre;
	private String nombreMadre;
	private String apellidoMadre;
	@JsonProperty("Veraz")
	private Veraz Veraz;
	
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public BigDecimal getIngresoNetosMensuales() {
		return ingresoNetosMensuales;
	}
	public void setIngresoNetosMensuales(BigDecimal ingresoNetosMensuales) {
		this.ingresoNetosMensuales = ingresoNetosMensuales;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getApellidoPadre() {
		return apellidoPadre;
	}
	public void setApellidoPadre(String apellidoPadre) {
		this.apellidoPadre = apellidoPadre;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getApellidoMadre() {
		return apellidoMadre;
	}
	public void setApellidoMadre(String apellidoMadre) {
		this.apellidoMadre = apellidoMadre;
	}
	public Veraz getVeraz() {
		return Veraz;
	}
	public void setVeraz(Veraz veraz) {
		Veraz = veraz;
	}
	
}
