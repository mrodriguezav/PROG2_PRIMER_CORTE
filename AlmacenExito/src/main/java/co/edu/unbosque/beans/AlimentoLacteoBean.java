package co.edu.unbosque.beans;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("AlimentoLacteoBean")
@SessionScoped

public class AlimentoLacteoBean implements Serializable {

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
	private String marca;
	private boolean esLactoso;
	private String tipo;
	private String fechaExpiracion;
}
