package co.edu.unbosque.beans;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("JugueteBean")
@SessionScoped

public class JugueteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;

}
