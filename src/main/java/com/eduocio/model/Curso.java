package com.eduocio.model;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 11)
	private int id;

	@Column(name = "TITULO", length = 20)
	private String titulo;

	@Column(name = "DESCRIPCION", length = 1000)
	private String descripcion;

	@Column(name = "DURACION_TOTAL", length = 1000)
	private String DURACION_TOTAL;

	@Column(name = "TOTAL_VIDEOS", length = 11)
	private int total_videos;

	@Column(name = "VALOR_TOTAL", length = 11)
	private int valor_total;

	@Column(name = "RUTA_PRINCIPAL", length = 300)
	private String ruta_principal;

	@Column(name = "MINIATURA", length = 300)
	private String miniatura;

	@Column(name = "FECHA_CREACION")
	private Timestamp FECHA_CREACION;

	@Column(name = "ESTADO")
	private String estado;

	@OneToMany(mappedBy = "id")
	private List<Producto> producto;

	@OneToOne()
	@JoinColumn(name = "usuario_id", referencedColumnName = "id")
	private Usuario usuario;

	public Curso() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDURACION_TOTAL() {
		return DURACION_TOTAL;
	}

	public void setDURACION_TOTAL(String dURACION_TOTAL) {
		DURACION_TOTAL = dURACION_TOTAL;
	}

	public int getTotal_videos() {
		return total_videos;
	}

	public void setTotal_videos(int total_videos) {
		this.total_videos = total_videos;
	}

	public int getValor_total() {
		return valor_total;
	}

	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}

	public String getRuta_principal() {
		return ruta_principal;
	}

	public void setRuta_principal(String ruta_principal) {
		this.ruta_principal = ruta_principal;
	}

	public String getMiniatura() {
		return miniatura;
	}

	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}

	public Timestamp getFECHA_CREACION() {
		return FECHA_CREACION;
	}

	public void setFECHA_CREACION(Timestamp fECHA_CREACION) {
		FECHA_CREACION = fECHA_CREACION;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
