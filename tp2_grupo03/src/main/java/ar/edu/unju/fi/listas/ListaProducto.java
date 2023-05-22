package ar.edu.unju.fi.listas;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Producto;

public class ListaProducto {
	private List<Producto> productos;

	public ListaProducto() {
		productos = new ArrayList<Producto>();
		productos.add(new Producto("Doggy", 01, 3600.0f, "Alimento", 25));
		productos.add(new Producto("Gatty", 02, 5900.0f, "Alimento", 15));
		productos.add(new Producto("Perla Rosado", 03, 600.0f, "Collar", 0));
		productos.add(new Producto("Chaleco River", 04, 1450.0f, "Ropa", 17));
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
