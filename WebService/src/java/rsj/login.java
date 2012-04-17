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
    public String ingresar(String cedula, String pass){
        String retorne = "";
        if(cedula.equals("123456") && pass.equals("123456")){
            retorne = "Si mono ya ingreso!";
        }else{
            retorne = "nada mono ud es un ladron mas bn pierdase";
        }
        return retorne;
    }
}
