/**
 * Clase que representa un alimento cárnico, heredando de la clase Producto.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

public class AlimentoCarnicoDTO extends Producto implements Serializable {

	/** Identificador de serialización. */
	private static final long serialVersionUID = 1L;

	/** Origen del animal del que proviene el alimento cárnico. */
	private String animalOrigen;

	/** Peso del alimento cárnico en gramos. */
	private int peso;

	/**
	 * Constructor por defecto.
	 */
	public AlimentoCarnicoDTO() {
		// Constructor vacío
	}

	/**
	 * Constructor con los atributos específicos de AlimentoCarnicoDTO.
	 * 
	 * @param animalOrigen Origen del animal del que proviene el alimento.
	 * @param peso         Peso del alimento en gramos.
	 */
	public AlimentoCarnicoDTO(String animalOrigen, int peso) {
		super();
		this.animalOrigen = animalOrigen;
		this.peso = peso;
	}

	/**
	 * Constructor con todos los atributos del producto y los específicos de
	 * AlimentoCarnicoDTO.
	 * 
	 * @param id           Identificador del producto.
	 * @param precio       Precio del producto.
	 * @param cantidad     Cantidad disponible del producto.
	 * @param nombre       Nombre del producto.
	 * @param descripcion  Descripción del producto.
	 * @param imagen       URL o referencia a la imagen del producto.
	 * @param animalOrigen Origen del animal del que proviene el alimento.
	 * @param peso         Peso del alimento en gramos.
	 */
	public AlimentoCarnicoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen,
			String animalOrigen, int peso) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
		this.animalOrigen = animalOrigen;
		this.peso = peso;
	}

	/**
	 * Constructor con los atributos del producto pero sin los específicos de
	 * AlimentoCarnicoDTO.
	 * 
	 * @param id          Identificador del producto.
	 * @param precio      Precio del producto.
	 * @param cantidad    Cantidad disponible del producto.
	 * @param nombre      Nombre del producto.
	 * @param descripcion Descripción del producto.
	 * @param imagen      URL o referencia a la imagen del producto.
	 */
	public AlimentoCarnicoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
		super(id, precio, cantidad, nombre, descripcion, imagen);
	}

	/**
	 * Obtiene el origen del animal del que proviene el alimento.
	 * 
	 * @return El origen del animal.
	 */
	public String getAnimalOrigen() {
		return animalOrigen;
	}

	/**
	 * Establece el origen del animal del que proviene el alimento.
	 * 
	 * @param animalOrigen El origen del animal.
	 */
	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}

	/**
	 * Obtiene el peso del alimento en gramos.
	 * 
	 * @return El peso del alimento.
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Establece el peso del alimento en gramos.
	 * 
	 * @param peso El peso del alimento.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene el identificador de serialización.
	 * 
	 * @return El identificador de serialización.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Representación en cadena de la clase AlimentoCarnicoDTO.
	 * 
	 * @return Una cadena con los atributos del objeto.
	 */
	@Override
	public String toString() {
		return super.toString() + "AlimentoCarnicoDTO [animalOrigen=" + animalOrigen + ", peso=" + peso + "]";
	}
}
