package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "prestamoPersonal", "cuentaComitente", "paquete", "aumentoLinea", "cliente" })
public class Solicitud {

	private long idSolicitud;
	private String tipoSolicitud;
	private String idCanal;
	private Integer idGestion;
	private String estado;
	private Boolean esCliente;
	private String segmento;
	private String asistente;
	private Integer idSucursal;
	private String sucursal;
	private String zona;
	private String gestionDocumental;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	private Boolean clienteNuevo;
	private BigDecimal monto;
	private String motivo;
	private String origen;
	private BigDecimal acuerdoCC;
	private BigDecimal lineaTC;
	private BigDecimal montoPrestamo;
	private BigDecimal cuotaPrestamo;
	private BigDecimal lineaTotal;
	private BigDecimal compromisoMaximo;
	@JsonProperty("PrestamoPersonal")
	private PrestamoPersonal prestamoPersonal;
	@JsonProperty("CuentaComitente")
	private CuentaComitente cuentaComitente;
	@JsonProperty("Paquete")
	private Paquete paquete;
	@JsonProperty("AumentoLinea")
	private AumentoLinea aumentoLinea;
	@JsonProperty("Cliente")
	private List<Cliente> cliente;
	
	
	public long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getIdCanal() {
		return idCanal;
	}
	public void setIdCanal(String idCanal) {
		this.idCanal = idCanal;
	}
	public Integer getIdGestion() {
		return idGestion;
	}
	public void setIdGestion(Integer idGestion) {
		this.idGestion = idGestion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Boolean getEsCliente() {
		return esCliente;
	}
	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getAsistente() {
		return asistente;
	}
	public void setAsistente(String asistente) {
		this.asistente = asistente;
	}
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getGestionDocumental() {
		return gestionDocumental;
	}
	public void setGestionDocumental(String gestionDocumental) {
		this.gestionDocumental = gestionDocumental;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public Boolean getClienteNuevo() {
		return clienteNuevo;
	}
	public void setClienteNuevo(Boolean clienteNuevo) {
		this.clienteNuevo = clienteNuevo;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public BigDecimal getAcuerdoCC() {
		return acuerdoCC;
	}
	public void setAcuerdoCC(BigDecimal acuerdoCC) {
		this.acuerdoCC = acuerdoCC;
	}
	public BigDecimal getLineaTC() {
		return lineaTC;
	}
	public void setLineaTC(BigDecimal lineaTC) {
		this.lineaTC = lineaTC;
	}
	public BigDecimal getMontoPrestamo() {
		return montoPrestamo;
	}
	public void setMontoPrestamo(BigDecimal montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}
	public BigDecimal getCuotaPrestamo() {
		return cuotaPrestamo;
	}
	public void setCuotaPrestamo(BigDecimal cuotaPrestamo) {
		this.cuotaPrestamo = cuotaPrestamo;
	}
	public BigDecimal getLineaTotal() {
		return lineaTotal;
	}
	public void setLineaTotal(BigDecimal lineaTotal) {
		this.lineaTotal = lineaTotal;
	}
	public BigDecimal getCompromisoMaximo() {
		return compromisoMaximo;
	}
	public void setCompromisoMaximo(BigDecimal compromisoMaximo) {
		this.compromisoMaximo = compromisoMaximo;
	}
	public PrestamoPersonal getPrestamoPersonal() {
		return prestamoPersonal;
	}
	public void setPrestamoPersonal(PrestamoPersonal prestamoPersonal) {
		this.prestamoPersonal = prestamoPersonal;
	}
	public CuentaComitente getCuentaComitente() {
		return cuentaComitente;
	}
	public void setCuentaComitente(CuentaComitente cuentaComitente) {
		this.cuentaComitente = cuentaComitente;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public AumentoLinea getAumentoLinea() {
		return aumentoLinea;
	}
	public void setAumentoLinea(AumentoLinea aumentoLinea) {
		this.aumentoLinea = aumentoLinea;
	}
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
}
