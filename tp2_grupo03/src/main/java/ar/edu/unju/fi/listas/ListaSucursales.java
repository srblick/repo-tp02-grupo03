package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Sucursal;

public class ListaSucursales {
	
    private List<Sucursal> sucursales;

    public ListaSucursales() {
        sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void eliminarSucursal(Sucursal sucursal) {
        sucursales.remove(sucursal);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }
}