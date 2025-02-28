/**
 * Paquete que contiene las clases de persistencia del modelo de datos.
 * Se encarga de la gestión de CRUD y la serialización de objetos en la aplicación.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AlimentoLacteoDTO;

/**
 * Clase que implementa la interfaz CRUDOperation para gestionar 
 * los objetos de tipo AlimentoLacteoDTO en una lista.
 * También maneja la serialización de datos para persistencia.
 */
public class AlimentoLacteoDAO implements CRUDOperation<AlimentoLacteoDTO> {
    
    /**
     * Lista que almacena los objetos de tipo AlimentoLacteoDTO.
     */
    private ArrayList<AlimentoLacteoDTO> listaAlimentosLacteos;
    
    /**
     * Nombre del archivo donde se almacenan los datos serializados.
     */
    private final String SERIALIZED_NAME = "alimentosLacteos.bat";

    /**
     * Constructor de la clase. 
     * Verifica la existencia de la carpeta de almacenamiento y carga los datos serializados.
     */
    public AlimentoLacteoDAO() {
        FileHandler.checkFolder();
        readSerialized();
    }

    /**
     * Agrega un nuevo alimento lácteo a la lista si no existe previamente.
     *
     * @param newData Objeto de tipo AlimentoLacteoDTO a agregar.
     */
    @Override
    public void crear(AlimentoLacteoDTO newData) {
        if (find(newData) == null) {
            listaAlimentosLacteos.add(newData);
            writeSerialized();
        }
    }

    /**
     * Elimina un alimento lácteo de la lista si existe.
     *
     * @param toDelete Objeto de tipo AlimentoLacteoDTO a eliminar.
     */
    @Override
    public void eliminar(AlimentoLacteoDTO toDelete) {
        AlimentoLacteoDTO found = find(toDelete);
        if (found != null) {
            listaAlimentosLacteos.remove(toDelete);
            writeSerialized();
        }
    }

    /**
     * Actualiza un alimento lácteo en la lista si existe.
     *
     * @param toUpdate Objeto de tipo AlimentoLacteoDTO a actualizar.
     * @param newData  Nuevos datos para reemplazar el objeto anterior.
     */
    @Override
    public void actualizar(AlimentoLacteoDTO toUpdate, AlimentoLacteoDTO newData) {
        AlimentoLacteoDTO found = find(toUpdate);
        if (found != null) {
            listaAlimentosLacteos.remove(toUpdate);
            listaAlimentosLacteos.add(newData);
            writeSerialized();
        }
    }

    /**
     * Retorna la lista completa de alimentos lácteos almacenados.
     *
     * @return Lista de objetos AlimentoLacteoDTO.
     */
    @Override
    public ArrayList<AlimentoLacteoDTO> getAll() {
        return listaAlimentosLacteos;
    }

    /**
     * Busca un alimento lácteo en la lista comparando su ID.
     *
     * @param toFind Objeto AlimentoLacteoDTO a buscar.
     * @return El objeto encontrado o null si no existe.
     */
    @Override
    public AlimentoLacteoDTO find(AlimentoLacteoDTO toFind) {
        for (AlimentoLacteoDTO aL : listaAlimentosLacteos) {
            if (aL.getId() == toFind.getId()) {
                return aL;
            }
        }
        return null;
    }

    /**
     * Carga los datos desde un archivo serializado.
     * Si el archivo no existe, inicializa una lista vacía.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void readSerialized() {
        Object content = FileHandler.readSerialized(SERIALIZED_NAME);
        if (content == null) {
            listaAlimentosLacteos = new ArrayList<>();
        } else {
            listaAlimentosLacteos = (ArrayList<AlimentoLacteoDTO>) content;
        }
    }

    /**
     * Guarda los datos en un archivo serializado para persistencia.
     */
    @Override
    public void writeSerialized() {
        FileHandler.writeSerialized(SERIALIZED_NAME, listaAlimentosLacteos);
    }
}
