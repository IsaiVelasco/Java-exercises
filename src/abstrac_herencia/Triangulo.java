package abstrac_herencia;

public class Triangulo extends Figura {

    public Triangulo(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public double getArea(){
        return (super.getAncho()*super.getAlto())/2;
    }
}
