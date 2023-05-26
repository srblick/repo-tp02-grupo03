package ar.edu.unju.fi.model;

public class Mensaje {
	private String nombre;
	private String email;
	private String ciudad;
	private String consulta;
	
	
	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mensaje(String nombre, String email, String ciudad, String consulta) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.ciudad = ciudad;
		this.consulta = consulta;
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


	public String getConsulta() {
		return consulta;
	}


	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	
}
