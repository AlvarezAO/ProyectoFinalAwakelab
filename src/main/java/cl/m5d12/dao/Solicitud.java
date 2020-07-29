package cl.m5d12.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOLICITUD")
public class Solicitud {

	
	@Id
	@GeneratedValue
	@Column(name="IDSOLICITUD")
	private int idsolicitud;
	@Column(name="NOMBRESOLICITUD")
	private String nombreSolicitud;
	@Column(name="DETALLESOLICITUD")
	private String detalleSolicitud;
	@Column(name="FECHASOLICITUD")
	private String fechaSolicitud;
	@Column(name="ESTADOSOLICITUD")
	private String estadoSolicitud;
	@Column(name="TIPOSOLICITUD")
	private String tipoSolicitud;
	@Column(name="USUARIOID")
	private int usuarioid;
	
	//Constructor
	public Solicitud() {
		
	}

	public Solicitud(int idsolicitud, String nombreSolicitud, String detalleSolicitud, String fechaSolicitud,
			String tipoSolicitud , int usuarioid) {
		
		this.idsolicitud = idsolicitud;
		this.nombreSolicitud = nombreSolicitud;
		this.detalleSolicitud = detalleSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.usuarioid = usuarioid;
	}

	public Solicitud(int idsolicitud, String nombreSolicitud, String detalleSolicitud, String fechaSolicitud,
			String estadoSolicitud, String tipoSolicitud, int usuarioid) {
		
		this.idsolicitud = idsolicitud;
		this.nombreSolicitud = nombreSolicitud;
		this.detalleSolicitud = detalleSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.estadoSolicitud = estadoSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.usuarioid = usuarioid;
	}

	
	//Getters And Setters
	public int getidsolicitud() {
		return idsolicitud;
	}

	public void setidsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public String getNombreSolicitud() {
		return nombreSolicitud;
	}

	public void setNombreSolicitud(String nombreSolicitud) {
		this.nombreSolicitud = nombreSolicitud;
	}

	public String getDetalleSolicitud() {
		return detalleSolicitud;
	}

	public void setDetalleSolicitud(String detalleSolicitud) {
		this.detalleSolicitud = detalleSolicitud;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	 public int getusuarioid() { return usuarioid; }
	 
	 public void setusuarioid(int usuarioid) { this.usuarioid = usuarioid; }
	
}
