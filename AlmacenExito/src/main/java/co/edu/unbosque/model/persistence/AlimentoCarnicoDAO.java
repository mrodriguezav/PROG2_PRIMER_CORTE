/**
 * Paquete que contiene las clases de persistencia del modelo de datos.
 * Se encarga de la gestión de CRUD y la serialización de objetos en la aplicación.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AlimentoCarnicoDTO;

/**
 * Clase que implementa la interfaz CRUDOperation para gestionar 
 * los objetos de tipo AlimentoCarnicoDTO en una lista.
 * También maneja la serialización de datos para persistencia.
 */
public class AlimentoCarnicoDAO implements CRUDOperation<AlimentoCarnicoDTO> {

    /**
     * Lista que almacena los objetos de tipo AlimentoCarnicoDTO.
     */
    private ArrayList<AlimentoCarnicoDTO> listaAlimentosCarnicos;

    /**
     * Nombre del archivo donde se almacenan los datos serializados.
     */
    private final String SERIALIZED_NAME = "alimentosCarnicos.bat";

    /**
     * Agrega un nuevo alimento cárnico a la lista si no existe previamente.
     *
     * @param newData Objeto de tipo AlimentoCarnicoDTO a agregar.
     */
    @Override
    public void crear(AlimentoCarnicoDTO newData) {
        if (find(newData) == null) {
            listaAlimentosCarnicos.add(newData);
            writeSerialized();
        }
    }

    /**
     * Elimina un alimento cárnico de la lista si existe.
     *
     * @param toDelete Objeto de tipo AlimentoCarnicoDTO a eliminar.
     */
    @Override
    public void eliminar(AlimentoCarnicoDTO toDelete) {
        AlimentoCarnicoDTO found = find(toDelete);
        if (found != null) {
            listaAlimentosCarnicos.remove(found);
            writeSerialized();
        }
    }

    /**
     * Actualiza un alimento cárnico en la lista si existe.
     *
     * @param toUpdate Objeto de tipo AlimentoCarnicoDTO a actualizar.
     * @param newData  Nuevos datos para reemplazar el objeto anterior.
     */
    @Override
    public void actualizar(AlimentoCarnicoDTO toUpdate, AlimentoCarnicoDTO newData) {
        AlimentoCarnicoDTO found = find(toUpdate);
        if (found != null) {
            listaAlimentosCarnicos.remove(found);
            listaAlimentosCarnicos.add(newData);
            writeSerialized();
        }
    }

    /**
     * Retorna la lista completa de alimentos cárnicos almacenados.
     *
     * @return Lista de objetos AlimentoCarnicoDTO.
     */
    @Override
    public ArrayList<AlimentoCarnicoDTO> getAll() {
        return listaAlimentosCarnicos;
    }

    /**
     * Busca un alimento cárnico en la lista comparando su ID.
     *
     * @param toFind Objeto AlimentoCarnicoDTO a buscar.
     * @return El objeto encontrado o null si no existe.
     */
    @Override
    public AlimentoCarnicoDTO find(AlimentoCarnicoDTO toFind) {
        for (AlimentoCarnicoDTO aC : listaAlimentosCarnicos) {
            if (aC.getId() == toFind.getId()) {
                return aC;
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
            listaAlimentosCarnicos = new ArrayList<>();
        } else {
            listaAlimentosCarnicos = (ArrayList<AlimentoCarnicoDTO>) content;
        }
    }

    /**
     * Guarda los datos en un archivo serializado para persistencia.
     */
    @Override
    public void writeSerialized() {
        FileHandler.writeSerialized(SERIALIZED_NAME, listaAlimentosCarnicos);
    }
}
