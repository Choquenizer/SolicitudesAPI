package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pep")
public class PEP {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPEP;
	private Boolean esPEP;
	private String cargo;
	private String funcion;
	private String jerarquia;
	
	public Boolean getEsPEP() {
		return esPEP;
	}
	public void setEsPEP(Boolean esPEP) {
		this.esPEP = esPEP;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public String getJerarquia() {
		return jerarquia;
	}
	public void setJerarquia(String jerarquia) {
		this.jerarquia = jerarquia;
	}
	public Long getIdPEP() {
		return idPEP;
	}
	public void setIdPEP(Long idPEP) {
		this.idPEP = idPEP;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof PEP))
            return false;

        PEP other = (PEP)o;

        if (idPEP == other.getIdPEP()) return true;
        if (idPEP == null) return false;

        // equivalence by id
        return idPEP.equals(other.getIdPEP());
    }
 
    @Override
    public int hashCode() {
    	if (idPEP != null) {
            return idPEP.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
