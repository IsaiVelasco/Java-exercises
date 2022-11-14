package Evaluacion.controllers;

import Evaluacion.global_data.StaticData;
import Evaluacion.global_data.Utilities;
import Evaluacion.model.Employee;
import Evaluacion.model.Product;

import java.util.List;

public class EmployeeController implements ActionsEmployee{

    private StaticData db;
    private Utilities utilities;

    private Employee employeeLogin;

    public EmployeeController(StaticData db, Utilities utilities, Employee employeeLogin) {
        this.db = db;
        this.utilities = utilities;
        this.employeeLogin = employeeLogin;
    }

    @Override
    public boolean venderProductos(List<Product> order) {
        if(!employeeLogin.getTipo().getNombre().equals("Tipo 1") & !employeeLogin.getTipo().getNombre().equals("Tipo 2"))
        {
            System.out.println("No tienes acceso a esta funcion");
            return false;
        }
        for (Product product:order
             ) {
            int i = db.productos_registrados.indexOf(product);
            if(i != -1){
                Product toUpdate = db.productos_registrados.get(i);
                if(toUpdate.getCantidad() >= product.getCantidad() & toUpdate.getCantidad() != 0){
                    db.productos_registrados.get(i).setCantidad(
                            toUpdate.getCantidad() - product.getCantidad()
                    );
                    System.out.println("Vendido: "+product.toString());
                } else {
                    System.out.println("Agotado: "+product.toString());
                }
            }

        }
        return true;
    }

    @Override
    public boolean acomodarProductos(List<Product> products) {
        if(!employeeLogin.getTipo().getNombre().equals("Tipo 1"))
        {
            System.out.println("No tienes acceso a esta funcion");
            return false;
        }
        String error = "";
        for (Product product:products
             ) {
            if (!db.isRepeat(product.getTipo()) == true){
                db.productos_registrados.add(product);
            }else {
                error+="Productos de este tipo no se agregaron: "+product.toString();
            }
        }
        if(error == "") System.out.println("Producto registrado con exito");
        else System.out.println(error);
        return true;
    }

    @Override
    public boolean descansar() {
        if(!employeeLogin.getTipo().getNombre().equals("Tipo 1") & !employeeLogin.getTipo().getNombre().equals("Tipo 2"))
        {
            System.out.println("No tienes acceso a esta funcion");
            return false;
        }
        System.out.println("Permiso de descanso concedido");
        return true;
    }

    @Override
    public boolean sentarse() {
        if(!employeeLogin.getTipo().getNombre().equals("Tipo 1"))
        {
            System.out.println("No tienes acceso a esta funcion");
            return false;
        }
        System.out.println("Permiso de sentarse concedido");
        return false;
    }

    @Override
    public boolean correr() {
        if(!employeeLogin.getTipo().getNombre().equals("Tipo 2"))
        {
            System.out.println("No tienes acceso a esta funcion");
            return false;
        }
        System.out.println("Funcion correr habilitada");
        return false;
    }

    @Override
    public Double recibirPago(List<Product> products) {
        Double suma = 0.00;
        for (Product product:products
             ) {
            suma+=product.getPrecio()*product.getCantidad();
        }
        return suma;
    }
}
