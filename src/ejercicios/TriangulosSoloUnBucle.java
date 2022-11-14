package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangulosSoloUnBucle {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            int N = a*(a+1)/2;
            int end_line = a;
            String line_solid = "";
            String out_line = "";

            for (int i = 1; i <= N; i++) {
                line_solid += "*";
                if(end_line == i){
                    line_solid +="\n";
                    end_line += --a;
                    if(i!=N) out_line += "*\n*";
                }

                if(N==1) out_line += "*";
                else if(i <= a){
                    out_line += "*";
                }else if(i!= end_line-1 & i != end_line-2 & i != N) {
                    out_line += " ";
                }

            }

            System.out.print(line_solid);
            System.out.println(out_line);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

/*
******
*****
****
***
**
*

******
*   *
*  *
* *
**
*

 ******  *   *   *  *   * *   **  *
*/