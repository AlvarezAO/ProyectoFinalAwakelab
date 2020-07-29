package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Usuario;

public interface UsuarioServicio {

	Usuario findUsuarioByid(int usuarioid);
	List<Usuario> listarUsuario();
	void agregarUsuario(Usuario user);
	void eliminarUsuario(int usuarioid);
	void editarUsuario(Usuario user);
	
}
