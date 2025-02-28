/**
 * Paquete que contiene las clases de persistencia del modelo.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.RopaDTO;

/**
 * Clase que implementa las operaciones CRUD para la gestión de objetos RopaDTO.
 */
public class RopaDAO implements CRUDOperation<RopaDTO> {

    /** Lista de objetos RopaDTO almacenados. */
    private ArrayList<RopaDTO> listaRopa;
    
    /** Nombre del archivo serializado donde se almacena la información. */
    private final String SERIALIZED_NAME = "ropa.bat";

    /**
     * Constructor de la clase. Inicializa la lista de ropa y carga los datos serializados.
     */
    public RopaDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }

    /**
     * Agrega un nuevo objeto RopaDTO a la lista si no existe previamente.
     * @param newData El objeto RopaDTO a agregar.
     */
    @Override
    public void crear(RopaDTO newData) {
        if (find(newData) == null) {
            listaRopa.add(newData);
            writeSerialized();
        }
    }

    /**
     * Elimina un objeto RopaDTO de la lista si existe.
     * @param toDelete El objeto RopaDTO a eliminar.
     */
    @Override
    public void eliminar(RopaDTO toDelete) {
        RopaDTO found = find(toDelete);
        if (found != null) {
            listaRopa.remove(found);
            writeSerialized();
        }
    }

    /**
     * Actualiza un objeto RopaDTO en la lista si existe.
     * @param toUpdate El objeto RopaDTO a actualizar.
     * @param newData El nuevo objeto RopaDTO con los datos actualizados.
     */
    @Override
    public void actualizar(RopaDTO toUpdate, RopaDTO newData) {
        RopaDTO found = find(toUpdate);
        if (found != null) {
            listaRopa.remove(found);
            listaRopa.add(newData);
            writeSerialized();
        }
    }

    /**
     * Obtiene la lista completa de objetos RopaDTO.
     * @return Una lista de objetos RopaDTO.
     */
    @Override
    public ArrayList<RopaDTO> getAll() {
        return listaRopa;
    }

    /**
     * Busca un objeto RopaDTO en la lista.
     * @param toFind El objeto RopaDTO a buscar.
     * @return El objeto RopaDTO encontrado o null si no existe.
     */
    @Override
    public RopaDTO find(RopaDTO toFind) {
        if (!listaRopa.isEmpty()) {
            for (RopaDTO r : listaRopa) {
                if (r.getId() == toFind.getId()) {
                    return r;
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
            listaRopa = new ArrayList<>();
        } else {
            listaRopa = (ArrayList<RopaDTO>) content;
        }
    }

    /**
     * Guarda los datos de la lista en un archivo serializado.
     */
    @Override
    public void writeSerialized() {
        FileHandler.writeSerialized(SERIALIZED_NAME, listaRopa);
    }
}
