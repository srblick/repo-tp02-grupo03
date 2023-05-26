package ar.edu.unju.fi.listas;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Contacto;

public class ListaContacto {
	private List<Contacto> contactos;

	public ListaContacto() {
		contactos = new ArrayList<Contacto>();
		contactos.add(new Contacto("Juan Peres", "Juan@gmail.com", "Jujuy", "Hacen envios al interior"));
		contactos.add(new Contacto("Roman Lloron", "lloron@gmail.com", "Buenos Aires", "Tan mal Jugamos"));
		contactos.add(new Contacto("Marcelo Gallardo", "marcelo@gmail.com", "Paris", "Hacen envios al exterior"));
		contactos.add(new Contacto("Julian Alvarez", "julialvarez@gmail.com" , "Manchester", "reciben pagos internacionales. PD:River Campeon"));
	}

	public void agregarContacto(Contacto contacto) {
		contactos.add(contacto);
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

}
