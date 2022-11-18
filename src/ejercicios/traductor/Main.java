package ejercicios.traductor;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        // Fichero del que queremos leer
        File fichero = new File("src/ejercicios/traductor/diccionario.txt");
        Scanner s = null;
        int continuar = 0;
        do{
            try {
                String palabra = JOptionPane.showInputDialog("TRADUCTOR RUPESTRE\n=========================\nIngresa la palabra:");
                // Leemos el contenido del fichero
                System.out.println("... Consultando la base de palabras ...");
                s = new Scanner(fichero);
                boolean encontrado = false;
                // Leemos linea a linea el fichero
                while (s.hasNextLine()) {
                    String linea = s.nextLine(); 	// Guardamos la linea en un String
                    String arr[] = linea.split(" ");
                    if(arr[0].equals(palabra)){
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Spanish | English | Frances\n"
                                +arr[0]+" | "+arr[1]+" | "+ arr[1]);
                    }

                }

                BufferedWriter bw = null;
                FileWriter fw = null;

                try {
                    if(encontrado==false){
                        int eleccion = JOptionPane.showConfirmDialog(null,"Palabra no encontrada\n¿Deseas agregar al diccionario?");
                        if(eleccion == 0){
                            String en = JOptionPane.showInputDialog("Ingresa la traduccion en INGLES");
                            String fr = JOptionPane.showInputDialog("Ingresa la traduccion en FRANCES");
                            String data = "\n"+palabra+" "+en+" "+fr;
                            File file = fichero;
                            // Si el archivo no existe, se crea!
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            // flag true, indica adjuntar información al archivo.
                            fw = new FileWriter(file.getAbsoluteFile(), true);
                            bw = new BufferedWriter(fw);
                            bw.write(data);
                            JOptionPane.showMessageDialog(null, "Palabra registrada");
                        }

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        //Cierra instancias de FileWriter y BufferedWriter
                        if (bw != null)
                            bw.close();
                        if (fw != null)
                            fw.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            } catch (Exception ex) {
                System.out.println("Mensaje: " + ex.getMessage());
            } finally {
                // Cerramos el fichero tanto si la lectura ha sido correcta o no
                try {
                    if (s != null)
                        s.close();
                } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
                }
            }
            continuar = JOptionPane.showConfirmDialog(null, "DESEA INTENTAR DE NUEVO?");
        }while (continuar == 0);
    }
}
