package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.UsuarioDTO;

public class UsuarioDAO implements CRUDOperation<UsuarioDTO, UsuarioDTO> {

	ArrayList<UsuarioDTO> listaUsuarios;

	public UsuarioDAO() {
		listaUsuarios = new ArrayList<>();
	}

	@Override
	public void crear(UsuarioDTO nuevoDato) {
		listaUsuarios.add(nuevoDato);
	}

	@Override
	public void eliminar(UsuarioDTO nuevoDato) {
		listaUsuarios.remove(nuevoDato);
	}

	@Override
	public void eliminar(int posicionE) {
		listaUsuarios.remove(posicionE);
	}

	@Override
	public void actualizar(int posicion, UsuarioDTO datoActualizado) {
		listaUsuarios.set(posicion, datoActualizado);

	}

	@Override
	public ArrayList<UsuarioDTO> buscarTodo() {
		// TODO Auto-generated method stub
		return listaUsuarios;
	}

	@Override
	public UsuarioDTO buscarUno(int posicion) {
		// TODO Auto-generated method stub
		return null;
	}

}
