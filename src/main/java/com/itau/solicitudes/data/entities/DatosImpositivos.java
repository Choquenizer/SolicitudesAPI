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
	private long idDatosImpositivos;
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
	public long getIdDatosImpositivos() {
		return idDatosImpositivos;
	}
	public void setIdDatosImpositivos(long idDatosImpositivos) {
		this.idDatosImpositivos = idDatosImpositivos;
	}
}
