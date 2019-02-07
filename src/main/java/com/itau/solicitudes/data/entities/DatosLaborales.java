package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos_laborales")
public class DatosLaborales {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idDatosLaborales;
	private String actividadPrincipal;
	private Boolean acreditaSueldo;
	private String grupoPSI;
	private String empresa;
	private BigDecimal cuit;
	private String ramo;
	private String cargo;
	private String actividad;
	private BigDecimal ingresosNetosMensuales;
	private Date fechaIngreso;
	private String profesion;
	private Boolean otrosIngresos;
	private BigDecimal montoNetoMensual;
	private String origenFondos;
	
	public String getActividadPrincipal() {
		return actividadPrincipal;
	}
	public void setActividadPrincipal(String actividadPrincipal) {
		this.actividadPrincipal = actividadPrincipal;
	}
	public Boolean getAcreditaSueldo() {
		return acreditaSueldo;
	}
	public void setAcreditaSueldo(Boolean acreditaSueldo) {
		this.acreditaSueldo = acreditaSueldo;
	}
	public String getGrupoPSI() {
		return grupoPSI;
	}
	public void setGrupoPSI(String grupoPSI) {
		this.grupoPSI = grupoPSI;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public BigDecimal getCuit() {
		return cuit;
	}
	public void setCuit(BigDecimal cuit) {
		this.cuit = cuit;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public BigDecimal getIngresosNetosMensuales() {
		return ingresosNetosMensuales;
	}
	public void setIngresosNetosMensuales(BigDecimal ingresosNetosMensuales) {
		this.ingresosNetosMensuales = ingresosNetosMensuales;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public Boolean getOtrosIngresos() {
		return otrosIngresos;
	}
	public void setOtrosIngresos(Boolean otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}
	public BigDecimal getMontoNetoMensual() {
		return montoNetoMensual;
	}
	public void setMontoNetoMensual(BigDecimal montoNetoMensual) {
		this.montoNetoMensual = montoNetoMensual;
	}
	public String getOrigenFondos() {
		return origenFondos;
	}
	public void setOrigenFondos(String origenFondos) {
		this.origenFondos = origenFondos;
	}
	public long getIdDatosLaborales() {
		return idDatosLaborales;
	}
	public void setIdDatosLaborales(long idDatosLaborales) {
		this.idDatosLaborales = idDatosLaborales;
	}
	
}
