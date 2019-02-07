package com.itau.solicitudes.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "td")
public class TD {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTD;
	private String codigoProducto;
	private String codigoAplicacionProducto;
	public Long getIdTD() {
		return idTD;
	}
	public void setIdTD(Long idTD) {
		this.idTD = idTD;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getCodigoAplicacionProducto() {
		return codigoAplicacionProducto;
	}
	public void setCodigoAplicacionProducto(String codigoAplicacionProducto) {
		this.codigoAplicacionProducto = codigoAplicacionProducto;
	}
	
}
