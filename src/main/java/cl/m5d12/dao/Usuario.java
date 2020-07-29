package cl.m5d12.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario {

	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 */
	
	@Id
	@SequenceGenerator(name = "usuarioidGenerator", sequenceName = "USUARIO_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "usuarioidGenerator")

	@Column(name="USUARIOID")
	private int usuarioid;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="RUT")
	private String rut;
	@Column(name="TELEFONO")
	private int telefono;
	@Column(name="CORREOELECTRONICO")
	private String correoelectronico;
	@Column(name="RUBRO")
	private String rubro;
	@Column(name="DIRECCION")
	private String direccion;
	@Column(name="CLAVE")
	private String clave;
	
	//Constructor
	public Usuario() {
		
	}

	public Usuario(int usuarioid, String nombre, String rut, int telefono, String correoelectronico) {
		
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
	}
	

	public Usuario(int usuarioid, String nombre, String rut, int telefono, String correoelectronico, String clave) {
		
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.clave = clave;
	}
	
	public Usuario(int usuarioid, String nombre, String rut, int telefono, String correoelectronico, String rubro,
			String direccion) {
		super();
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
	}

	public Usuario(int usuarioid, String nombre, String rut, int telefono, String correoelectronico, String rubro,
			String direccion, String clave) {
		
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
		this.clave = clave;
	}
	
	//Getters And Setters

	public int getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
		
}	