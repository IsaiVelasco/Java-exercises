package modulo1;

import java.util.Date;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private Date fechaDeNacimiento;
    private boolean tienealergias;
    public Persona(){}

    public Persona(String nombre, int edad, char sexo, Date fechaDeNacimiento, boolean tienealergias) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tienealergias = tienealergias;
    }
    public Persona(int edad, char sexo, Date fechaDeNacimiento, boolean tienealergias) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tienealergias = tienealergias;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isTienealergias() {
        return tienealergias;
    }

    public void setTienealergias(boolean tienealergias) {
        this.tienealergias = tienealergias;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", tienealergias=" + tienealergias +
                '}';
    }
}
