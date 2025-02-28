package co.edu.unbosque.model;

import java.io.Serializable;

public class RopaDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String size;
	private String color;

	public RopaDTO() {
		// TODO Auto-generated constructor stub
	}

	public RopaDTO(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}

	public RopaDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen, String size,
			String color) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.size = size;
		this.color = color;
	}

	public RopaDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "RopaDTO [size=" + size + ", color=" + color + "]";
	}

}
