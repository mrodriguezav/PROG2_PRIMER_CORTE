/**
 * Clase que representa un juguete en el sistema.
 * Extiende de la clase Producto e implementa Serializable.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

public class JugueteDTO extends Producto implements Serializable {

    /**
     * Identificador de la versión para la serialización de la clase.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Tipo de cliente al que está dirigido el juguete.
     */
    private String tipoCliente;
    
    /**
     * Marca del juguete.
     */
    private String marca;

    /**
     * Constructor por defecto de la clase JugueteDTO.
     */
    public JugueteDTO() {
        // Constructor vacío
    }

    /**
     * Constructor que inicializa los atributos tipoCliente y marca.
     * @param tipoCliente Tipo de cliente al que está dirigido el juguete.
     * @param marca Marca del juguete.
     */
    public JugueteDTO(String tipoCliente, String marca) {
        super();
        this.tipoCliente = tipoCliente;
        this.marca = marca;
    }

    /**
     * Constructor que inicializa todos los atributos del juguete.
     * @param id Identificador del juguete.
     * @param precio Precio del juguete.
     * @param cantidad Cantidad disponible del juguete.
     * @param nombre Nombre del juguete.
     * @param descripcion Descripción del juguete.
     * @param imagen URL de la imagen del juguete.
     * @param tipoCliente Tipo de cliente al que está dirigido.
     * @param marca Marca del juguete.
     */
    public JugueteDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen,
                      String tipoCliente, String marca) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
        this.tipoCliente = tipoCliente;
        this.marca = marca;
    }

    /**
     * Constructor que inicializa los atributos heredados de Producto.
     * @param id Identificador del juguete.
     * @param precio Precio del juguete.
     * @param cantidad Cantidad disponible del juguete.
     * @param nombre Nombre del juguete.
     * @param descripcion Descripción del juguete.
     * @param imagen URL de la imagen del juguete.
     */
    public JugueteDTO(String id, int precio, int cantidad, String nombre, String descripcion, String imagen) {
        super(id, precio, cantidad, nombre, descripcion, imagen);
    }

    /**
     * Obtiene el tipo de cliente del juguete.
     * @return Tipo de cliente.
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Establece el tipo de cliente del juguete.
     * @param tipoCliente Tipo de cliente.
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * Obtiene la marca del juguete.
     * @return Marca del juguete.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del juguete.
     * @param marca Marca del juguete.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el identificador de versión de la serialización.
     * @return serialVersionUID de la clase.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Devuelve una representación en cadena del objeto JugueteDTO.
     * @return Una cadena con los atributos del juguete.
     */
    @Override
    public String toString() {
        return super.toString() + "JugueteDTO [tipoCliente=" + tipoCliente + ", marca=" + marca + "]";
    }
}
