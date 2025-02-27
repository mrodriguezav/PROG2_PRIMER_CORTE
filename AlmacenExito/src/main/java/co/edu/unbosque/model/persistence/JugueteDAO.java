package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.JugueteDTO;

public class JugueteDAO implements CRUDOperation<JugueteDTO> {

	private ArrayList<JugueteDTO> listaJuguetes;
	private final String SERIALIZED_NAME = "juguetes.bat";

	@Override
	public void crear(JugueteDTO newData) {
		if (find(newData) == null) {
			listaJuguetes.add(newData);
			writeSerialized();
		}
	}

	@Override
	public void eliminar(JugueteDTO toDelete) {

		JugueteDTO found = find(toDelete);
		if (found != null) {
			listaJuguetes.remove(found);
			writeSerialized();
		}
	}

	@Override
	public void actualizar(JugueteDTO toUpdate, JugueteDTO newData) {

		JugueteDTO found = find(toUpdate);

		if (found != null) {
			listaJuguetes.remove(found);
			listaJuguetes.add(newData);
			writeSerialized();
		}
	}

	@Override
	public ArrayList<JugueteDTO> getAll() {
		return listaJuguetes;
	}

	@Override
	public JugueteDTO find(JugueteDTO toFind) {

		JugueteDTO found = null;

		if (!listaJuguetes.isEmpty()) {

			for (JugueteDTO j : listaJuguetes) {
				if (j.getId() == toFind.getId()) {
					found = j;
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
			listaJuguetes = new ArrayList<>();
		} else {
			listaJuguetes = (ArrayList<JugueteDTO>) content;
		}
	}

	@Override
	public void writeSerialized() {
		FileHandler.writeSerialized(SERIALIZED_NAME, listaJuguetes);
	}

}
