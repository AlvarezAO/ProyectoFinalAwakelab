package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Solicitud;
import cl.m5d12.dao.SolicitudRepositorio;

@Service
public class SolicitudServicioImpl implements SolicitudServicio {

	@Autowired
	SolicitudRepositorio sr;
	@Override
	public Solicitud findSolicitudByid(int idsolicitud) {
		
		return sr.findOne(idsolicitud) ;
	}

	@Override
	public List<Solicitud> listaSolicitud() {
		
		return (List<Solicitud>) sr.findAll();
	}

	@Override
	public void agregarSolicitud(Solicitud sol) {
		sr.save(sol);
		
	}

	@Override
	public void eliminarSolicitud(int idsolicitud) {
		sr.delete(idsolicitud);
		
	}

	@Override
	public void editarSolicitud(Solicitud sol) {
		sr.save(sol);
		
	}	

}
