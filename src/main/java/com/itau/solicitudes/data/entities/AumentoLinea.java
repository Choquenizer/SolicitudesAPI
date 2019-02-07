package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aumento_linea")
public class AumentoLinea {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAL;
	private String funcion;
	private Date fechaVig;
	private String moeCodig;
	private BigDecimal acuerdoCCActual;
	private BigDecimal lineaTCActual;
	private BigDecimal montoPrestamoConGarantia;
	private BigDecimal montoPrestamoSinGarantia;
	private BigDecimal lineaTotal;
	private BigDecimal compromisoMaximo;
	private BigDecimal cuotaPrestamoConGarantia;
	private BigDecimal cuotaPrestamoSinGarantia;
	private String codpct;
	private BigDecimal montoGlobal;
	private BigDecimal montocc;
	private String idutlalt;
	private BigDecimal limiteTarjetaVISA;
	private BigDecimal limiteTarjetaMaster;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "aumentoLineaID")
	private Set<Tarjeta> Tarjeta;
	
	public Long getIdAL() {
		return idAL;
	}
	public void setIdAL(Long idAL) {
		this.idAL = idAL;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public Date getFechaVig() {
		return fechaVig;
	}
	public void setFechaVig(Date fechaVig) {
		this.fechaVig = fechaVig;
	}
	public String getMoeCodig() {
		return moeCodig;
	}
	public void setMoeCodig(String moeCodig) {
		this.moeCodig = moeCodig;
	}
	public BigDecimal getAcuerdoCCActual() {
		return acuerdoCCActual;
	}
	public void setAcuerdoCCActual(BigDecimal acuerdoCCActual) {
		this.acuerdoCCActual = acuerdoCCActual;
	}
	public BigDecimal getLineaTCActual() {
		return lineaTCActual;
	}
	public void setLineaTCActual(BigDecimal lineaTCActual) {
		this.lineaTCActual = lineaTCActual;
	}
	public BigDecimal getMontoPrestamoConGarantia() {
		return montoPrestamoConGarantia;
	}
	public void setMontoPrestamoConGarantia(BigDecimal montoPrestamoConGarantia) {
		this.montoPrestamoConGarantia = montoPrestamoConGarantia;
	}
	public BigDecimal getMontoPrestamoSinGarantia() {
		return montoPrestamoSinGarantia;
	}
	public void setMontoPrestamoSinGarantia(BigDecimal montoPrestamoSinGarantia) {
		this.montoPrestamoSinGarantia = montoPrestamoSinGarantia;
	}
	public BigDecimal getLineaTotal() {
		return lineaTotal;
	}
	public void setLineaTotal(BigDecimal lineaTotal) {
		this.lineaTotal = lineaTotal;
	}
	public BigDecimal getCompromisoMaximo() {
		return compromisoMaximo;
	}
	public void setCompromisoMaximo(BigDecimal compromisoMaximo) {
		this.compromisoMaximo = compromisoMaximo;
	}
	public BigDecimal getCuotaPrestamoConGarantia() {
		return cuotaPrestamoConGarantia;
	}
	public void setCuotaPrestamoConGarantia(BigDecimal cuotaPrestamoConGarantia) {
		this.cuotaPrestamoConGarantia = cuotaPrestamoConGarantia;
	}
	public BigDecimal getCuotaPrestamoSinGarantia() {
		return cuotaPrestamoSinGarantia;
	}
	public void setCuotaPrestamoSinGarantia(BigDecimal cuotaPrestamoSinGarantia) {
		this.cuotaPrestamoSinGarantia = cuotaPrestamoSinGarantia;
	}
	public String getCodpct() {
		return codpct;
	}
	public void setCodpct(String codpct) {
		this.codpct = codpct;
	}
	public BigDecimal getMontoGlobal() {
		return montoGlobal;
	}
	public void setMontoGlobal(BigDecimal montoGlobal) {
		this.montoGlobal = montoGlobal;
	}
	public BigDecimal getMontocc() {
		return montocc;
	}
	public void setMontocc(BigDecimal montocc) {
		this.montocc = montocc;
	}
	public String getIdutlalt() {
		return idutlalt;
	}
	public void setIdutlalt(String idutlalt) {
		this.idutlalt = idutlalt;
	}
	public BigDecimal getLimiteTarjetaVISA() {
		return limiteTarjetaVISA;
	}
	public void setLimiteTarjetaVISA(BigDecimal limiteTarjetaVISA) {
		this.limiteTarjetaVISA = limiteTarjetaVISA;
	}
	public BigDecimal getLimiteTarjetaMaster() {
		return limiteTarjetaMaster;
	}
	public void setLimiteTarjetaMaster(BigDecimal limiteTarjetaMaster) {
		this.limiteTarjetaMaster = limiteTarjetaMaster;
	}
	public Set<Tarjeta> getTarjeta() {
		return Tarjeta;
	}
	public void setTarjeta(Set<Tarjeta> tarjeta) {
		Tarjeta = tarjeta;
	}
}
