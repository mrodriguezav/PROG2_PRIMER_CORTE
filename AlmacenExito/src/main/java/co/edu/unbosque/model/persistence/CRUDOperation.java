package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation<E,D> {
	
	public void crear(D nuevoDato);
	
	public void eliminar(D nuevoDato);
	
	public void eliminar(int posicionE);
	
	public void actualizar(int posicion, D datoActualizado);
	
	public ArrayList<D> buscarTodo();
	
	public D buscarUno(int posicion);
}
