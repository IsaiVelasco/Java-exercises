package interfaces_herencia;

public class Libro extends Documento implements PrestaLibro{
    boolean prestado;

    public Libro(String codigo, String titulo, String estado, String anio) {
        super(codigo, titulo, estado, anio);
        this.prestado = false;
    }

    @Override
    public boolean prestar() {
        if(!prestado){
            prestado = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if(prestado){
            prestado = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

}
