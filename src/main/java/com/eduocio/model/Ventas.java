package com.eduocio.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "NUMERO_VENTA", length = 20)
	private int numero_venta;

	@Column(name = "ORDEN", length = 2)
	private int orden;

	@Column(name = "CUPON_VENTA", length = 20)
	private String cupon_venta;

	@Column(name = "CUPON_REFERIDO", length = 20)
	private String cupon_referido;

	@Column(name = "CODIGO_ASESOR", length = 20)
	private String codigo_asesor;

	@Column(name = "FECHA_VENTA")
	private Date fecha_venta;

	@OneToOne()
	@JoinColumn(name = "curso_id", referencedColumnName = "id")
	private Producto producto;

	@OneToOne()
	@JoinColumn(name = "usuario_id", referencedColumnName = "id")
	private Usuario usuario;

	@Column(name = "PORCENTAJE_DESCUENTO", length = 2)
	private int porcentaje_descuento;

	@Column(name = "ESTADO", length = 20)
	private String estado;

	@Column(name = "CUPON_CREADOR", length = 20)
	private String cupon_creado;

	@OneToMany(mappedBy = "id_venta")
	private List<Facturacion_Operacion> facturacion_operacion;

	public Ventas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero_venta() {
		return numero_venta;
	}

	public void setNumero_venta(int numero_venta) {
		this.numero_venta = numero_venta;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getCupon_venta() {
		return cupon_venta;
	}

	public void setCupon_venta(String cupon_venta) {
		this.cupon_venta = cupon_venta;
	}

	public String getCupon_referido() {
		return cupon_referido;
	}

	public void setCupon_referido(String cupon_referido) {
		this.cupon_referido = cupon_referido;
	}

	public String getCodigo_asesor() {
		return codigo_asesor;
	}

	public void setCodigo_asesor(String codigo_asesor) {
		this.codigo_asesor = codigo_asesor;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getPorcentaje_descuento() {
		return porcentaje_descuento;
	}

	public void setPorcentaje_descuento(int porcentaje_descuento) {
		this.porcentaje_descuento = porcentaje_descuento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCupon_creado() {
		return cupon_creado;
	}

	public void setCupon_creado(String cupon_creado) {
		this.cupon_creado = cupon_creado;
	}

	public List<Facturacion_Operacion> getFacturacion_operacion() {
		return facturacion_operacion;
	}

	public void setFacturacion_operacion(List<Facturacion_Operacion> facturacion_operacion) {
		this.facturacion_operacion = facturacion_operacion;
	}

	
}
