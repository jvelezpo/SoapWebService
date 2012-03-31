package co.edu.eafit.client;

import co.edu.eafit.Sumar;
import co.edu.eafit.*;

public class Consumer {
    public static void main(String args[]){
        CalculatorService c = new CalculatorService();
        Calculator calc = c.getCalculatorPort();
        
        System.out.println(calc.sumar(543, 57));
    }
}
