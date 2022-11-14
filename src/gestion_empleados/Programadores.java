package gestion_empleados;

import java.util.Collections;
import java.util.List;

public class Programadores extends Empleado{
    private String herramientaDeDesarrollo;

    public Programadores(String nombre, String apellidos, int edad, String codigoDeEmpleado) {
        super(nombre, apellidos, edad, codigoDeEmpleado);
        this.herramientaDeDesarrollo = "Eclipse";
        super.getActividadesDiarias().add("Analisis de requerimientos");
        super.getActividadesDiarias().add("Desarrollo de requerimientos");
        super.getActividadesDiarias().add("Presentacion-pruebas unitarias");


    }

    @Override
    public List<String> obtenerActividadesDiarias() {
        Collections.sort(super.getActividadesDiarias());

        return  super.getActividadesDiarias();
    }
}
