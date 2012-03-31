package co.edu.eafit;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
    
    @WebMethod
    public int sumar(int a, int b){
        return a + b;
    }
    
    @WebMethod
    public int restar(int a, int b){
        return a - b;
    }
    
    @WebMethod
    public String nombre(){
        return "Hola desde el web service";
    }
    
    @WebMethod
    public String[] codigos(){
        String [] codes = {"uno", "dos", "tres", "cato"};
        return codes;
    }
}
