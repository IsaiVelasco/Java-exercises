package Evaluacion.global_data;

import Evaluacion.model.Employee;
import Evaluacion.model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public StaticData db;

    public Product getMayorPrice(List<Product> products){
        if(!products.isEmpty()){
            Product mayor = products.get(0);
            for (Product product:products
                 ) {
                if(product.getPrecio() > mayor.getPrecio()){
                    mayor = product;
                }
            }
            return mayor;
        }
        return null;
    }
    public Product mayorStock(List<Product> products){
        if(!products.isEmpty()){
            Product mayor = products.get(0);
            for (Product product:products
            ) {
                if(product.getCantidad() > mayor.getCantidad()){
                    mayor = product;
                }
            }
            return mayor;
        }
        return null;
    }

    public Double totalCost(List<Product> products){
        if(!products.isEmpty()){
            Double suma = 0.0;
            for (Product product:products
            ) {
                suma+=(product.getPrecio()*product.getCantidad());
            }
            return suma;
        }
        return null;
    }

    public List<Product> noStock(List<Product> products){
        List<Product> noStock = new ArrayList<>();
        for (Product product:products
             ) {
            if(product.getCantidad()==0){
                noStock.add(product);
            }
        }
        return noStock;
    }

    public String reportOfThis(List<Product> products){
        Product mayorPrecio = getMayorPrice(products);
        Product mayorStock = mayorStock(products);
        Double costoTotal = totalCost(products);
        List<Product> noStock = noStock(products);

        String salida = "INFORME DE LA LISTA\n" +
                "Producto con mayor precio: "+mayorPrecio.toString()+"\n"+
                "Producto con mas cantidad: "+mayorStock.toString()+"\n"+
                "Costo total: $"+costoTotal+"\n" +
                "Productos sin stock:";

        if(noStock.isEmpty()) salida+="\t...todos tienen stock";
        else {
            for (Product item:noStock
            ) {
                salida+="\n\t"+item.toString();
            }
        }
        return salida;
    }

    public void deleteEmployeeType3(List<Employee> employees){
        for (Employee item:employees
             ) {
            if(item.getTipo().getNombre().equals(db.tipos_empleado.get(2).getNombre())){
                employees.remove(item);
                System.out.println("Eliminado: "+item.toString());
            }
        }
    }

    public void getHoraActual(){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        System.out.println("Hora: "+hours);
    }

    public String toUpper(String cadena){
        return cadena.toUpperCase();
    }
    public String toLower(String cadena){
        StringBuilder strb = new StringBuilder(cadena);
        return strb.reverse().toString();
    }
}
