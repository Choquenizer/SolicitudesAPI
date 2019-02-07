package com.itau.solicitudes.model;

import java.util.Date;

public class OCRDocumentData {

	private Integer idOCRDoc;
	private String numeroDocumento;
	private String tipoDocumento;
	private String apellido;
	private String nombre;
	private String sexo;
	private String nacionalidad;
	private String ejemplar;
	private Date fechaNacimiento;
	private Date fechaEmision;
	private Date fechaExpiracion;
	private String numeroTramite;
	private String direccionDNI;
	private String lugarNacimiento;
	private String codigoMRZDNI;
	private String valorRiesgoPLD;
	
	public Integer getIdOCRDoc() {
		return idOCRDoc;
	}
	public void setIdOCRDoc(Integer idOCRDoc) {
		this.idOCRDoc = idOCRDoc;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(String ejemplar) {
		this.ejemplar = ejemplar;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getNumeroTramite() {
		return numeroTramite;
	}
	public void setNumeroTramite(String numeroTramite) {
		this.numeroTramite = numeroTramite;
	}
	public String getDireccionDNI() {
		return direccionDNI;
	}
	public void setDireccionDNI(String direccionDNI) {
		this.direccionDNI = direccionDNI;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getCodigoMRZDNI() {
		return codigoMRZDNI;
	}
	public void setCodigoMRZDNI(String codigoMRZDNI) {
		this.codigoMRZDNI = codigoMRZDNI;
	}
	public String getValorRiesgoPLD() {
		return valorRiesgoPLD;
	}
	public void setValorRiesgoPLD(String valorRiesgoPLD) {
		this.valorRiesgoPLD = valorRiesgoPLD;
	}
	
}
