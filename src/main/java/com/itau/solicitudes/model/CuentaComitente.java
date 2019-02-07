package com.itau.solicitudes.model;

import java.math.BigDecimal;

public class CuentaComitente {

	private Integer idCC;
	private String segmento;
	private String denominacion;
	private String cuentaMonetarioaDBCR;
	private String usoFirma;
	private Boolean calificado;
	private BigDecimal patrimonio;
	
	public Integer getIdCC() {
		return idCC;
	}
	public void setIdCC(Integer idCC) {
		this.idCC = idCC;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public String getCuentaMonetarioaDBCR() {
		return cuentaMonetarioaDBCR;
	}
	public void setCuentaMonetarioaDBCR(String cuentaMonetarioaDBCR) {
		this.cuentaMonetarioaDBCR = cuentaMonetarioaDBCR;
	}
	public String getUsoFirma() {
		return usoFirma;
	}
	public void setUsoFirma(String usoFirma) {
		this.usoFirma = usoFirma;
	}
	public Boolean getCalificado() {
		return calificado;
	}
	public void setCalificado(Boolean calificado) {
		this.calificado = calificado;
	}
	public BigDecimal getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(BigDecimal patrimonio) {
		this.patrimonio = patrimonio;
	}
	
}
