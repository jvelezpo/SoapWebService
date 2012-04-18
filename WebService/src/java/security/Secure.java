package security;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.util.ArrayList;

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
        tokens.add(token);
        return token;
    }
}
