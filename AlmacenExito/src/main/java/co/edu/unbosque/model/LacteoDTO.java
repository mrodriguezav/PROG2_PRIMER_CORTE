package co.edu.unbosque.model;

import java.io.Serializable;

public class LacteoDTO  implements Serializable{

	private String nombre;         // Leche, queso, yogur, mantequilla, etc.
	private String marca;
	private double precio;
	private double peso;           // Peso o volumen (litros, gramos, etc.)
	private String fechaExpiracion;

	 public LacteoDTO() {
		// TODO Auto-generated constructor stub
	}

	public LacteoDTO(String nombre, String marca, double precio, double peso, String fechaExpiracion) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.peso = peso;
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	 
	 
	
}
