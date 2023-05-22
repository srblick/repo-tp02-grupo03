package ar.edu.unju.fi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaProducto;
import ar.edu.unju.fi.model.Producto;

@Controller
public class ProductoController {
	ListaProducto listaProductos = new ListaProducto();

	@GetMapping("/productos")	
	public String productos(Model model) {
		model.addAttribute("productos", listaProductos.getProductos());
		return "productos";
	}

	@GetMapping("/producto/nuevo")
	public String nuevoProducto(Model model) {
		Producto newProduct = new Producto();
		model.addAttribute("newProduct", newProduct);
		return "nuevo_producto";
	}
	
	@PostMapping("/producto/guardar")
	public ModelAndView guardarProducto(@ModelAttribute("newProduct")Producto newProduct) {
		ModelAndView modelView = new ModelAndView("productos");
		listaProductos.agregarProducto(newProduct);
		modelView.addObject("productos", listaProductos.getProductos());
		return modelView;
	}
	
/*	@PostMapping("/producto/guardar")
	public String guardar(Model model, Producto newProduct) {
		listaProductos.agregarProducto(newProduct);
		model.addAttribute("productos", listaProductos.getProductos());
		return "productos";		
	}*/
}
