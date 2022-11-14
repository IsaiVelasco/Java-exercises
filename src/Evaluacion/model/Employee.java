package Evaluacion.model;

import Evaluacion.model.custom.EmployeeType;

public class Employee {
    private String fullName;
    private int edad;
    private int antiguedad;
    private EmployeeType tipo;

    public Employee(String fullName, int edad, int antiguedad, EmployeeType tipo) {
        this.fullName = fullName;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public EmployeeType getTipo() {
        return tipo;
    }

    public void setTipo(EmployeeType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", edad=" + edad +
                ", antiguedad=" + antiguedad +
                ", tipo=" + tipo.toString() +
                '}';
    }
}
