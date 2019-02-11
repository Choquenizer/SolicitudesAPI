package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
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
@Table(name = "paquete")
public class Paquete {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaquete;
	private String tituloPaquete;
	private String codPaquete;
	private String codCombinacion;
	private BigDecimal limiteGlobal;
	private String envioDimicilioCorrespondencia;
	private String convenio;
	private String propositoCuenta;
	private String perfilTransacMensual;
	private Boolean opCOMEX;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idPaquete")
	private Set<Cheque> Cheque;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idPaquete")
	private Set<TC> TC;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idPaquete")
	private Set<TD> TD;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idPaquete")
	private Set<Cuenta> Cuenta;
	
	public Long getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(Long idPaquete) {
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
	public Set<Cheque> getCheque() {
		return Cheque;
	}
	public void setCheque(Set<Cheque> cheque) {
		Cheque = cheque;
	}
	public Set<TC> getTC() {
		return TC;
	}
	public void setTC(Set<TC> tC) {
		TC = tC;
	}
	public Set<TD> getTD() {
		return TD;
	}
	public void setTD(Set<TD> tD) {
		TD = tD;
	}
	public Set<Cuenta> getCuenta() {
		return Cuenta;
	}
	public void setCuenta(Set<Cuenta> cuenta) {
		Cuenta = cuenta;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof Paquete))
            return false;

        Paquete other = (Paquete)o;

        if (idPaquete == other.getIdPaquete()) return true;
        if (idPaquete == null) return false;

        // equivalence by id
        return idPaquete.equals(other.getIdPaquete());
    }
 
    @Override
    public int hashCode() {
    	if (idPaquete != null) {
            return idPaquete.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
