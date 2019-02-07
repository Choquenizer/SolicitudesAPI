package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TC {

	private Integer idTC;
	private String codProducto;
	private String codAplicacionProducto;
	private BigDecimal limitAmount;
	private String limiteCurrency;
	private String formaPago;
	private String tipoPago;
	@JsonFormat(pattern="yy")
	private Date fechaCierre;
	private String tipoExtracto;
	private String descripcionProducto;
	private String entidadProductora;
	private String claseTarjeta;
	private String programaBeneficio;
	private String grupoAfinidad;
	private String codRelacionCombinatoriaTarjeta;
	public Integer getIdTC() {
		return idTC;
	}
	public void setIdTC(Integer idTC) {
		this.idTC = idTC;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
	public String getCodAplicacionProducto() {
		return codAplicacionProducto;
	}
	public void setCodAplicacionProducto(String codAplicacionProducto) {
		this.codAplicacionProducto = codAplicacionProducto;
	}
	public BigDecimal getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}
	public String getLimiteCurrency() {
		return limiteCurrency;
	}
	public void setLimiteCurrency(String limiteCurrency) {
		this.limiteCurrency = limiteCurrency;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public Date getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public String getTipoExtracto() {
		return tipoExtracto;
	}
	public void setTipoExtracto(String tipoExtracto) {
		this.tipoExtracto = tipoExtracto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getEntidadProductora() {
		return entidadProductora;
	}
	public void setEntidadProductora(String entidadProductora) {
		this.entidadProductora = entidadProductora;
	}
	public String getClaseTarjeta() {
		return claseTarjeta;
	}
	public void setClaseTarjeta(String claseTarjeta) {
		this.claseTarjeta = claseTarjeta;
	}
	public String getProgramaBeneficio() {
		return programaBeneficio;
	}
	public void setProgramaBeneficio(String programaBeneficio) {
		this.programaBeneficio = programaBeneficio;
	}
	public String getGrupoAfinidad() {
		return grupoAfinidad;
	}
	public void setGrupoAfinidad(String grupoAfinidad) {
		this.grupoAfinidad = grupoAfinidad;
	}
	public String getCodRelacionCombinatoriaTarjeta() {
		return codRelacionCombinatoriaTarjeta;
	}
	public void setCodRelacionCombinatoriaTarjeta(String codRelacionCombinatoriaTarjeta) {
		this.codRelacionCombinatoriaTarjeta = codRelacionCombinatoriaTarjeta;
	}
	
}
