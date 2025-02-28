package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import co.edu.unbosque.model.AlimentoCarnicoDTO;
import co.edu.unbosque.model.JugueteDTO;
import co.edu.unbosque.model.persistence.AlimentoCarnicoDAO;
import co.edu.unbosque.model.persistence.JugueteDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named("JugueteBean")
@SessionScoped

public class JugueteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private int precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String tipo;
	private String marca;
	private boolean button = true;
	private ArrayList<JugueteDTO> listj;
	private JugueteDAO jDAO;
	private JugueteDTO selected;
	
	public JugueteBean() {
		jDAO = new JugueteDAO();
		selected = new JugueteDTO();
		listj = jDAO.getAll();
	}
	
	public void save() {
		String id = UUID.randomUUID().toString();

		jDAO.crear(new JugueteDTO(id, precio, cantidad, nombre, descripcion, imagen, tipo, marca));

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Producto agregado exitosamente."));
		cleanFields();
	}

	public void delete(JugueteDTO selected) {
		Iterator<JugueteDTO> iterator = listj.iterator();
		while (iterator.hasNext()) {
			JugueteDTO u = iterator.next();
			if (u.equals(selected)) {
				iterator.remove();

				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage("Producto eliminado  correctamente"));
				break;
			}
		}
	}

	public void update() {
		if (selected != null) {
			for (JugueteDTO u : listj) {
				if (u.equals(selected)) {
					u.getId();
					u.getPrecio();
					u.getCantidad();
					u.getNombre();
					u.getDescripcion();
					u.getImagen();
					u.getTipoCliente();
					u.getMarca();

					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage("Producto actualizado correctamente"));
					break;
				}
			}
		}

	}

	public void cleanFields() {
		this.id = "";
		this.precio = 0;
		this.cantidad = 0;
		this.nombre = "";
		this.descripcion = "";
		this.imagen = "";
		this.tipo = "";
		this.marca = "";
	}
	
	public boolean checkButton() {
		return button;
	}
	
	public void action() {
		button = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrecio() {
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

	
	
	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
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


	public ArrayList<JugueteDTO> getListj() {
		return listj;
	}

	public void setListj(ArrayList<JugueteDTO> listj) {
		this.listj = listj;
	}

	public JugueteDAO getjDAO() {
		return jDAO;
	}

	public void setjDAO(JugueteDAO jDAO) {
		this.jDAO = jDAO;
	}

	public JugueteDTO getSelected() {
		return selected;
	}

	public void setSelected(JugueteDTO selected) {
		this.selected = selected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	



}
