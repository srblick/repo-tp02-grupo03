package ar.edu.unju.fi.listas;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Mensaje;

public class ListaMensaje {
	private List<Mensaje> mensajes;

	public ListaMensaje() {
		mensajes = new ArrayList<Mensaje>();
		mensajes.add(new Mensaje("Doggy", 01, 3600.0f, "Alimento", 25));
		mensajes.add(new Mensaje("Gatty", 02, 5900.0f, "Alimento", 15));
		mensajes.add(new Mensaje("Perla Rosado", 03, 600.0f, "Collar", 0));
		mensajes.add(new Mensaje("Chaleco River", 04, 1450.0f, "Ropa", 17));
	}

	public void agregarMensaje(Mensaje mensaje) {
		mensajes.add(mensaje);
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
	