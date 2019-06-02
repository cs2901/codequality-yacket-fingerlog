package calculator;

public class Substraction extends Operation {
    public Substraction(float firstNumber, float secondNumber) {
        firstOperand = firstNumber;
        secondOperand = secondNumber;
    }
    public float operar() {
        return firstOperand - secondOperand;
    }
}
