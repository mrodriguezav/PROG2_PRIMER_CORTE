/**
 * Paquete que contiene las clases del modelo de datos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un objeto RopaDTO, heredando de Producto e implementando Serializable.
 */
public class RopaDTO extends Producto implements Serializable {

    /** Identificador de versión para la serialización. */
    private static final long serialVersionUID = 1L;
    
    /** Tamaño de la prenda. */
    private String size;
    
    /** Color de la prenda. */
    private String color;

    /**
     * Constructor por defecto.
     */
    public RopaDTO() {
        // Constructor vacío
    }

    /**
     * Constructor que inicializa los atributos size y color.
     * @param size Tamaño de la prenda.
     * @param color Color de la prenda.
     */
    public RopaDTO(String size, String color) {
        super();
        this.size = size;
        this.color = color;
    }

    /**
     * Constructor que inicializa todos los atributos incluyendo los heredados de Producto.
     * @param id Identificador del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param imagen URL de la imagen del producto.
     * @param size Tamaño de la prenda.
     * @param color Color de la prenda.
     */
    public RopaDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen, String size, String color) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
        this.size = size;
        this.color = color;
    }

    /**
     * Constructor que inicializa los atributos heredados de Producto sin especificar size y color.
     * @param id Identificador del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param imagen URL de la imagen del producto.
     */
    public RopaDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
    }

    /**
     * Obtiene el tamaño de la prenda.
     * @return Tamaño de la prenda.
     */
    public String getSize() {
        return size;
    }

    /**
     * Establece el tamaño de la prenda.
     * @param size Tamaño de la prenda.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Obtiene el color de la prenda.
     * @return Color de la prenda.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color de la prenda.
     * @param color Color de la prenda.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el identificador de versión para la serialización.
     * @return Identificador de versión.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Devuelve una representación en cadena de la instancia de RopaDTO.
     * @return Cadena con la información del objeto.
     */
    @Override
    public String toString() {
        return super.toString() + "RopaDTO [size=" + size + ", color=" + color + "]";
    }
}