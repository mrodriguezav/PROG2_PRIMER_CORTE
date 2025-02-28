/**
 * Paquete que contiene las clases de persistencia del modelo.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.JugueteDTO;

/**
 * Clase que implementa las operaciones CRUD para la gestión de objetos JugueteDTO.
 */
public class JugueteDAO implements CRUDOperation<JugueteDTO> {

    /** Lista de objetos JugueteDTO almacenados. */
    private ArrayList<JugueteDTO> listaJuguetes;
    
    /** Nombre del archivo serializado donde se almacena la información. */
    private final String SERIALIZED_NAME = "juguetes.bat";

	public JugueteDAO() {
		FileHandler.checkFolder();
		readSerialized();
	}
	
	@Override
	public void crear(JugueteDTO newData) {
		if (find(newData) == null) {
			listaJuguetes.add(newData);
			writeSerialized();
		}
	}
    /**
     * Constructor de la clase. Inicializa la lista de juguetes y carga los datos serializados.
     */
    public JugueteDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }

    /**
     * Agrega un nuevo objeto JugueteDTO a la lista si no existe previamente.
     * @param newData El objeto JugueteDTO a agregar.
     */
    @Override
    public void crear(JugueteDTO newData) {
        if (find(newData) == null) {
            listaJuguetes.add(newData);
            writeSerialized();
        }
    }

    /**
     * Elimina un objeto JugueteDTO de la lista si existe.
     * @param toDelete El objeto JugueteDTO a eliminar.
     */
    @Override
    public void eliminar(JugueteDTO toDelete) {
        JugueteDTO found = find(toDelete);
        if (found != null) {
            listaJuguetes.remove(found);
            writeSerialized();
        }
    }

    /**
     * Actualiza un objeto JugueteDTO en la lista si existe.
     * @param toUpdate El objeto JugueteDTO a actualizar.
     * @param newData El nuevo objeto JugueteDTO con los datos actualizados.
     */
    @Override
    public void actualizar(JugueteDTO toUpdate, JugueteDTO newData) {
        JugueteDTO found = find(toUpdate);
        if (found != null) {
            listaJuguetes.remove(found);
            listaJuguetes.add(newData);
            writeSerialized();
        }
    }

    /**
     * Obtiene la lista completa de objetos JugueteDTO.
     * @return Una lista de objetos JugueteDTO.
     */
    @Override
    public ArrayList<JugueteDTO> getAll() {
        return listaJuguetes;
    }

    /**
     * Busca un objeto JugueteDTO en la lista.
     * @param toFind El objeto JugueteDTO a buscar.
     * @return El objeto JugueteDTO encontrado o null si no existe.
     */
    @Override
    public JugueteDTO find(JugueteDTO toFind) {
        if (!listaJuguetes.isEmpty()) {
            for (JugueteDTO j : listaJuguetes) {
                if (j.getId() == toFind.getId()) {
                    return j;
                }
            }
        }
        return null;
    }

    /**
     * Carga los datos serializados desde un archivo.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void readSerialized() {
        Object content = FileHandler.readSerialized(SERIALIZED_NAME);
        if (content == null) {
            listaJuguetes = new ArrayList<>();
        } else {
            listaJuguetes = (ArrayList<JugueteDTO>) content;
        }
    }

    /**
     * Guarda los datos de la lista en un archivo serializado.
     */
    @Override
    public void writeSerialized() {
        FileHandler.writeSerialized(SERIALIZED_NAME, listaJuguetes);
    }
}
