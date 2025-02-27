package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.List;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int id, double precio, int cantidad, String nombre, String descripcion, String imagen) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "\nID= " + id + "\nPrecio= " + precio + "\nCantidad= " + cantidad + "\nNombre= " + nombre
				+ "\nDescripcion= " + descripcion + "\nImagen= " + imagen;
	}

}
