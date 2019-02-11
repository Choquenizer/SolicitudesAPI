package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTarjeta;
	private String entprodtarj;
	private String tipocarttarj;
	private String codprodtarj;
	private BigDecimal montoTCTarj;
	public Long getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(Long idTarjeta) {
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
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof Tarjeta))
            return false;

        Tarjeta other = (Tarjeta)o;

        if (idTarjeta == other.getIdTarjeta()) return true;
        if (idTarjeta == null) return false;

        // equivalence by id
        return idTarjeta.equals(other.getIdTarjeta());
    }
 
    @Override
    public int hashCode() {
    	if (idTarjeta != null) {
            return idTarjeta.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
