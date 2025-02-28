/**
 * Paquete que contiene las clases de persistencia del modelo de datos.
 * Define las interfaces y clases necesarias para la gestión de CRUD y 
 * serialización de objetos en la aplicación.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * Interfaz genérica para operaciones CRUD y manejo de serialización.
 *
 * @param <D> Tipo de datos que manejará la implementación de CRUD.
 */
public interface CRUDOperation<D> {

    /**
     * Crea un nuevo elemento en la colección.
     *
     * @param newData Datos del nuevo elemento a agregar.
     */
    void crear(D newData);

    /**
     * Elimina un elemento de la colección.
     *
     * @param toDelete Elemento a eliminar.
     */
    void eliminar(D toDelete);

    /**
     * Actualiza un elemento existente en la colección.
     *
     * @param toUpdate Elemento actual a modificar.
     * @param newData  Nuevos datos para actualizar el elemento.
     */
    void actualizar(D toUpdate, D newData);

    /**
     * Obtiene todos los elementos almacenados.
     *
     * @return Lista de todos los elementos.
     */
    ArrayList<D> getAll();

    /**
     * Busca un elemento en la colección.
     *
     * @param toFind Elemento a buscar.
     * @return Elemento encontrado o null si no existe.
     */
    D find(D toFind);

    /**
     * Carga los datos desde un archivo serializado.
     */
    void readSerialized();

    /**
     * Guarda los datos en un archivo serializado.
     */
    void writeSerialized();
}
