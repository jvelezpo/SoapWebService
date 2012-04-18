package rsj;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "login")
public class login {

    
    /*
     * 
     */
    @WebMethod
    public String[] ingresar(String cedula, String pass){
        String retorne[] = new String[3];
        if(cedula.equals("123456") && pass.equals("123456")){
            retorne[0] = "true";
            retorne[1] = "Ingreso exitoso!";
            retorne[2] = "Token";
        }else{
            retorne[0] = "false";
            retorne[1] = "usuario o contraseña erronea ";
        }
        return retorne;
    }
}
