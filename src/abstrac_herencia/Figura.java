package abstrac_herencia;

public abstract class Figura {
    private int coordenada_x;
    private int coordenada_y;
    private int ancho;
    private int alto;
    private float perimetro;
    private double area;


    public Figura(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getArea(){
        return ancho*alto;
    };

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
