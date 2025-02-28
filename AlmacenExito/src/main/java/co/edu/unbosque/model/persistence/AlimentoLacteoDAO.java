package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AlimentoLacteoDTO;

public class AlimentoLacteoDAO implements CRUDOperation<AlimentoLacteoDTO> {
	private ArrayList<AlimentoLacteoDTO> listaAlimentosLacteos;
	private final String SERIALIZED_NAME = "alimentosLacteos.bat";

	public AlimentoLacteoDAO() {

		FileHandler.checkFolder();
		readSerialized();
	}

	@Override
	public void crear(AlimentoLacteoDTO newData) {
		if (find(newData) == null) {
			listaAlimentosLacteos.add(newData);
			writeSerialized();
		}
	}

	@Override
	public void eliminar(AlimentoLacteoDTO toDelete) {
		AlimentoLacteoDTO found = find(toDelete);
		if (found != null) {
			listaAlimentosLacteos.remove(toDelete);
			writeSerialized();
		}
	}

	@Override
	public void actualizar(AlimentoLacteoDTO toUpdate, AlimentoLacteoDTO newData) {

		AlimentoLacteoDTO found = find(toUpdate);
		if (found != null) {
			listaAlimentosLacteos.remove(toUpdate);
			listaAlimentosLacteos.add(newData);
			writeSerialized();
		}
	}

	@Override
	public ArrayList<AlimentoLacteoDTO> getAll() {
		return listaAlimentosLacteos;
	}

	@Override
	public AlimentoLacteoDTO find(AlimentoLacteoDTO toFind) {
		AlimentoLacteoDTO found = null;

		if (!listaAlimentosLacteos.isEmpty()) {

			for (AlimentoLacteoDTO aL : listaAlimentosLacteos) {
				if (aL.getId() == toFind.getId()) {
					found = aL;
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
			listaAlimentosLacteos = new ArrayList<>();
		} else {
			listaAlimentosLacteos = (ArrayList<AlimentoLacteoDTO>) content;
		}
	}

	@Override
	public void writeSerialized() {
		FileHandler.writeSerialized(SERIALIZED_NAME, listaAlimentosLacteos);
	}

}
