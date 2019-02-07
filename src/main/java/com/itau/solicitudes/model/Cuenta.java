package com.itau.solicitudes.model;

import java.math.BigDecimal;

public class Cuenta {

	private Integer idCuenta;
	private String codProducto;
	private String codAplicacionProducto;
	private String descripcionProducto;
	private String tipoCuenta;
	private String moneda;
	private BigDecimal limitAmount;
	private String limitCurrency;
	
	public Integer getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
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
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public BigDecimal getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}
	public String getLimitCurrency() {
		return limitCurrency;
	}
	public void setLimitCurrency(String limitCurrency) {
		this.limitCurrency = limitCurrency;
	}
	
}
