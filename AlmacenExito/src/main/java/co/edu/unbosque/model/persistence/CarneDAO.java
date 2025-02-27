package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.CarneDTO;

public class CarneDAO implements CRUDOperation<CarneDTO, CarneDTO> {

    private ArrayList<CarneDTO> listaCarne;

    public CarneDAO() {
        listaCarne = new ArrayList<>();
    }

    @Override
    public void crear(CarneDTO nuevoDato) {
        if (nuevoDato != null) {
            listaCarne.add(nuevoDato);
        }
    }

    @Override
    public void eliminar(CarneDTO nuevoDato) {
        listaCarne.remove(nuevoDato);
    }

    @Override
    public void eliminar(int posicionE) {
        if (posicionE >= 0 && posicionE < listaCarne.size()) {
            listaCarne.remove(posicionE);
        }
    }

    @Override
    public void actualizar(int posicion, CarneDTO datoActualizado) {
        if (posicion >= 0 && posicion < listaCarne.size() && datoActualizado != null) {
            listaCarne.set(posicion, datoActualizado);
        }
    }

    @Override
    public ArrayList<CarneDTO> buscarTodo() {
        return listaCarne;
    }

    @Override
    public CarneDTO buscarUno(int posicion) {
        if (posicion >= 0 && posicion < listaCarne.size()) {
            return listaCarne.get(posicion);
        }
        return null;
    }
}