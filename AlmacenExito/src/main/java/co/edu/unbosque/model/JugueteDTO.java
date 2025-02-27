package co.edu.unbosque.model;

import java.io.Serializable;

public class JugueteDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipo; // Educativo, electrónico, de mesa, etc.
	private String marca;
	private int edadRecomendada; // Edad mínima recomendada
	private String material; // Plástico, madera, tela, etc.

	public JugueteDTO() {
		// TODO Auto-generated constructor stub
	}

	public JugueteDTO(String tipo, String marca, int edadRecomendada, String material) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	public JugueteDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen,
			String tipo, String marca, int edadRecomendada, String material) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.tipo = tipo;
		this.marca = marca;
		this.edadRecomendada = edadRecomendada;
		this.material = material;
	}

	public JugueteDTO(int id, double precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "JugueteDTO [tipo=" + tipo + ", marca=" + marca + ", edadRecomendada=" + edadRecomendada + ", material="
				+ material + "]";
	}

}
