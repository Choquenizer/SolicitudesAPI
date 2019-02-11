package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prestamo_personal")
public class PrestamoPersonal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPP;
	private String tipoTransaccion;
	private String codigoAgrupamientoSIOC;
	private String numeroCuenta;
	private String numeroTarjeta;
	private String pinActual;
	private String codigoProductoSIOC;
	private String tipoProducto;
	private String moneda;
	private BigDecimal montoPrestamo;
	private Integer cantidadCuotas;
	private Integer diaVencimientoCuota;
	private String cuentaDebitoCuota;
	private String cuentaAcreditaPrestamo;
	private String codigoSeguroVida;
	private String codigoDestinoFondos;
	private String motivoPrestamo;
	private BigDecimal tasaNA;
	private BigDecimal tasaEA;
	private BigDecimal costoFinancieroTotal;
	private BigDecimal gastoAdministrativoCuota0;
	private BigDecimal ivaGastosCuota0;
	private BigDecimal sellosCuota0;
	private BigDecimal montoNeto;
	private BigDecimal seguroVidaCuota0;
	private BigDecimal intereses;
	private BigDecimal valorTotalPrimeraCuota;
	private String tipoTasa;
	private Integer nroContrato;
	private Integer versionContrato;
	private String nombrecta;
	private String indicadorLiberacion;
	private String indicadorMayor70;
	private BigDecimal limiteAcuerdoPreAcordado;
	private Date fechaAcreditacion;
	private BigDecimal tasaSeguroVida;
	private Date fecha1vto;
	private Integer numeroCuota;
	private BigDecimal interesCuota;
	private BigDecimal amortizacioncta;
	private BigDecimal seguroVidaActa;
	private BigDecimal impuestoSinSello;
	private BigDecimal soloSellos;
	private BigDecimal gastosAdmin;
	private BigDecimal saldoCapital;
	private BigDecimal importeMaxDisp;
	private BigDecimal importeMaxCuotaDisp;
	
	
	public Long getIdPP() {
		return idPP;
	}
	public void setIdPP(Long idPP) {
		this.idPP = idPP;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	public String getCodigoAgrupamientoSIOC() {
		return codigoAgrupamientoSIOC;
	}
	public void setCodigoAgrupamientoSIOC(String codigoAgrupamientoSIOC) {
		this.codigoAgrupamientoSIOC = codigoAgrupamientoSIOC;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getPinActual() {
		return pinActual;
	}
	public void setPinActual(String pinActual) {
		this.pinActual = pinActual;
	}
	public String getCodigoProductoSIOC() {
		return codigoProductoSIOC;
	}
	public void setCodigoProductoSIOC(String codigoProductoSIOC) {
		this.codigoProductoSIOC = codigoProductoSIOC;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public BigDecimal getMontoPrestamo() {
		return montoPrestamo;
	}
	public void setMontoPrestamo(BigDecimal montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}
	public Integer getCantidadCuotas() {
		return cantidadCuotas;
	}
	public void setCantidadCuotas(Integer cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}
	public Integer getDiaVencimientoCuota() {
		return diaVencimientoCuota;
	}
	public void setDiaVencimientoCuota(Integer diaVencimientoCuota) {
		this.diaVencimientoCuota = diaVencimientoCuota;
	}
	public String getCuentaDebitoCuota() {
		return cuentaDebitoCuota;
	}
	public void setCuentaDebitoCuota(String cuentaDebitoCuota) {
		this.cuentaDebitoCuota = cuentaDebitoCuota;
	}
	public String getCuentaAcreditaPrestamo() {
		return cuentaAcreditaPrestamo;
	}
	public void setCuentaAcreditaPrestamo(String cuentaAcreditaPrestamo) {
		this.cuentaAcreditaPrestamo = cuentaAcreditaPrestamo;
	}
	public String getCodigoSeguroVida() {
		return codigoSeguroVida;
	}
	public void setCodigoSeguroVida(String codigoSeguroVida) {
		this.codigoSeguroVida = codigoSeguroVida;
	}
	public String getCodigoDestinoFondos() {
		return codigoDestinoFondos;
	}
	public void setCodigoDestinoFondos(String codigoDestinoFondos) {
		this.codigoDestinoFondos = codigoDestinoFondos;
	}
	public String getMotivoPrestamo() {
		return motivoPrestamo;
	}
	public void setMotivoPrestamo(String motivoPrestamo) {
		this.motivoPrestamo = motivoPrestamo;
	}
	public BigDecimal getTasaNA() {
		return tasaNA;
	}
	public void setTasaNA(BigDecimal tasaNA) {
		this.tasaNA = tasaNA;
	}
	public BigDecimal getTasaEA() {
		return tasaEA;
	}
	public void setTasaEA(BigDecimal tasaEA) {
		this.tasaEA = tasaEA;
	}
	public BigDecimal getCostoFinancieroTotal() {
		return costoFinancieroTotal;
	}
	public void setCostoFinancieroTotal(BigDecimal costoFinancieroTotal) {
		this.costoFinancieroTotal = costoFinancieroTotal;
	}
	public BigDecimal getGastoAdministrativoCuota0() {
		return gastoAdministrativoCuota0;
	}
	public void setGastoAdministrativoCuota0(BigDecimal gastoAdministrativoCuota0) {
		this.gastoAdministrativoCuota0 = gastoAdministrativoCuota0;
	}
	public BigDecimal getIvaGastosCuota0() {
		return ivaGastosCuota0;
	}
	public void setIvaGastosCuota0(BigDecimal ivaGastosCuota0) {
		this.ivaGastosCuota0 = ivaGastosCuota0;
	}
	public BigDecimal getSellosCuota0() {
		return sellosCuota0;
	}
	public void setSellosCuota0(BigDecimal sellosCuota0) {
		this.sellosCuota0 = sellosCuota0;
	}
	public BigDecimal getMontoNeto() {
		return montoNeto;
	}
	public void setMontoNeto(BigDecimal montoNeto) {
		this.montoNeto = montoNeto;
	}
	public BigDecimal getSeguroVidaCuota0() {
		return seguroVidaCuota0;
	}
	public void setSeguroVidaCuota0(BigDecimal seguroVidaCuota0) {
		this.seguroVidaCuota0 = seguroVidaCuota0;
	}
	public BigDecimal getIntereses() {
		return intereses;
	}
	public void setIntereses(BigDecimal intereses) {
		this.intereses = intereses;
	}
	public BigDecimal getValorTotalPrimeraCuota() {
		return valorTotalPrimeraCuota;
	}
	public void setValorTotalPrimeraCuota(BigDecimal valorTotalPrimeraCuota) {
		this.valorTotalPrimeraCuota = valorTotalPrimeraCuota;
	}
	public String getTipoTasa() {
		return tipoTasa;
	}
	public void setTipoTasa(String tipoTasa) {
		this.tipoTasa = tipoTasa;
	}
	public Integer getNroContrato() {
		return nroContrato;
	}
	public void setNroContrato(Integer nroContrato) {
		this.nroContrato = nroContrato;
	}
	public Integer getVersionContrato() {
		return versionContrato;
	}
	public void setVersionContrato(Integer versionContrato) {
		this.versionContrato = versionContrato;
	}
	public String getNombrecta() {
		return nombrecta;
	}
	public void setNombrecta(String nombrecta) {
		this.nombrecta = nombrecta;
	}
	public String getIndicadorLiberacion() {
		return indicadorLiberacion;
	}
	public void setIndicadorLiberacion(String indicadorLiberacion) {
		this.indicadorLiberacion = indicadorLiberacion;
	}
	public String getIndicadorMayor70() {
		return indicadorMayor70;
	}
	public void setIndicadorMayor70(String indicadorMayor70) {
		this.indicadorMayor70 = indicadorMayor70;
	}
	public BigDecimal getLimiteAcuerdoPreAcordado() {
		return limiteAcuerdoPreAcordado;
	}
	public void setLimiteAcuerdoPreAcordado(BigDecimal limiteAcuerdoPreAcordado) {
		this.limiteAcuerdoPreAcordado = limiteAcuerdoPreAcordado;
	}
	public Date getFechaAcreditacion() {
		return fechaAcreditacion;
	}
	public void setFechaAcreditacion(Date fechaAcreditacion) {
		this.fechaAcreditacion = fechaAcreditacion;
	}
	public BigDecimal getTasaSeguroVida() {
		return tasaSeguroVida;
	}
	public void setTasaSeguroVida(BigDecimal tasaSeguroVida) {
		this.tasaSeguroVida = tasaSeguroVida;
	}
	public Date getFecha1vto() {
		return fecha1vto;
	}
	public void setFecha1vto(Date fecha1vto) {
		this.fecha1vto = fecha1vto;
	}
	public Integer getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(Integer numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public BigDecimal getInteresCuota() {
		return interesCuota;
	}
	public void setInteresCuota(BigDecimal interesCuota) {
		this.interesCuota = interesCuota;
	}
	public BigDecimal getAmortizacioncta() {
		return amortizacioncta;
	}
	public void setAmortizacioncta(BigDecimal amortizacioncta) {
		this.amortizacioncta = amortizacioncta;
	}
	public BigDecimal getSeguroVidaActa() {
		return seguroVidaActa;
	}
	public void setSeguroVidaActa(BigDecimal seguroVidaActa) {
		this.seguroVidaActa = seguroVidaActa;
	}
	public BigDecimal getImpuestoSinSello() {
		return impuestoSinSello;
	}
	public void setImpuestoSinSello(BigDecimal impuestoSinSello) {
		this.impuestoSinSello = impuestoSinSello;
	}
	public BigDecimal getSoloSellos() {
		return soloSellos;
	}
	public void setSoloSellos(BigDecimal soloSellos) {
		this.soloSellos = soloSellos;
	}
	public BigDecimal getGastosAdmin() {
		return gastosAdmin;
	}
	public void setGastosAdmin(BigDecimal gastosAdmin) {
		this.gastosAdmin = gastosAdmin;
	}
	public BigDecimal getSaldoCapital() {
		return saldoCapital;
	}
	public void setSaldoCapital(BigDecimal saldoCapital) {
		this.saldoCapital = saldoCapital;
	}
	public BigDecimal getImporteMaxDisp() {
		return importeMaxDisp;
	}
	public void setImporteMaxDisp(BigDecimal importeMaxDisp) {
		this.importeMaxDisp = importeMaxDisp;
	}
	public BigDecimal getImporteMaxCuotaDisp() {
		return importeMaxCuotaDisp;
	}
	public void setImporteMaxCuotaDisp(BigDecimal importeMaxCuotaDisp) {
		this.importeMaxCuotaDisp = importeMaxCuotaDisp;
	}
	 
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || !(o instanceof PrestamoPersonal))
            return false;

        PrestamoPersonal other = (PrestamoPersonal)o;

        if (idPP == other.getIdPP()) return true;
        if (idPP == null) return false;

        // equivalence by id
        return idPP.equals(other.getIdPP());
    }
 
    @Override
    public int hashCode() {
    	if (idPP != null) {
            return idPP.hashCode();
        } else {
            return super.hashCode();
        }
    }
}
