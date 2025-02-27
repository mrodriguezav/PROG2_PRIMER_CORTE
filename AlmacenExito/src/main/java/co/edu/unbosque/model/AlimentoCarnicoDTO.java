package co.edu.unbosque.model;

import java.io.Serializable;

public class AlimentoCarnicoDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String animalOrigen;
	private double peso;
	private boolean esProcesada;
	private String fechaExpiracion;

	public AlimentoCarnicoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AlimentoCarnicoDTO(String animalOrigen, double peso, boolean esProcesada, String fechaExpiracion) {
		super();
		this.animalOrigen = animalOrigen;
		this.peso = peso;
		this.esProcesada = esProcesada;
		this.fechaExpiracion = fechaExpiracion;
	}

	public AlimentoCarnicoDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen,
			String animalOrigen, double peso, boolean esProcesada, String fechaExpiracion) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.animalOrigen = animalOrigen;
		this.peso = peso;
		this.esProcesada = esProcesada;
		this.fechaExpiracion = fechaExpiracion;
	}

	public AlimentoCarnicoDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getAnimalOrigen() {
		return animalOrigen;
	}

	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isEsProcesada() {
		return esProcesada;
	}

	public void setEsProcesada(boolean esProcesada) {
		this.esProcesada = esProcesada;
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
		return "AlimentoCarnicoDTO [animalOrigen=" + animalOrigen + ", peso=" + peso + ", esProcesada=" + esProcesada
				+ ", fechaExpiracion=" + fechaExpiracion + "]";
	}

}
