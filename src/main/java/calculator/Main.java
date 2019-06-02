package calculator;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
    
        float firstNumber = 0;
        float secondNumber = 0;
        char operator;  

        // Scanning operands into variables

        firstNumber = sc.nextFloat();
        operator = sc.next().charAt(0);
        secondNumber = sc.nextFloat();
        if (operator == '/' && secondNumber == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");  
        }
        else {
            Calculator calc = new Calculator(firstNumber, secondNumber);
            if(operator == '+' ) {
                calc.usarSuma();
                String result = Float.toString(calc.adition.operar());
                LOGGER.log(Level.INFO, result);
            }
            if(operator == '-') {
                calc.usarResta();
                String result = Float.toString(calc.substraction.operar());
                LOGGER.log(Level.INFO, result);
            }

            if(operator == '*') {
                calc.usarMult();
                String result = Float.toString(calc.multiplication.operar());
                LOGGER.log(Level.INFO, result);
           }

            if (operator == '/') {
                calc.userDiv();
                String result = Float.toString(calc.division.operar());
                LOGGER.log(Level.INFO, result);
            }
        }
    }
}
