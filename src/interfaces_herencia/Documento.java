package interfaces_herencia;

public class Documento {
    private String codigo;
    private String titulo;
    private String estado;
    private String anio;

    public Documento(String codigo, String titulo, String estado, String anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estado='" + estado + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }

    public String getCodeAndYear(){
        return "["+anio+"] ["+codigo+"]";
    }
}
