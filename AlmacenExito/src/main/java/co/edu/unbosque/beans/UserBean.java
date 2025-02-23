package co.edu.unbosque.beans;

import java.time.LocalDate;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.model.persistence.UsuarioDAO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.bean.ViewScoped;
import jakarta.inject.Named;

@Named("UserBean")
@RequestScoped
public class UserBean { // Este es el bean de la logica de la pagina de usuarios
//Se Recomienda crear un atributo para cada input del front
	private String nombre;
	private String contrasenia;
	private UsuarioDAO uDAO;
	private LocalDate date;

	public UserBean() {
		uDAO = new UsuarioDAO();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public UsuarioDAO getuDAO() {
		return uDAO;
	}

	public void setuDAO(UsuarioDAO uDAO) {
		this.uDAO = uDAO;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void guardar() {
		System.out.println(nombre);
		System.out.println(contrasenia);
		uDAO.crear(new UsuarioDTO(nombre, contrasenia));
		
	}
	
	public void eliminar() {
		this.nombre = "";
		this.contrasenia= "";
	}
	

}
