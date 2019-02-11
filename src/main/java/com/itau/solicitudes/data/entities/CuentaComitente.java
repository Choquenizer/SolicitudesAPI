package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_comitente")
public class CuentaComitente {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCC;
	private String segmento;
	private String denominacion;
	private String cuentaMonetarioaDBCR;
	private String usoFirma;
	private Boolean calificado;
	private BigDecimal patrimonio;
	
	public Long getIdCC() {
		return idCC;
	}
	public void setIdCC(Long idCC) {
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
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof CuentaComitente))
            return false;

        CuentaComitente other = (CuentaComitente)o;

        if (idCC == other.getIdCC()) return true;
        if (idCC == null) return false;

        // equivalence by id
        return idCC.equals(other.getIdCC());
    }
 
    @Override
    public int hashCode() {
    	if (idCC != null) {
            return idCC.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
