package co.edu.unbosque.model;

import java.io.Serializable;

public class RopaDTO  implements Serializable{

	private String tipo;    
	private String talla;    
	private String color;  
	private String marca;
	private double precio;
	private String material; 

	
	public RopaDTO() {
		// TODO Auto-generated constructor stub
	}


	public RopaDTO(String tipo, String talla, String color, String marca, double precio, String material) {
		super();
		this.tipo = tipo;
		this.talla = talla;
		this.color = color;
		this.marca = marca;
		this.precio = precio;
		this.material = material;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
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


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "RopaDTO [tipo=" + tipo + ", talla=" + talla + ", color=" + color + ", marca=" + marca + ", precio="
				+ precio + ", material=" + material + "]";
	}
	
	
	
}
