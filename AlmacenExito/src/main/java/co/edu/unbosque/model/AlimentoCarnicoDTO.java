package co.edu.unbosque.model;

import java.io.Serializable;

public class AlimentoCarnicoDTO extends Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String animalOrigen;
	private int peso;

	public AlimentoCarnicoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AlimentoCarnicoDTO(String animalOrigen, int peso) {
		super();
		this.animalOrigen = animalOrigen;
		this.peso = peso;
	}

	public AlimentoCarnicoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen,
			String animalOrigen, int peso) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.animalOrigen = animalOrigen;
		this.peso = peso;
	}

	public AlimentoCarnicoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getAnimalOrigen() {
		return animalOrigen;
	}

	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AlimentoCarnicoDTO [animalOrigen=" + animalOrigen + ", peso=" + peso + "]";
	}

}
