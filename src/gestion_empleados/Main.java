package gestion_empleados;

public class Main {
    public static void main(String[] args) {
        Diseñadores diseñadores = new Diseñadores("Disy","Apps Disy",26,"8000");
        Programadores programadores = new Programadores("Prox","Apps Prox",25,"9000");
        System.out.println("DATOS DE DISENIADORES");
        System.out.println(diseñadores.obtenerActividadesDiarias());
        System.out.println("DATOS DE PROGRAMADORES");
        System.out.println(programadores.obtenerActividadesDiarias());
    }
}
