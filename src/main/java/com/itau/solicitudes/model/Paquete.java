package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "cheque", "tc", "td", "cuenta" })
public class Paquete {

	private Integer idPaquete;
	private String tituloPaquete;
	private String codPaquete;
	private String codCombinacion;
	private BigDecimal limiteGlobal;
	private String envioDimicilioCorrespondencia;
	private String convenio;
	private String propositoCuenta;
	private String perfilTransacMensual;
	private Boolean opCOMEX;
	@JsonProperty("Cheque")
	private List<Cheque> Cheque;
	@JsonProperty("TC")
	private List<TC> TC;
	@JsonProperty("TD")
	private List<TD> TD;
	@JsonProperty("Cuenta")
	private List<Cuenta> Cuenta;
	
	public Integer getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getTituloPaquete() {
		return tituloPaquete;
	}
	public void setTituloPaquete(String tituloPaquete) {
		this.tituloPaquete = tituloPaquete;
	}
	public String getCodPaquete() {
		return codPaquete;
	}
	public void setCodPaquete(String codPaquete) {
		this.codPaquete = codPaquete;
	}
	public String getCodCombinacion() {
		return codCombinacion;
	}
	public void setCodCombinacion(String codCombinacion) {
		this.codCombinacion = codCombinacion;
	}
	public BigDecimal getLimiteGlobal() {
		return limiteGlobal;
	}
	public void setLimiteGlobal(BigDecimal limiteGlobal) {
		this.limiteGlobal = limiteGlobal;
	}
	public String getEnvioDimicilioCorrespondencia() {
		return envioDimicilioCorrespondencia;
	}
	public void setEnvioDimicilioCorrespondencia(String envioDimicilioCorrespondencia) {
		this.envioDimicilioCorrespondencia = envioDimicilioCorrespondencia;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getPropositoCuenta() {
		return propositoCuenta;
	}
	public void setPropositoCuenta(String propositoCuenta) {
		this.propositoCuenta = propositoCuenta;
	}
	public String getPerfilTransacMensual() {
		return perfilTransacMensual;
	}
	public void setPerfilTransacMensual(String perfilTransacMensual) {
		this.perfilTransacMensual = perfilTransacMensual;
	}
	public Boolean getOpCOMEX() {
		return opCOMEX;
	}
	public void setOpCOMEX(Boolean opCOMEX) {
		this.opCOMEX = opCOMEX;
	}
	public List<Cheque> getCheque() {
		return Cheque;
	}
	public void setCheque(List<Cheque> cheque) {
		Cheque = cheque;
	}
	public List<TC> getTC() {
		return TC;
	}
	public void setTC(List<TC> tC) {
		TC = tC;
	}
	public List<TD> getTD() {
		return TD;
	}
	public void setTD(List<TD> tD) {
		TD = tD;
	}
	public List<Cuenta> getCuenta() {
		return Cuenta;
	}
	public void setCuenta(List<Cuenta> cuenta) {
		Cuenta = cuenta;
	}
	
}
