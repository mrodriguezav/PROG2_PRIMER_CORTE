package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.JugueteDTO;

public class JugueteDAO implements CRUDOperation<JugueteDTO, JugueteDTO> {

    private ArrayList<JugueteDTO> listaJuguetes;

    public JugueteDAO() {
        listaJuguetes = new ArrayList<>();
    }

    @Override
    public void crear(JugueteDTO nuevoDato) {
        if (nuevoDato != null) {
            listaJuguetes.add(nuevoDato);
        }
    }

    @Override
    public void eliminar(JugueteDTO nuevoDato) {
        listaJuguetes.remove(nuevoDato);
    }

    @Override
    public void eliminar(int posicionE) {
        if (posicionE >= 0 && posicionE < listaJuguetes.size()) {
            listaJuguetes.remove(posicionE);
        }
    }

    @Override
    public void actualizar(int posicion, JugueteDTO datoActualizado) {
        if (posicion >= 0 && posicion < listaJuguetes.size() && datoActualizado != null) {
            listaJuguetes.set(posicion, datoActualizado);
        }
    }

    @Override
    public ArrayList<JugueteDTO> buscarTodo() {
        return listaJuguetes;
    }

    @Override
    public JugueteDTO buscarUno(int posicion) {
        if (posicion >= 0 && posicion < listaJuguetes.size()) {
            return listaJuguetes.get(posicion);
        }
        return null;
    }
}