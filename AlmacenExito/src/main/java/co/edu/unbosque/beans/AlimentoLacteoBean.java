/**
 * Bean administrado para la gestión de objetos AlimentoLacteoDTO en una aplicación JSF.
 * Proporciona métodos para crear, actualizar y eliminar productos.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import co.edu.unbosque.model.AlimentoLacteoDTO;
import co.edu.unbosque.model.persistence.AlimentoLacteoDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named("AlimentoLacteoBean")
@SessionScoped
public class AlimentoLacteoBean implements Serializable {

    /** Identificador de versión para la serialización. */
    private static final long serialVersionUID = 1L;
    
    /** Atributos del producto */
    private String id;
    private int precio;
    private int cantidad;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String marca;
    private String tipo;
    private boolean button = true;
    
    /** Lista de productos almacenados. */
    private ArrayList<AlimentoLacteoDTO> list = new ArrayList<>();
    
    /** Objeto de acceso a datos para AlimentoLacteoDTO. */
    private AlimentoLacteoDAO aDao;
    
    /** Producto seleccionado para edición o eliminación. */
    private AlimentoLacteoDTO selected;

    /**
     * Constructor que inicializa el DAO y carga la lista de productos.
     */
    public AlimentoLacteoBean() {
        aDao = new AlimentoLacteoDAO();
        selected = new AlimentoLacteoDTO();
        list = aDao.getAll();
    }

    /**
     * Guarda un nuevo producto en la lista y muestra un mensaje de éxito.
     */
    public void save() {
        String id = UUID.randomUUID().toString();
        aDao.crear(new AlimentoLacteoDTO(id, precio, cantidad, nombre, descripcion, imagen, marca, tipo));
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto Agregado exitosamente"));
        cleanFields();
    }

    /**
     * Elimina un producto de la lista si existe.
     * @param selected Producto a eliminar.
     */
    public void delete(AlimentoLacteoDTO selected) {
        Iterator<AlimentoLacteoDTO> iterator = list.iterator();
        while (iterator.hasNext()) {
            AlimentoLacteoDTO u = iterator.next();
            if (u.equals(selected)) {
                iterator.remove();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto eliminado correctamente"));
                break;
            }
        }
    }

    /**
     * Actualiza la información de un producto seleccionado.
     */
    public void update() {
        if (selected != null) {
            for (AlimentoLacteoDTO u : list) {
                if (u.equals(selected)) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto actualizado correctamente"));
                    break;
                }
            }
        }
    }

    /**
     * Limpia los campos del formulario.
     */
    public void cleanFields() {
        this.id = "";
        this.precio = 0;
        this.cantidad = 0;
        this.nombre = "";
        this.descripcion = "";
        this.imagen = "";
        this.marca = "";
        this.tipo = "";
    }

    /**
     * Verifica el estado del botón.
     * @return Estado del botón.
     */
    public boolean checkButton() {
        return button;
    }

    /**
     * Acción para deshabilitar el botón.
     */
    public void action() {
        button = false;
    }

    // Getters y Setters

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public ArrayList<AlimentoLacteoDTO> getList() {
        return list;
    }

    public void setList(ArrayList<AlimentoLacteoDTO> list) {
        this.list = list;
    }

    public AlimentoLacteoDAO getaDao() {
        return aDao;
    }

    public void setaDao(AlimentoLacteoDAO aDao) {
        this.aDao = aDao;
    }

    public AlimentoLacteoDTO getSelected() {
        return selected;
    }

    public void setSelected(AlimentoLacteoDTO selected) {
        this.selected = selected;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
