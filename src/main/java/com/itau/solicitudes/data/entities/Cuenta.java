package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCuenta;
	private String codProducto;
	private String codAplicacionProducto;
	private String descripcionProducto;
	private String tipoCuenta;
	private String moneda;
	private BigDecimal limitAmount;
	private String limitCurrency;
	
	public Long getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Long idCuenta) {
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
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof Cuenta))
            return false;

        Cuenta other = (Cuenta)o;

        if (idCuenta == other.getIdCuenta()) return true;
        if (idCuenta == null) return false;

        // equivalence by id
        return idCuenta.equals(other.getIdCuenta());
    }
 
    @Override
    public int hashCode() {
    	if (getIdCuenta() != null) {
            return getIdCuenta().hashCode();
        } else {
            return super.hashCode();
        }
    }
}
