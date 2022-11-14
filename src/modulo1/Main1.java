package modulo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Main1 {
    public static void main(String[] args) throws java.text.ParseException {

        Persona persona = new Persona("Isai", 25, 'H',
                new SimpleDateFormat("dd/MM/yyyy").parse("05/09/1997") , false);
        Persona personaUsuario = Usuario.thisPerson(persona);

        Usuario user = new Usuario();


        if (personaUsuario == persona) System.out.println("prueba con ==: true");
        if(personaUsuario.equals(persona)) System.out.println("prueba con equals: true");

        System.out.println("con hascode: "+Objects.hash(personaUsuario, persona));


    }
}
