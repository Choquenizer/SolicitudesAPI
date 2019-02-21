package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "datos_familiares")
public class DatosFamiliares {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDatosFamiliares;
	private String parentesco;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private String numeroDocumento;
	private Date fechaNacimiento;
	private String cuil;
	private String sexo;
	private BigDecimal ingresoNetosMensuales;
	private String paisNacimiento;
	private String nacionalidad;
	private String nombrePadre;
	private String apellidoPadre;
	private String nombreMadre;
	private String apellidoMadre;
	@JoinColumn(name="verazId")
	private Veraz Veraz;
	
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public BigDecimal getIngresoNetosMensuales() {
		return ingresoNetosMensuales;
	}
	public void setIngresoNetosMensuales(BigDecimal ingresoNetosMensuales) {
		this.ingresoNetosMensuales = ingresoNetosMensuales;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getApellidoPadre() {
		return apellidoPadre;
	}
	public void setApellidoPadre(String apellidoPadre) {
		this.apellidoPadre = apellidoPadre;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getApellidoMadre() {
		return apellidoMadre;
	}
	public void setApellidoMadre(String apellidoMadre) {
		this.apellidoMadre = apellidoMadre;
	}
	public Long getIdDatosFamiliares() {
		return idDatosFamiliares;
	}
	public void setIdDatosFamiliares(Long idDatosFamiliares) {
		this.idDatosFamiliares = idDatosFamiliares;
	}
    public Veraz getVeraz() {
		return Veraz;
	}
	public void setVeraz(Veraz veraz) {
		Veraz = veraz;
	}
	
	@Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof DatosFamiliares))
            return false;

        DatosFamiliares other = (DatosFamiliares)o;

        if (idDatosFamiliares == other.getIdDatosFamiliares()) return true;
        if (idDatosFamiliares == null) return false;

        // equivalence by id
        return idDatosFamiliares.equals(other.getIdDatosFamiliares());
    }
 
    @Override
    public int hashCode() {
    	if (idDatosFamiliares != null) {
            return idDatosFamiliares.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
