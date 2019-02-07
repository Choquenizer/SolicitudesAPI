package com.itau.solicitudes.model;

import java.math.BigDecimal;

public class Tarjeta {

	private Integer idTarjeta;
	private String entprodtarj;
	private String tipocarttarj;
	private String codprodtarj;
	private BigDecimal montoTCTarj;
	public Integer getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public String getEntprodtarj() {
		return entprodtarj;
	}
	public void setEntprodtarj(String entprodtarj) {
		this.entprodtarj = entprodtarj;
	}
	public String getTipocarttarj() {
		return tipocarttarj;
	}
	public void setTipocarttarj(String tipocarttarj) {
		this.tipocarttarj = tipocarttarj;
	}
	public String getCodprodtarj() {
		return codprodtarj;
	}
	public void setCodprodtarj(String codprodtarj) {
		this.codprodtarj = codprodtarj;
	}
	public BigDecimal getMontoTCTarj() {
		return montoTCTarj;
	}
	public void setMontoTCTarj(BigDecimal montoTCTarj) {
		this.montoTCTarj = montoTCTarj;
	}
	
}
