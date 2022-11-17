package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            System.out.println("SI SABES");
        }else{
            System.out.println("WHAT?");
        }

    }
}
