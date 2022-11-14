package Evaluacion.global_data;

import Evaluacion.model.Employee;
import Evaluacion.model.Product;
import Evaluacion.model.UserRol;
import Evaluacion.model.custom.EmployeeType;
import Evaluacion.model.custom.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticData {
    public List<Product> productos_registrados;
    public List<ProductType> tipos_producto;
    public List<EmployeeType> tipos_empleado;
    public List<Employee> empleados_registrados;

    public StaticData() {
        this.productos_registrados = new ArrayList<>();
        this.tipos_producto = new ArrayList<>();
        this.tipos_empleado = new ArrayList<>();
        this.empleados_registrados = new ArrayList<>();

    }

    public static String [] productTypes(){
        String arr[] = {""};
        return arr;
    }
    public void cargarTiposProductos(){
        for (int i = 1; i <= 20; i++) {
            ProductType TIPO = new ProductType(i,"P. Tipo "+i);
            this.tipos_producto.add(TIPO);
        }
    }
    public void cargarTiposEmpleado(){
        for (int i = 1; i <= 3; i++) {
            EmployeeType TIPO = new EmployeeType(i,"Tipo "+i);
            this.tipos_empleado.add(TIPO);
        }
    }
    public void cargarProductos(){
        String names[] = {"Audifonos","Mouse","Bocina","Protoboard","Arduino"};
        for (int i = 0; i < names.length; i++) {
            int end_rango = tipos_producto.size();
            Random random = new Random();
            Double precio =  Math.round((100 + random.nextDouble(300 - 100))*100.0)/100.0;
            int cantidad = 10 + random.nextInt(15-10);
            int aleatory_tipe = random.nextInt(end_rango);

            ProductType tipo = this.tipos_producto.get(aleatory_tipe);
            while (isRepeat(tipo) == true){
                aleatory_tipe = random.nextInt(end_rango);
                System.out.println(aleatory_tipe);
                tipo = this.tipos_producto.get(aleatory_tipe);
            }
            Product product = new Product(names[i],precio,cantidad, tipo);
            this.productos_registrados.add(product);

        }
    }


    public void cargarEmpleados(){
        Employee tipo1 = new Employee("Isai V", 23, 2, this.tipos_empleado.get(0));
        Employee tipo2 = new Employee("German Z", 24, 1, this.tipos_empleado.get(1));
        Employee tipo3 = new Employee("Andres C", 19, 1, this.tipos_empleado.get(2));
        this.empleados_registrados.add(tipo1);
        this.empleados_registrados.add(tipo2);
        this.empleados_registrados.add(tipo3);
    }
    public  boolean isRepeat(ProductType tipo){
        for (Product product: this.productos_registrados
             ) {
            if(product.getTipo().equals(tipo)){
                return true;
            }
        }
        return false;
    }
}
