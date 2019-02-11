package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cheque")
public class Cheque {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCheque;
	private String tipoChequera;
	private String cantidadCheques;
	private String tipoEnvioChequera;
	
	public Long getIdCheque() {
		return idCheque;
	}
	public void setIdCheque(Long idCheque) {
		this.idCheque = idCheque;
	}
	public String getTipoChequera() {
		return tipoChequera;
	}
	public void setTipoChequera(String tipoChequera) {
		this.tipoChequera = tipoChequera;
	}
	public String getCantidadCheques() {
		return cantidadCheques;
	}
	public void setCantidadCheques(String cantidadCheques) {
		this.cantidadCheques = cantidadCheques;
	}
	public String getTipoEnvioChequera() {
		return tipoEnvioChequera;
	}
	public void setTipoEnvioChequera(String tipoEnvioChequera) {
		this.tipoEnvioChequera = tipoEnvioChequera;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof Cheque))
            return false;

        Cheque other = (Cheque)o;

        if (idCheque == other.getIdCheque()) return true;
        if (idCheque == null) return false;

        // equivalence by id
        return idCheque.equals(other.getIdCheque());
    }
 
    @Override
    public int hashCode() {
    	if (idCheque != null) {
            return getIdCheque().hashCode();
        } else {
            return super.hashCode();
        }
    }
}
