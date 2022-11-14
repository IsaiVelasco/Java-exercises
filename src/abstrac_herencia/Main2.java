package abstrac_herencia;

public class Main2 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(6, 6);
        Triangulo triangulo = new Triangulo(6, 3);
        Figura rectangulo = new Rectangulo(6, 3);
        System.out.println("Circulo: "+circulo.getArea());
        System.out.println("Triangulo: "+triangulo.getArea());
        System.out.println("Rectangulo: "+rectangulo.getArea());
    }
}
