package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.RopaDTO;
//a
public class RopaDAO implements CRUDOperation<RopaDTO> {

	private ArrayList<RopaDTO> listaRopa;
	private final String SERIALIZED_NAME = "ropa.bat";

	public RopaDAO() {
		FileHandler.checkFolder();
		readSerialized();
	}

	@Override
	public void crear(RopaDTO newData) {

		if (find(newData) == null) {
			listaRopa.add(newData);
			writeSerialized();
		}

	}

	@Override
	public void eliminar(RopaDTO toDelete) {

		RopaDTO found = find(toDelete);

		if (found != null) {
			listaRopa.remove(found);
			writeSerialized();
		}
	}

	@Override
	public void actualizar(RopaDTO toUpdate, RopaDTO newData) {

		RopaDTO found = find(toUpdate);

		if (found != null) {
			listaRopa.remove(found);
			listaRopa.add(newData);
			writeSerialized();
		}

	}

	@Override
	public ArrayList<RopaDTO> getAll() {
		return listaRopa;
	}

	@Override
	public RopaDTO find(RopaDTO toFind) {
		RopaDTO found = null;

		if (!listaRopa.isEmpty()) {
			for (RopaDTO r : listaRopa) {

				if (r.getId() == toFind.getId()) {
					found = r;
					return found;
				}
			}

		}
		return null;
	}

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

	@Override
	public void writeSerialized() {
		FileHandler.writeSerialized(SERIALIZED_NAME, listaRopa);
	}

}
