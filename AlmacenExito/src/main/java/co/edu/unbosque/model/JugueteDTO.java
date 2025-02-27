package co.edu.unbosque.model;

import java.io.Serializable;

public class JugueteDTO  implements Serializable{

	private String nombre;       // Nombre del juguete
	private String tipo;         // Educativo, electrónico, de mesa, etc.
	private String marca;       
	private double precio;       
	private int edadRecomendada; // Edad mínima recomendada
	private String material;     // Plástico, madera, tela, etc.

	
	public JugueteDTO() {
		// TODO Auto-generated constructor stub
	}


	public JugueteDTO(String nombre, String tipo, String marca, double precio, int edadRecomendada, String material) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
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


	public int getEdadRecomendada() {
		return edadRecomendada;
	}


	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
