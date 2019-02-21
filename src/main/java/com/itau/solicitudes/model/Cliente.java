package com.itau.solicitudes.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = { "pep", "fatca", "referencia", "veraz", "direccion", "sujetoObligado", "datosImpositivos", "datosFamiliares", "datosLaborales", "ocrdocumentData" })
public class Cliente {

	private Long idCliente;
	private long idSolicitud;
	private String codigoConvenio;
	private String esCuitCuil;
	private Date inicioActividad;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nivelCargo1;
	private String nivelCargo2;
	private String nivelProfesion1;
	private String nivelProfesion2;
	private String nivelProfesion3;
	private String nivelRamo1;
	private String nivelRamo2;
	private String nivelRamo3;
	private String relacionDependencia;
	private String tipoPersona;
	private String cliNum;
	private String raiz;
	private String nombre;
	private String segundoNombre;
	private String apellido;
	private Date fechaNacimiento;
	private String cuil;
	private String sexo;
	private Boolean titular;
	private String paisNacimiento;
	private String nacionalidad;
	private String residencia;
	private String estadoCivil;
	private String manejoBienes;
	private Date fechaAltaContrato;
	private String telefonoFijo;
	private String telefonoCelular;
	private String email;
	private String aportaIngreso;
	private Boolean tarejtaDebito;
	private Boolean tarjetaCreditoVisa;
	private Boolean tarjetaCreditoMaster;
	private Boolean vencimientoTarea;
	private Boolean empleado;
	private Boolean esListaInformados;
	private Integer listaInformadosPorcentaje;
	private Boolean esAdicional;
	private Boolean poseeResidenciaDistintaArgentina;
	
	private String perfilCliente;
	private String comportamientoCliente;
	private String tipoCliente;
	private String tipoRenta;
	private BigDecimal renta;
	private Date antiguedadCliente;
	
	@JsonProperty("PEP")
	private PEP PEP;
	@JsonProperty("FATCA")
	private List<FATCA> FATCA;
	@JsonProperty("SujetoObligado")
	private SujetoObligado SujetoObligado;
	@JsonProperty("Referencia")
	private Referencia Referencia;
	@JsonProperty("DatosImpositivos")
	private DatosImpositivos DatosImpositivos;
	@JsonProperty("Veraz")
	private Veraz Veraz;
	@JsonProperty("Direccion")
	private List<Direccion> Direccion;
	@JsonProperty("DatosFamiliares")
	private List<DatosFamiliares> DatosFamiliares;
	@JsonProperty("DatosLaborales")
	private List<DatosLaborales> DatosLaborales;
	@JsonProperty("OCRDocumentData")
	private List<OCRDocumentData> OCRDocumentData;
	
	
	public long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getCodigoConvenio() {
		return codigoConvenio;
	}
	public void setCodigoConvenio(String codigoConvenio) {
		this.codigoConvenio = codigoConvenio;
	}
	public String getEsCuitCuil() {
		return esCuitCuil;
	}
	public void setEsCuitCuil(String esCuitCuil) {
		this.esCuitCuil = esCuitCuil;
	}
	public Date getInicioActividad() {
		return inicioActividad;
	}
	public void setInicioActividad(Date inicioActividad) {
		this.inicioActividad = inicioActividad;
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
	public String getNivelCargo1() {
		return nivelCargo1;
	}
	public void setNivelCargo1(String nivelCargo1) {
		this.nivelCargo1 = nivelCargo1;
	}
	public String getNivelCargo2() {
		return nivelCargo2;
	}
	public void setNivelCargo2(String nivelCargo2) {
		this.nivelCargo2 = nivelCargo2;
	}
	public String getNivelProfesion1() {
		return nivelProfesion1;
	}
	public void setNivelProfesion1(String nivelProfesion1) {
		this.nivelProfesion1 = nivelProfesion1;
	}
	public String getNivelProfesion2() {
		return nivelProfesion2;
	}
	public void setNivelProfesion2(String nivelProfesion2) {
		this.nivelProfesion2 = nivelProfesion2;
	}
	public String getNivelProfesion3() {
		return nivelProfesion3;
	}
	public void setNivelProfesion3(String nivelProfesion3) {
		this.nivelProfesion3 = nivelProfesion3;
	}
	public String getNivelRamo1() {
		return nivelRamo1;
	}
	public void setNivelRamo1(String nivelRamo1) {
		this.nivelRamo1 = nivelRamo1;
	}
	public String getNivelRamo2() {
		return nivelRamo2;
	}
	public void setNivelRamo2(String nivelRamo2) {
		this.nivelRamo2 = nivelRamo2;
	}
	public String getNivelRamo3() {
		return nivelRamo3;
	}
	public void setNivelRamo3(String nivelRamo3) {
		this.nivelRamo3 = nivelRamo3;
	}
	public String getRelacionDependencia() {
		return relacionDependencia;
	}
	public void setRelacionDependencia(String relacionDependencia) {
		this.relacionDependencia = relacionDependencia;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public String getCliNum() {
		return cliNum;
	}
	public void setCliNum(String cliNum) {
		this.cliNum = cliNum;
	}
	public String getRaiz() {
		return raiz;
	}
	public void setRaiz(String raiz) {
		this.raiz = raiz;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public Boolean getTitular() {
		return titular;
	}
	public void setTitular(Boolean titular) {
		this.titular = titular;
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
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getManejoBienes() {
		return manejoBienes;
	}
	public void setManejoBienes(String manejoBienes) {
		this.manejoBienes = manejoBienes;
	}
	public Date getFechaAltaContrato() {
		return fechaAltaContrato;
	}
	public void setFechaAltaContrato(Date fechaAltaContrato) {
		this.fechaAltaContrato = fechaAltaContrato;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAportaIngreso() {
		return aportaIngreso;
	}
	public void setAportaIngreso(String aportaIngreso) {
		this.aportaIngreso = aportaIngreso;
	}
	public Boolean getTarejtaDebito() {
		return tarejtaDebito;
	}
	public void setTarejtaDebito(Boolean tarejtaDebito) {
		this.tarejtaDebito = tarejtaDebito;
	}
	public Boolean getTarjetaCreditoVisa() {
		return tarjetaCreditoVisa;
	}
	public void setTarjetaCreditoVisa(Boolean tarjetaCreditoVisa) {
		this.tarjetaCreditoVisa = tarjetaCreditoVisa;
	}
	public Boolean getTarjetaCreditoMaster() {
		return tarjetaCreditoMaster;
	}
	public void setTarjetaCreditoMaster(Boolean tarjetaCreditoMaster) {
		this.tarjetaCreditoMaster = tarjetaCreditoMaster;
	}
	public Boolean getVencimientoTarea() {
		return vencimientoTarea;
	}
	public void setVencimientoTarea(Boolean vencimientoTarea) {
		this.vencimientoTarea = vencimientoTarea;
	}
	public Boolean getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Boolean empleado) {
		this.empleado = empleado;
	}
	public Boolean getEsListaInformados() {
		return esListaInformados;
	}
	public void setEsListaInformados(Boolean esListaInformados) {
		this.esListaInformados = esListaInformados;
	}
	public Integer getListaInformadosPorcentaje() {
		return listaInformadosPorcentaje;
	}
	public void setListaInformadosPorcentaje(Integer listaInformadosPorcentaje) {
		this.listaInformadosPorcentaje = listaInformadosPorcentaje;
	}
	public Boolean getEsAdicional() {
		return esAdicional;
	}
	public void setEsAdicional(Boolean esAdicional) {
		this.esAdicional = esAdicional;
	}
	public Boolean getPoseeResidenciaDistintaArgentina() {
		return poseeResidenciaDistintaArgentina;
	}
	public void setPoseeResidenciaDistintaArgentina(Boolean poseeResidenciaDistintaArgentina) {
		this.poseeResidenciaDistintaArgentina = poseeResidenciaDistintaArgentina;
	}
	public PEP getPEP() {
		return PEP;
	}
	public void setPEP(PEP pEP) {
		PEP = pEP;
	}
	public List<FATCA> getFATCA() {
		return FATCA;
	}
	public void setFATCA(List<FATCA> fATCA) {
		FATCA = fATCA;
	}
	public SujetoObligado getSujetoObligado() {
		return SujetoObligado;
	}
	public void setSujetoObligado(SujetoObligado sujetoObligado) {
		SujetoObligado = sujetoObligado;
	}
	public Referencia getReferencia() {
		return Referencia;
	}
	public void setReferencia(Referencia referencia) {
		Referencia = referencia;
	}
	public DatosImpositivos getDatosImpositivos() {
		return DatosImpositivos;
	}
	public void setDatosImpositivos(DatosImpositivos datosImpositivos) {
		DatosImpositivos = datosImpositivos;
	}
	public Veraz getVeraz() {
		return Veraz;
	}
	public void setVeraz(Veraz veraz) {
		Veraz = veraz;
	}
	public List<Direccion> getDireccion() {
		return Direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		Direccion = direccion;
	}
	public List<DatosFamiliares> getDatosFamiliares() {
		return DatosFamiliares;
	}
	public void setDatosFamiliares(List<DatosFamiliares> datosFamiliares) {
		DatosFamiliares = datosFamiliares;
	}
	public List<DatosLaborales> getDatosLaborales() {
		return DatosLaborales;
	}
	public void setDatosLaborales(List<DatosLaborales> datosLaborales) {
		DatosLaborales = datosLaborales;
	}
	public List<OCRDocumentData> getOCRDocumentData() {
		return OCRDocumentData;
	}
	public void setOCRDocumentData(List<OCRDocumentData> oCRDocumentData) {
		OCRDocumentData = oCRDocumentData;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getPerfilCliente() {
		return perfilCliente;
	}
	public void setPerfilCliente(String perfilCliente) {
		this.perfilCliente = perfilCliente;
	}
	public String getComportamientoCliente() {
		return comportamientoCliente;
	}
	public void setComportamientoCliente(String comportamientoCliente) {
		this.comportamientoCliente = comportamientoCliente;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getTipoRenta() {
		return tipoRenta;
	}
	public void setTipoRenta(String tipoRenta) {
		this.tipoRenta = tipoRenta;
	}
	public BigDecimal getRenta() {
		return renta;
	}
	public void setRenta(BigDecimal renta) {
		this.renta = renta;
	}
	public Date getAntiguedadCliente() {
		return antiguedadCliente;
	}
	public void setAntiguedadCliente(Date antiguedadCliente) {
		this.antiguedadCliente = antiguedadCliente;
	}
	
}
