package metodos_listas;

import java.util.ArrayList;
import java.util.List;

public class ListaString {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("15");
        lista.add("30");
        lista.add("12");
        lista.add("60");
        int suma = 0;
        for (String s:lista
             ) {
            suma+=Integer.parseInt(s);
        }
        System.out.println("EL RESULTADO DE LA SUMA DE STRINGS ES: "+suma);
    }
}
