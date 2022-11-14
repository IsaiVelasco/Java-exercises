package interfaces_herencia;

public class Revista extends Documento implements PrestaRevista{
    int numero;
    public Revista(String codigo, String titulo, String estado, String anio, int numero) {
        super(codigo, titulo, estado, anio);
        this.numero = numero;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public int numero() {
        return numero;
    }

}
