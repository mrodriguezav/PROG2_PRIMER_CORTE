package co.edu.unbosque.model;

import java.io.Serializable;

public class AlimentoLacteoDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String marca;
	private boolean esLactoso;
	private String tipo;
	private String fechaExpiracion;

	public AlimentoLacteoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AlimentoLacteoDTO(String marca, boolean esLactoso, String tipo, String fechaExpiracion) {
		super();
		this.marca = marca;
		this.esLactoso = esLactoso;
		this.tipo = tipo;
		this.fechaExpiracion = fechaExpiracion;
	}

	public AlimentoLacteoDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen,
			String marca, boolean esLactoso, String tipo, String fechaExpiracion) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.marca = marca;
		this.esLactoso = esLactoso;
		this.tipo = tipo;
		this.fechaExpiracion = fechaExpiracion;
	}

	public AlimentoLacteoDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEsLactoso() {
		return esLactoso;
	}

	public void setEsLactoso(boolean esLactoso) {
		this.esLactoso = esLactoso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AlimentoLacteoDTO [marca=" + marca + ", esLactoso=" + esLactoso + ", tipo=" + tipo
				+ ", fechaExpiracion=" + fechaExpiracion + "]";
	}

}
