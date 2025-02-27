package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.RopaDTO;

public class RopaDAO implements CRUDOperation<RopaDTO, RopaDTO> {

    private ArrayList<RopaDTO> listaRopa;

    public RopaDAO() {
        listaRopa = new ArrayList<>();
    }

    @Override
    public void crear(RopaDTO nuevoDato) {
        if (nuevoDato != null) {
            listaRopa.add(nuevoDato);
        }
    }

    @Override
    public void eliminar(RopaDTO nuevoDato) {
        listaRopa.remove(nuevoDato);
    }

    @Override
    public void eliminar(int posicionE) {
        if (posicionE >= 0 && posicionE < listaRopa.size()) {
            listaRopa.remove(posicionE);
        }
    }

    @Override
    public void actualizar(int posicion, RopaDTO datoActualizado) {
        if (posicion >= 0 && posicion < listaRopa.size() && datoActualizado != null) {
            listaRopa.set(posicion, datoActualizado);
        }
    }

    @Override
    public ArrayList<RopaDTO> buscarTodo() {
        return listaRopa;
    }

    @Override
    public RopaDTO buscarUno(int posicion) {
        if (posicion >= 0 && posicion < listaRopa.size()) {
            return listaRopa.get(posicion);
        }
        return null;
    }
}
