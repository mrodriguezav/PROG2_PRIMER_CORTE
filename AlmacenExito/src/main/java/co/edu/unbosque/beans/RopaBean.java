package co.edu.unbosque.beans;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("RopaBean")
@SessionScoped

public class RopaBean implements Serializable {

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
	private String size;
	private String color;
	private String brand;
	private String material;
}
