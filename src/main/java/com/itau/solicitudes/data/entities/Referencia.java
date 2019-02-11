package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "referencia")
public class Referencia {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReferencia;
	private String nombreRef;
	private String apellidoRef;
	private String telefonoRef;
	
	public String getNombreRef() {
		return nombreRef;
	}
	public void setNombreRef(String nombreRef) {
		this.nombreRef = nombreRef;
	}
	public String getApellidoRef() {
		return apellidoRef;
	}
	public void setApellidoRef(String apellidoRef) {
		this.apellidoRef = apellidoRef;
	}
	public String getTelefonoRef() {
		return telefonoRef;
	}
	public void setTelefonoRef(String telefonoRef) {
		this.telefonoRef = telefonoRef;
	}
	public Long getIdReferencia() {
		return idReferencia;
	}
	public void setIdReferencia(Long idReferencia) {
		this.idReferencia = idReferencia;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof Referencia))
            return false;

        Referencia other = (Referencia)o;

        if (idReferencia == other.getIdReferencia()) return true;
        if (idReferencia == null) return false;

        // equivalence by id
        return idReferencia.equals(other.getIdReferencia());
    }
 
    @Override
    public int hashCode() {
    	if (idReferencia != null) {
            return idReferencia.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
