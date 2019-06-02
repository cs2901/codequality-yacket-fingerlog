package calculator;


public class Multiplication extends Operation {
    public Multiplication(float firstNumber, float secondNumber) {
        firstOperand = firstNumber;
        secondOperand = secondNumber;
    }

    public float operar() {
        return firstOperand*secondOperand;
    }
}
