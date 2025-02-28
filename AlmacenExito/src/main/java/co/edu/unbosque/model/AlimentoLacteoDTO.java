/**
 * Paquete que contiene las clases del modelo.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un alimento lácteo en el sistema.
 * Hereda de la clase Producto e implementa Serializable.
 */
public class AlimentoLacteoDTO extends Producto implements Serializable {

    /** Identificador de versión para la serialización. */
    private static final long serialVersionUID = 1L;
    
    /** Marca del alimento lácteo. */
    private String marca;
    
    /** Tipo de alimento lácteo. */
    private String tipo;

    /**
     * Constructor por defecto.
     */
    public AlimentoLacteoDTO() {
        // Constructor vacío
    }

    /**
     * Constructor con parámetros específicos de la clase.
     * @param marca Marca del alimento lácteo.
     * @param tipo Tipo de alimento lácteo.
     */
    public AlimentoLacteoDTO(String marca, String tipo) {
        super();
        this.marca = marca;
        this.tipo = tipo;
    }

    /**
     * Constructor con parámetros completos.
     * @param id Identificador del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param imagen URL de la imagen del producto.
     * @param marca Marca del alimento lácteo.
     * @param tipo Tipo de alimento lácteo.
     */
    public AlimentoLacteoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen,
            String marca, String tipo) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
        this.marca = marca;
        this.tipo = tipo;
    }

    /**
     * Constructor sin atributos específicos de la clase.
     * @param id Identificador del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param imagen URL de la imagen del producto.
     */
    public AlimentoLacteoDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
    }

    /**
     * Obtiene la marca del alimento lácteo.
     * @return Marca del producto.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del alimento lácteo.
     * @param marca Nueva marca del producto.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el tipo de alimento lácteo.
     * @return Tipo del producto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de alimento lácteo.
     * @param tipo Nuevo tipo del producto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el identificador de versión para la serialización.
     * @return Valor del serialVersionUID.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Representación en cadena del objeto.
     * @return Cadena con los datos del alimento lácteo.
     */
    @Override
    public String toString() {
        return super.toString() + "AlimentoLacteoDTO [marca=" + marca + ", tipo=" + tipo + "]";
    }
}
