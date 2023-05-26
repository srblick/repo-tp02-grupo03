package ar.edu.unju.fi.model;

public class Sucursal {
    private String nombre;
    private String codigo;
    private double precio;
    private String categoria;
    private double descuento;

    // Constructor vacío
    public Sucursal() {
    }

    // Constructor con todos los atributos
    public Sucursal(String nombre, String codigo, double precio, String categoria, double descuento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
