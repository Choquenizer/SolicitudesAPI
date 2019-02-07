package com.itau.solicitudes.data.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCliente;
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
	private Integer cliNum;
	private String raiz;
	private String nombre;
	private String segundoNombre;
	private String apellido;
	private Date fechaNacimiento;
	private BigDecimal cuil;
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
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pepId")
    private PEP PEP;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idCliente")
	private Set<FATCA> FATCA;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sujetoObligadoId")
    private SujetoObligado SujetoObligado;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="referenciaId")
    private Referencia Referencia;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="datosImpositivosId")
    private DatosImpositivos DatosImpositivos;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="verazId")
   private Veraz Veraz;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idCliente")
	private Set<Direccion> Direccion;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idCliente")
	private Set<DatosFamiliares> DatosFamiliares;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idCliente")
	private Set<DatosLaborales> DatosLaborales;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "idCliente")
	private Set<OCRDocumentData> OCRDocumentData;
	

	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
	public Integer getCliNum() {
		return cliNum;
	}
	public void setCliNum(Integer cliNum) {
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
	public BigDecimal getCuil() {
		return cuil;
	}
	public void setCuil(BigDecimal cuil) {
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
	public Set<FATCA> getFATCA() {
		return FATCA;
	}
	public void setFATCA(Set<FATCA> fATCA) {
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
	public Set<Direccion> getDireccion() {
		return Direccion;
	}
	public void setDireccion(Set<Direccion> direccion) {
		Direccion = direccion;
	}
	public Set<DatosFamiliares> getDatosFamiliares() {
		return DatosFamiliares;
	}
	public void setDatosFamiliares(Set<DatosFamiliares> datosFamiliares) {
		DatosFamiliares = datosFamiliares;
	}
	public Set<DatosLaborales> getDatosLaborales() {
		return DatosLaborales;
	}
	public void setDatosLaborales(Set<DatosLaborales> datosLaborales) {
		DatosLaborales = datosLaborales;
	}
	public Set<OCRDocumentData> getOCRDocumentData() {
		return OCRDocumentData;
	}
	public void setOCRDocumentData(Set<OCRDocumentData> oCRDocumentData) {
		OCRDocumentData = oCRDocumentData;
	}
}
