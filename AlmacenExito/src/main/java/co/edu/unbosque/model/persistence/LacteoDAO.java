package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.LacteoDTO;

public class LacteoDAO implements CRUDOperation<LacteoDTO, LacteoDTO> {

    ArrayList<LacteoDTO> listaLacteo;

    public LacteoDAO() {
        listaLacteo = new ArrayList<>();
    }

    @Override
    public void crear(LacteoDTO nuevoDato) {
        listaLacteo.add(nuevoDato);
    }

    @Override
    public void eliminar(LacteoDTO nuevoDato) {
        listaLacteo.remove(nuevoDato);
    }

    @Override
    public void eliminar(int posicionE) {
        if (posicionE >= 0 && posicionE < listaLacteo.size()) {
            listaLacteo.remove(posicionE);
        }
    }

    @Override
    public void actualizar(int posicion, LacteoDTO datoActualizado) {
        if (posicion >= 0 && posicion < listaLacteo.size()) {
            listaLacteo.set(posicion, datoActualizado);
        }
    }

    @Override
    public ArrayList<LacteoDTO> buscarTodo() {
        return listaLacteo;
    }

    @Override
    public LacteoDTO buscarUno(int posicion) {
        if (posicion >= 0 && posicion < listaLacteo.size()) {
            return listaLacteo.get(posicion);
        }
        return null;
    }
}