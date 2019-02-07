package com.itau.solicitudes.model;

public class Cheque {

	private Integer idCheque;
	private String tipoChequera;
	private String cantidadCheques;
	private String tipoEnvioChequera;
	public Integer getIdCheque() {
		return idCheque;
	}
	public void setIdCheque(Integer idCheque) {
		this.idCheque = idCheque;
	}
	public String getTipoChequera() {
		return tipoChequera;
	}
	public void setTipoChequera(String tipoChequera) {
		this.tipoChequera = tipoChequera;
	}
	public String getCantidadCheques() {
		return cantidadCheques;
	}
	public void setCantidadCheques(String cantidadCheques) {
		this.cantidadCheques = cantidadCheques;
	}
	public String getTipoEnvioChequera() {
		return tipoEnvioChequera;
	}
	public void setTipoEnvioChequera(String tipoEnvioChequera) {
		this.tipoEnvioChequera = tipoEnvioChequera;
	}
	
}
