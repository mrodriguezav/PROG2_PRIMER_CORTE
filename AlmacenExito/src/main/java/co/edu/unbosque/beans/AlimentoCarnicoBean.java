package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import co.edu.unbosque.model.AlimentoCarnicoDTO;
import co.edu.unbosque.model.persistence.AlimentoCarnicoDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("AlimentoCarnicoBean")
@SessionScoped

public class AlimentoCarnicoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double precio;
	private int cantidad;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String animalOrigen;
	private double peso;
	private boolean esProcesada;
	private String fechaExpiracion;
	private ArrayList<AlimentoCarnicoDTO> list;
	private AlimentoCarnicoDAO aDAO;

	public AlimentoCarnicoBean() {
		aDAO = new AlimentoCarnicoDAO();
		list = aDAO.getAll();
	}

	public void save() {
		Random random = new Random();
		int aleatorio = 1000000 + random.nextInt(9000000);
		String id = String.valueOf(aleatorio);

	}

	public void delete() {

	}

	public void update() {

	}

}
