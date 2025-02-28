/**
 * Clase que representa un producto en el sistema.
 * Implementa la interfaz Serializable para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

public class Producto implements Serializable {

    /** Identificador de versión para la serialización. */
    private static final long serialVersionUID = 1L;
    
    /** Identificador único del producto. */
    private String id;
    
    /** Precio del producto. */
    private int precio;
    
    /** Cantidad disponible del producto. */
    private int cantidad;
    
    /** Nombre del producto. */
    private String nombre;
    
    /** Descripción del producto. */
    private String descripcion;
    
    /** URL o nombre del archivo de imagen del producto. */
    private String imagen;

    /**
     * Constructor por defecto.
     */
    public Producto() {
        // Constructor vacío
    }

    /**
     * Constructor que inicializa los atributos del producto.
     * @param id Identificador único del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param imagen URL o nombre del archivo de imagen del producto.
     */
    public Producto(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
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

    /**
     * Representación en cadena de un producto.
     * @return Una cadena con la información del producto.
     */
    @Override
    public String toString() {
        return "\nID= " + id + "\nPrecio= " + precio + "\nCantidad= " + cantidad + "\nNombre= " + nombre
                + "\nDescripcion= " + descripcion + "\nImagen= " + imagen;
    }
}
