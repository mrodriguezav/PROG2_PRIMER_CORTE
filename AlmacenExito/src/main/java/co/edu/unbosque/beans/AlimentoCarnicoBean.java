/**
 * Bean administrado para la gestión de objetos AlimentoLacteoDTO en una aplicación JSF.
 * Proporciona métodos para crear, actualizar y eliminar productos.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import co.edu.unbosque.model.AlimentoCarnicoDTO;
import co.edu.unbosque.model.persistence.AlimentoCarnicoDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * Bean de gestion para AlimentoCarnicoDTO. Maneja operaciones CRUD y gestion de
 * la lista de alimentos carnicos.
 */
@Named("AlimentoCarnicoBean")
@SessionScoped
public class AlimentoCarnicoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos del alimento cárnico
	private String id;
	private int precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String animalOrigen;
	private int peso;
	private boolean button = true;
	private ArrayList<AlimentoCarnicoDTO> list;
	private AlimentoCarnicoDAO aDAO;
	private AlimentoCarnicoDTO selected;

	/**
	 * Constructor que inicializa el DAO y obtiene la lista de productos.
	 */
	public AlimentoCarnicoBean() {
		aDAO = new AlimentoCarnicoDAO();
		selected = new AlimentoCarnicoDTO();
		list = aDAO.getAll();
	}

	/**
	 * Agrega un nuevo producto a la lista.
	 */
	public void save() {
		String id = UUID.randomUUID().toString();
		aDAO.crear(new AlimentoCarnicoDTO(id, precio, cantidad, nombre, descripcion, imagen, animalOrigen, peso));
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto Agregado exitosamente"));
	}

	/**
	 * Elimina un producto seleccionado de la lista.
	 * 
	 * @param selected Producto a eliminar.
	 */
	public void delete(AlimentoCarnicoDTO selected) {
		Iterator<AlimentoCarnicoDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			AlimentoCarnicoDTO u = iterator.next();
			if (u.equals(selected)) {
				iterator.remove();
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage("Producto eliminado correctamente"));
				break;
			}
		}
	}

	/**
	 * Actualiza la informacion del producto seleccionado.
	 */
	public void update() {
		if (selected != null) {
			for (AlimentoCarnicoDTO u : list) {
				if (u.equals(selected)) {
					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage("Producto actualizado correctamente"));
					break;
				}
			}
		}
	}

	/**
	 * Limpia los campos de entrada.
	 */
	public void cleanFields() {
		this.id = "";
		this.precio = 0;
		this.cantidad = 0;
		this.nombre = "";
		this.descripcion = "";
		this.imagen = "";
		this.animalOrigen = "";
		this.peso = 0;
	}

	/**
	 * Verifica el estado del boton.
	 * 
	 * @return true si el boton esta activo, false en caso contrario.
	 */
	public boolean checkButton() {
		return button;
	}

	/**
	 * Cambia el estado del boton.
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

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public ArrayList<AlimentoCarnicoDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AlimentoCarnicoDTO> list) {
		this.list = list;
	}

	public AlimentoCarnicoDAO getaDAO() {
		return aDAO;
	}

	public void setaDAO(AlimentoCarnicoDAO aDAO) {
		this.aDAO = aDAO;
	}

	public AlimentoCarnicoDTO getSelected() {
		return selected;
	}

	public void setSelected(AlimentoCarnicoDTO selected) {
		this.selected = selected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
