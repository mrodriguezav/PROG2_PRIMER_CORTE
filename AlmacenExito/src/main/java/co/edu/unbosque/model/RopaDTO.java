package co.edu.unbosque.model;

import java.io.Serializable;

public class RopaDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String size;
	private String color;
	private String brand;
	private String material;

	public RopaDTO() {
		// TODO Auto-generated constructor stub
	}

	public RopaDTO(String size, String color, String brand, String material) {
		super();
		this.size = size;
		this.color = color;
		this.brand = brand;
		this.material = material;
	}

	public RopaDTO(String id, double precio, int cantidad, String nombre, String descripcion, String imagen,
			String size, String color, String brand, String material) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.size = size;
		this.color = color;
		this.brand = brand;
		this.material = material;
	}

	public RopaDTO(String id, double precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTalla= " + size + "\nColor= " + color + "\nMarca= " + brand + "\nMaterial= "
				+ material;
	}

}
