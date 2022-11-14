package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolicitarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int suma_positivos = 0;
        int suma_negativos = 0;
        List<Integer> primos_negativos = new ArrayList<>();

        while (true){
            int n = sc.nextInt();
            if ( n != -1){
                if(n > mayor) mayor = n;
                if(n < menor) menor = n;
                suma = suma + (n);
                if(n > 0) suma_positivos += n;
                else if(n < 0){
                    suma_negativos += n;
                    if(esPrimoNegativo(n)) primos_negativos.add(n);
                }
            }else break;
        }

        String sout = "Datos {" +
                "\n\tmayor: " + mayor +
                ", \n\tmenor: " + menor +
                ", \n\tsuma: " + suma +
                ", \n\tsuma_positivos: " + suma_positivos +
                ", \n\tsuma_negativos: " + suma_negativos +
                ", \n\tprimos_negativos: " + primos_negativos +
                "\n}";
        System.out.println(sout);
    }
    public static boolean esPrimoNegativo(int x){
        int n = Math.abs(x);
        for (int i = 2; i < n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }


}
