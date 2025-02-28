package co.edu.unbosque.model;

import java.io.Serializable;

public class JugueteDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipoCliente;
	private String marca;

	public JugueteDTO() {
		// TODO Auto-generated constructor stub
	}

	public JugueteDTO(String tipoCliente, String marca) {
		super();
		this.tipoCliente = tipoCliente;
		this.marca = marca;
	}

	public JugueteDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen,
			String tipoCliente, String marca) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.tipoCliente = tipoCliente;
		this.marca = marca;
	}

	public JugueteDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString()+"JugueteDTO [tipoCliente=" + tipoCliente + ", marca=" + marca + "]";
	}

}
