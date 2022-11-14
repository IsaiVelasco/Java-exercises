package gestion_empleados;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado implements AccionesEmpleado{
    private String nombre;
    private String apellidos;
    private int edad;
    private List<String>actividadesDiarias;
    private String codigoDeEmpleado;

    public Empleado(String nombre, String apellidos, int edad, String codigoDeEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.codigoDeEmpleado = codigoDeEmpleado;
        this.actividadesDiarias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getActividadesDiarias() {
        return actividadesDiarias;
    }

    public void setActividadesDiarias(List<String> actividadesDiarias) {
        this.actividadesDiarias = actividadesDiarias;
    }

    public String getCodigoDeEmpleado() {
        return codigoDeEmpleado;
    }

    public void setCodigoDeEmpleado(String codigoDeEmpleado) {
        this.codigoDeEmpleado = codigoDeEmpleado;
    }
}
