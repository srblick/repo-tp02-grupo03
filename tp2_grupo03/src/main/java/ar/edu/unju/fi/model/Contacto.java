package ar.edu.unju.fi.model;

public class Contacto {
	private String nombre;
	private String email;
	private String ciudad;
	private String mensaje;
	
	
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contacto(String nombre, String email, String ciudad, String mensaje) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.ciudad = ciudad;
		this.mensaje = mensaje;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
