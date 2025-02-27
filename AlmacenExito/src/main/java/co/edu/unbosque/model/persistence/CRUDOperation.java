package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation<D> {

	public void crear(D newData);

	public void eliminar(D toDelete);

	public void actualizar(D toUpdate, D newData);

	public ArrayList<D> getAll();

	public D find(D toFind);

	public void readSerialized();

	public void writeSerialized();
}
