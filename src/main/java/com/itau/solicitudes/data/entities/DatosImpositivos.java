package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos_impositivos")
public class DatosImpositivos {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDatosImpositivos;
	private String condicionesFrenteGanancias;
	private String condicionFrenteIVA;
	private String condicionIB;
	private String numeroInscripcionIB;
	private String practicaAjusteInflacion;
	
	public String getCondicionesFrenteGanancias() {
		return condicionesFrenteGanancias;
	}
	public void setCondicionesFrenteGanancias(String condicionesFrenteGanancias) {
		this.condicionesFrenteGanancias = condicionesFrenteGanancias;
	}
	public String getCondicionFrenteIVA() {
		return condicionFrenteIVA;
	}
	public void setCondicionFrenteIVA(String condicionFrenteIVA) {
		this.condicionFrenteIVA = condicionFrenteIVA;
	}
	public String getCondicionIB() {
		return condicionIB;
	}
	public void setCondicionIB(String condicionIB) {
		this.condicionIB = condicionIB;
	}
	public String getNumeroInscripcionIB() {
		return numeroInscripcionIB;
	}
	public void setNumeroInscripcionIB(String numeroInscripcionIB) {
		this.numeroInscripcionIB = numeroInscripcionIB;
	}
	public String getPracticaAjusteInflacion() {
		return practicaAjusteInflacion;
	}
	public void setPracticaAjusteInflacion(String practicaAjusteInflacion) {
		this.practicaAjusteInflacion = practicaAjusteInflacion;
	}
	public Long getIdDatosImpositivos() {
		return idDatosImpositivos;
	}
	public void setIdDatosImpositivos(Long idDatosImpositivos) {
		this.idDatosImpositivos = idDatosImpositivos;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof DatosImpositivos))
            return false;

        DatosImpositivos other = (DatosImpositivos)o;

        if (idDatosImpositivos == other.getIdDatosImpositivos()) return true;
        if (idDatosImpositivos == null) return false;

        // equivalence by id
        return idDatosImpositivos.equals(other.getIdDatosImpositivos());
    }
 
    @Override
    public int hashCode() {
    	if (idDatosImpositivos != null) {
            return idDatosImpositivos.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
