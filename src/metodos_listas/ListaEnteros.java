package metodos_listas;

import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {
    public static void main(String[] args) {
        int arr[] = {10,58,68,920,15,16,85,75,32};
        List<Integer> lista = new ArrayList<>();

        for (int n:arr
             ) {
            lista.add(n);
        }
        lista.set(lista.indexOf(920),25);
        lista.set(lista.indexOf(68),90);
        System.out.println("[");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" : "+ lista.get(i));
        }
        System.out.println("]");
    }
}
