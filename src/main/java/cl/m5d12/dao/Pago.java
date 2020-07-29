package cl.m5d12.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGO")
public class Pago {
	
	@Id
	@GeneratedValue
	@Column(name="IDPAGOS")
	private int idPagos;
	private int montoTotal;
	private int montoAdeuda;
	private String fechaPago;
	private int idSolicitud;
	
	//Constructor
	public Pago() {
		
	}

	public Pago(int idPagos, int montoTotal, int montoAdeuda, String fechaPago, int idSolicitud) {
		
		this.idPagos = idPagos;
		this.montoTotal = montoTotal;
		this.montoAdeuda = montoAdeuda;
		this.fechaPago = fechaPago;
		this.idSolicitud = idSolicitud;
	}
	
	//Getters And Setter

	public int getIdPagos() {
		return idPagos;
	}

	public void setIdPagos(int idPagos) {
		this.idPagos = idPagos;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getMontoAdeuda() {
		return montoAdeuda;
	}

	public void setMontoAdeuda(int montoAdeuda) {
		this.montoAdeuda = montoAdeuda;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	
}

