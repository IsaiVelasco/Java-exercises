package abstrac_herencia;

public class Circulo extends Figura{

    public Circulo(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public double getArea(){
        return Math.pow(super.getAncho()/2,2)*Math.PI;
     }
}
