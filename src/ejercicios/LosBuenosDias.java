package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LosBuenosDias {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int H = Integer.parseInt(br.readLine());
            if(H >= 6 & H <= 12) System.out.println(H+" : Buenos dias");
            else if (H >= 13 & H <= 20) System.out.println(H+" : Buenas tardes");
            else if ((H >= 21 & H < 24) | (H >= 0 & H <= 5) ) System.out.println(H+" : Buenas noches");
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
