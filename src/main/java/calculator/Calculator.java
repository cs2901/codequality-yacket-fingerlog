package calculator;

public class Calculator {
    float firstOperand;
    float secondOperand;
    Substraction substraction;
    Adition adition;
    Multiplication multiplication;
    Division division;

    Calculator(float firstNumber, float secondNumber) {
        firstOperand = firstNumber;
        secondOperand = secondNumber;
    }

    void usarSuma(){
        adition = new Adition(firstOperand, secondOperand);
    }
    void usarResta(){
        substraction = new Substraction(firstOperand, secondOperand);
    }
    void usarMult() {
        multiplication = new Multiplication(firstOperand, secondOperand);
    }
    void userDiv() { 
        division = new Division(firstOperand, secondOperand); 
    }

}
