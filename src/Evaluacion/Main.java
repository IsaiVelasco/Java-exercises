package Evaluacion;

import Evaluacion.controllers.EmployeeController;
import Evaluacion.global_data.StaticData;
import Evaluacion.global_data.Utilities;
import Evaluacion.model.Employee;
import Evaluacion.model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StaticData db = new StaticData();
        Utilities ut = new Utilities();
        db.cargarTiposProductos();
        db.cargarProductos();
        db.cargarTiposEmpleado();
        db.cargarEmpleados();


        Scanner sc = new Scanner(System.in);
        System.out.println("LOGIN");
        System.out.println("Ingresa tu nombre para ingresar");
        String input = sc.nextLine();
        Employee eLog = startLogin(input, db.empleados_registrados);
        if(eLog!=null){
            System.out.println("Ingreso de "+eLog.toString());
            EmployeeController ec = new EmployeeController(db, ut, eLog);
            int opcion = 0;
            do{
                System.out.println("Ingresa una opcion:" +
                        "\n1. Ver productos" +
                        "\n2. Vender Productos" +
                        "\n3. Acomodar productos" +
                        "\n4. Descansar" +
                        "\n5. Sentarse" +
                        "\n6. Correr");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        for (Product item:db.productos_registrados
                        ) {
                            System.out.println(item.toString());
                        }
                        break;
                    case 2:
                        System.out.println("Pag recibido:"+ec.recibirPago(db.productos_registrados));
                        System.out.println("Mayor precio:"+ut.getMayorPrice(db.productos_registrados));
                        System.out.println("Mayor cantidad:"+ut.mayorStock(db.productos_registrados));
                        System.out.println("Costo total de la lista:"+ut.totalCost(db.productos_registrados));
                        System.out.println(ut.reportOfThis(db.productos_registrados));
                        if(ec.venderProductos(db.productos_registrados)){


                            ec.venderProductos(db.productos_registrados);
                        }

                        break;
                }
            }while (opcion != 0);


        } else System.out.println("Empleado no encontrado");



    }
    public static Employee startLogin(String input, List<Employee> empleados){
        for (Employee item:empleados
             ) {

            if(item.getFullName().equals(input)){
                return item;
            }
        }
        return null;
    }
}
