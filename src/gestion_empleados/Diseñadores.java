package gestion_empleados;

import java.util.Collections;
import java.util.List;

public class Diseñadores extends Empleado{
    private String herramientaDeDiseño;


    public Diseñadores(String nombre, String apellidos, int edad, String codigoDeEmpleado) {
        super(nombre, apellidos, edad, codigoDeEmpleado);
        this.herramientaDeDiseño = "Photoshop";
        super.getActividadesDiarias().add("Reuniones de avance");
        super.getActividadesDiarias().add("Elaboracion de diseño para poginas webs");
        super.getActividadesDiarias().add("Presentacion-ajustes del diseño");
        super.setCodigoDeEmpleado("8000");
    }

    @Override
    public List<String> obtenerActividadesDiarias() {
        if(super.getEdad() <= 25){
            super.getActividadesDiarias().add("Revision de diseñador SR");
        }else {
            super.getActividadesDiarias().add("Apoyo a diseñador JR");
        }
        Collections.sort(super.getActividadesDiarias());
        return super.getActividadesDiarias();
    }
}
