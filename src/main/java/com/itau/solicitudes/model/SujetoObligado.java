package com.itau.solicitudes.model;

import java.util.Date;

public class SujetoObligado {

	private Boolean esSujetoObligado;
	private Date fechaInscripcion;
	private Date fechaVencConstanciaUIF;
	private Boolean indicadorDDJJ;
	private Boolean indicadorInscripcionUIF;
	
	public Boolean getEsSujetoObligado() {
		return esSujetoObligado;
	}
	public void setEsSujetoObligado(Boolean esSujetoObligado) {
		this.esSujetoObligado = esSujetoObligado;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public Date getFechaVencConstanciaUIF() {
		return fechaVencConstanciaUIF;
	}
	public void setFechaVencConstanciaUIF(Date fechaVencConstanciaUIF) {
		this.fechaVencConstanciaUIF = fechaVencConstanciaUIF;
	}
	public Boolean getIndicadorDDJJ() {
		return indicadorDDJJ;
	}
	public void setIndicadorDDJJ(Boolean indicadorDDJJ) {
		this.indicadorDDJJ = indicadorDDJJ;
	}
	public Boolean getIndicadorInscripcionUIF() {
		return indicadorInscripcionUIF;
	}
	public void setIndicadorInscripcionUIF(Boolean indicadorInscripcionUIF) {
		this.indicadorInscripcionUIF = indicadorInscripcionUIF;
	}
	
}
