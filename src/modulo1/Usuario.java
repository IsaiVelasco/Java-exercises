package modulo1;

import java.util.Date;

public class  Usuario {
    private static String token;
    private static Long firstKey;
    private static Date created;


    public static Persona thisPerson(Persona persona){
        return persona;
    }

    public static String together (String infoA, String infoB){
        return infoA +"-"+ infoB;
    }
}
