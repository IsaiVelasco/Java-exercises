package Evaluacion.controllers;

import Evaluacion.model.Product;

import java.util.List;

public interface ActionsEmployee {

    public boolean venderProductos(List<Product> order);
    public boolean acomodarProductos(List<Product> products);
    public boolean descansar();
    public boolean sentarse();
    public  boolean correr();
    public Double recibirPago(List<Product> products);

}
