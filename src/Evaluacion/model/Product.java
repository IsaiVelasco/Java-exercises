package Evaluacion.model;

import Evaluacion.model.custom.ProductType;

public class Product {
    private String nombre;
    private Double precio;
    private int cantidad;
    private ProductType tipo;

    public Product(String nombre, Double precio, int cantidad, ProductType tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductType getTipo() {
        return tipo;
    }

    public void setTipo(ProductType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nombre='" + nombre + '\'' +
                ", precio=$" + precio +
                ", cantidad=" + cantidad +
                ", tipo=" + tipo.toString() +
                '}';
    }
}
