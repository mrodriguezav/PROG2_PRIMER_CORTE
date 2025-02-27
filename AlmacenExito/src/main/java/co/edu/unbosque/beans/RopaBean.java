/**
 * Bean administrado para la gestión de objetos AlimentoLacteoDTO en una aplicación JSF.
 * Proporciona métodos para crear, actualizar y eliminar productos..
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import co.edu.unbosque.model.RopaDTO;
import co.edu.unbosque.model.persistence.RopaDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * Clase RopaBean que maneja la lógica de negocio para la gestión de ropa en la
 * aplicación.
 */
@Named("RopaBean")
@SessionScoped
public class RopaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos de la clase
	private String id;
	private int precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String size;
	private String color;
	private boolean button = true;
	private ArrayList<RopaDTO> list;
	private RopaDAO rDAO;
	private RopaDTO selected;

	/**
	 * Constructor de la clase. Inicializa el DAO y carga la lista de ropa.
	 */
	public RopaBean() {
		rDAO = new RopaDAO();
		selected = new RopaDTO();
		list = rDAO.getAll();
	}

	/**
	 * Guarda un nuevo producto de ropa en la base de datos.
	 */
	public void save() {
		String id = UUID.randomUUID().toString();
		rDAO.crear(new RopaDTO(id, precio, cantidad, nombre, descripcion, imagen, size, color));
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto Agregado exitosamente"));
		cleanFields();
	}

	/**
	 * Elimina un producto de la lista de ropa.
	 * 
	 * @param selected Producto seleccionado a eliminar.
	 */
	public void delete(RopaDTO selected) {
		Iterator<RopaDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			RopaDTO u = iterator.next();
			if (u.equals(selected)) {
				iterator.remove();
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage("Producto eliminado correctamente"));
				break;
			}
		}
	}

	/**
	 * Actualiza la información de un producto seleccionado.
	 */
	public void update() {
		if (selected != null) {
			for (RopaDTO u : list) {
				if (u.equals(selected)) {
					u.getId();
					u.getPrecio();
					u.getCantidad();
					u.getNombre();
					u.getDescripcion();
					u.getImagen();
					u.getSize();
					u.getColor();
					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage("Producto actualizado correctamente"));
					break;
				}
			}
		}
	}

	/**
	 * Limpia los campos del formulario después de una acción.
	 */
	public void cleanFields() {
		this.id = "";
		this.precio = 0;
		this.cantidad = 0;
		this.nombre = "";
		this.descripcion = "";
		this.imagen = "";
		this.size = "";
		this.color = "";
	}

	/**
	 * Verifica el estado del botón.
	 * 
	 * @return Estado actual del botón.
	 */
	public boolean checkButton() {
		return button;
	}

	/**
	 * Acción para cambiar el estado del botón.
	 */
	public void action() {
		button = false;
	}

	// Métodos Getters y Setters
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public RopaDAO getrDAO() {
		return rDAO;
	}

	public void setrDAO(RopaDAO rDAO) {
		this.rDAO = rDAO;
	}

	public ArrayList<RopaDTO> getList() {
		return list;
	}

	public void setList(ArrayList<RopaDTO> list) {
		this.list = list;
	}

	public RopaDTO getSelected() {
		return selected;
	}

	public void setSelected(RopaDTO selected) {
		this.selected = selected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
