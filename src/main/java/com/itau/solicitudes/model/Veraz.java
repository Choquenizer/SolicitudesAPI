package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.Date;

public class Veraz {

	private Date fechaConsulta;
	private String nivelSocioEconomico;
	private String resultado;
	private BigDecimal compromiso;
	private BigDecimal compromisoSinTarjeta;
	private BigDecimal score;
	private BigDecimal rangoScore;
	private String poblacion;
	private String aplicaPersonalBank;
	private BigDecimal montoFinanciado;
	private String movistar;
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getNivelSocioEconomico() {
		return nivelSocioEconomico;
	}
	public void setNivelSocioEconomico(String nivelSocioEconomico) {
		this.nivelSocioEconomico = nivelSocioEconomico;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public BigDecimal getCompromiso() {
		return compromiso;
	}
	public void setCompromiso(BigDecimal compromiso) {
		this.compromiso = compromiso;
	}
	public BigDecimal getCompromisoSinTarjeta() {
		return compromisoSinTarjeta;
	}
	public void setCompromisoSinTarjeta(BigDecimal compromisoSinTarjeta) {
		this.compromisoSinTarjeta = compromisoSinTarjeta;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public BigDecimal getRangoScore() {
		return rangoScore;
	}
	public void setRangoScore(BigDecimal rangoScore) {
		this.rangoScore = rangoScore;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getAplicaPersonalBank() {
		return aplicaPersonalBank;
	}
	public void setAplicaPersonalBank(String aplicaPersonalBank) {
		this.aplicaPersonalBank = aplicaPersonalBank;
	}
	public BigDecimal getMontoFinanciado() {
		return montoFinanciado;
	}
	public void setMontoFinanciado(BigDecimal montoFinanciado) {
		this.montoFinanciado = montoFinanciado;
	}
	public String getMovistar() {
		return movistar;
	}
	public void setMovistar(String movistar) {
		this.movistar = movistar;
	}
	
}
