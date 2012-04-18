package security;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Secure {
    
    private ArrayList<String> tokens = new ArrayList<String>();//Lista de tokens para cada sesion
    private SecureRandom random = new SecureRandom();
    
    /*
     * Meto para generar un token por cada sesion 
     */
    public String generarToken(){
        String token = new BigInteger(130, random).toString(32);
        while(tokens.contains(token))
            token = new BigInteger(130, random).toString(32);
        token += " " + new Date().getTime();
        tokens.add(token);
        return token;
    }
    
    /*
     * Retorna si existe el token, el token solo dura 10 minutos para cada sesion
     */
    public boolean existeToken(String token){
        long millsecPerMinute = 60 * 1000;
        String tok[] = token.split(" ");
        long time = Long.getLong(tok[1]);
        
        long diferencia = ( (new Date().getTime()) - time ) / millsecPerMinute;
        
        if(diferencia > 10){        //Se paso el tiempo y se elimina el token
            tokens.remove(tokens.indexOf(token));
        }
        return tokens.contains(token);
    }
    
    
}
