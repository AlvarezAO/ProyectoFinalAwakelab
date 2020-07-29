package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Usuario;
import cl.m5d12.dao.ClienteRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	@Autowired
	ClienteRepositorio cr;
	
	@Override
	public Usuario findUsuarioByid(int usuarioid) {
		return cr.findOne(usuarioid);
	}

	@Override
	public List<Usuario> listarUsuario() {
		return (List<Usuario>) cr.findAll();
	}

	@Override
	public void agregarUsuario(Usuario user) {
		cr.save(user);
	}

	@Override
	public void eliminarUsuario(int usuarioid) {
		cr.delete(usuarioid);
	}

	@Override
	public void editarUsuario(Usuario user) {
		cr.save(user);
	}

}
