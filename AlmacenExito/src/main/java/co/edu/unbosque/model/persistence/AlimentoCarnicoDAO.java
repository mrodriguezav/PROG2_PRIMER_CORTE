package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AlimentoCarnicoDTO;

public class AlimentoCarnicoDAO implements CRUDOperation<AlimentoCarnicoDTO> {

	private ArrayList<AlimentoCarnicoDTO> listaAlimentosCarnicos;
	private final String SERIALIZED_NAME = "alimentosCarnicos.bat";

	@Override
	public void crear(AlimentoCarnicoDTO newData) {
		if (find(newData) == null) {
			listaAlimentosCarnicos.add(newData);
			writeSerialized();
		}
	}

	@Override
	public void eliminar(AlimentoCarnicoDTO toDelete) {
		AlimentoCarnicoDTO found = find(toDelete);
		if (found != null) {
			listaAlimentosCarnicos.remove(found);
			writeSerialized();
		}
	}

	@Override
	public void actualizar(AlimentoCarnicoDTO toUpdate, AlimentoCarnicoDTO newData) {
		AlimentoCarnicoDTO found = find(toUpdate);

		if (found != null) {
			listaAlimentosCarnicos.remove(found);
			listaAlimentosCarnicos.add(newData);
			writeSerialized();
		}
	}

	@Override
	public ArrayList<AlimentoCarnicoDTO> getAll() {
		return listaAlimentosCarnicos;
	}

	@Override
	public AlimentoCarnicoDTO find(AlimentoCarnicoDTO toFind) {
		AlimentoCarnicoDTO found = null;

		if (!listaAlimentosCarnicos.isEmpty()) {

			for (AlimentoCarnicoDTO aC : listaAlimentosCarnicos) {
				if (aC.getId() == toFind.getId()) {
					found = aC;
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
			listaAlimentosCarnicos = new ArrayList<>();
		} else {
			listaAlimentosCarnicos = (ArrayList<AlimentoCarnicoDTO>) content;
		}

	}

	@Override
	public void writeSerialized() {

		FileHandler.writeSerialized(SERIALIZED_NAME, listaAlimentosCarnicos);
	}

}
