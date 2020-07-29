package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Solicitud;

public interface SolicitudServicio {

	Solicitud findSolicitudByid(int idsolicitud);
	List<Solicitud> listaSolicitud();
	void agregarSolicitud(Solicitud sol);
	void eliminarSolicitud(int idsolicitud);
	void editarSolicitud(Solicitud sol);
	
}
