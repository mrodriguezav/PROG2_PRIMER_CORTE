package co.edu.unbosque.model;

import java.io.Serializable;

public class CarneDTO  implements Serializable{

	private String tipo;        // Res, cerdo, pollo, cordero, etc.
	private double peso;        // Peso en kg o gramos
	private double precio;      // Precio por kg o unidad
	private String origen;      // País o granja de procedencia
	private String categoria;   // Primera, segunda, tercera
	private String fechaExpiracion; // Fecha de vencimiento

	
	public CarneDTO() {
		// TODO Auto-generated constructor stub
	}


	public CarneDTO(String tipo, double peso, double precio, String origen, String categoria, String fechaExpiracion) {
		super();
		this.tipo = tipo;
		this.peso = peso;
		this.precio = precio;
		this.origen = origen;
		this.categoria = categoria;
		this.fechaExpiracion = fechaExpiracion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getFechaExpiracion() {
		return fechaExpiracion;
	}


	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	
	
}
