package ar.edu.unju.fi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaContacto;
import ar.edu.unju.fi.model.Contacto;

@Controller
public class ContactoController {
	ListaContacto listaContactos = new ListaContacto();

	@GetMapping("/contacto")
	public String getPageContacto(Model model) {
		Contacto newContacto = new Contacto();
		model.addAttribute("newContacto", newContacto);
		return "contacto";
	}
	
	@GetMapping("/contacto/administrar")
	public String getAdministrarContactos(Model model) {
		model.addAttribute("contactos", listaContactos.getContactos());
		return "administrar_contactos";
	}
	
	@PostMapping("/contacto/guardar")
	public ModelAndView postGuardarContacto(@ModelAttribute("newContacto")Contacto newContacto) {
		ModelAndView modelView = new ModelAndView("redirect:/contacto");
		String mensaje = "Mensaje Enviado Correctamente";
		listaContactos.agregarContacto(newContacto);
		modelView.addObject("contactos", listaContactos.getContactos());
		modelView.addObject("mensaje", mensaje);
		return modelView;
	}	

}
