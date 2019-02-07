package com.itau.solicitudes.data.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fatca")
public class FATCA {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFATCA;
	private Date fechaInicio;
	private String paisResidencia;
	private Boolean indicadorCRS;
	private Boolean indicadorDDJJ;
	private Boolean indicadorFatca;
	private Boolean indicadorNIFTIF;
	private String numeroNIFTIF;
	private String pais;
	private String ciudad;
	private String calle;
	private Integer numero;
	private String numeroIdentificacionFiscal;
	
	public Long getIdFATCA() {
		return idFATCA;
	}
	public void setIdFATCA(Long idFATCA) {
		this.idFATCA = idFATCA;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getPaisResidencia() {
		return paisResidencia;
	}
	public void setPaisResidencia(String paisResidencia) {
		this.paisResidencia = paisResidencia;
	}
	public Boolean getIndicadorCRS() {
		return indicadorCRS;
	}
	public void setIndicadorCRS(Boolean indicadorCRS) {
		this.indicadorCRS = indicadorCRS;
	}
	public Boolean getIndicadorDDJJ() {
		return indicadorDDJJ;
	}
	public void setIndicadorDDJJ(Boolean indicadorDDJJ) {
		this.indicadorDDJJ = indicadorDDJJ;
	}
	public Boolean getIndicadorFatca() {
		return indicadorFatca;
	}
	public void setIndicadorFatca(Boolean indicadorFatca) {
		this.indicadorFatca = indicadorFatca;
	}
	public Boolean getIndicadorNIFTIF() {
		return indicadorNIFTIF;
	}
	public void setIndicadorNIFTIF(Boolean indicadorNIFTIF) {
		this.indicadorNIFTIF = indicadorNIFTIF;
	}
	public String getNumeroNIFTIF() {
		return numeroNIFTIF;
	}
	public void setNumeroNIFTIF(String numeroNIFTIF) {
		this.numeroNIFTIF = numeroNIFTIF;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNumeroIdentificacionFiscal() {
		return numeroIdentificacionFiscal;
	}
	public void setNumeroIdentificacionFiscal(String numeroIdentificacionFiscal) {
		this.numeroIdentificacionFiscal = numeroIdentificacionFiscal;
	}
	
}
