package interfaces_herencia;

public class Main3 {
    public static void main(String[] args) {
        Libro libro = new Libro("CODEX","Titulo","estado", "2022");
        Revista revista = new Revista("R1","Titulo REVISTA 1","estadoR1", "2022", 1);
        libro.toString();
        libro.getCodeAndYear();
        revista.toString();
        revista.getCodeAndYear();

        Documento libro2 = new Libro("DC BOOK","Titulo2","estado2", "2022");
        Documento revista2 = new Revista("R2","Titulo REVISTA 2","estadoR1", "2022", 2);
    }
}
