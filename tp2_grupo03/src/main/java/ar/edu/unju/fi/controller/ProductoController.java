package ar.edu.unju.fi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Producto;

@Controller
public class ProductoController {

	@RequestMapping("/productos")
	public String productos() {
		return "productos";
	}

	@GetMapping("/producto/nuevo")
	public String nuevoProducto(Model model) {
		Producto newProduct = new Producto();
		model.addAttribute("newProduct", newProduct);
		return "nuevo_producto";
	}
	
	@PostMapping("/producto/guardar")
	public String guardar(Model model, Producto newProduct) {
		return "productos";		
	}
}
