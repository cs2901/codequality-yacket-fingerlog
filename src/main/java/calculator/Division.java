package calculator;

public class Division extends Operation{
    public Division(float firstNumber, float secondnumber){
        firstOperand = firstNumber;
        secondOperand = secondnumber;
    }

    public float operar(){
        if(secondOperand == 0){
            if(firstOperand == 0)
                return Float.NaN;
            else if(firstOperand >0)
                return Float.POSITIVE_INFINITY;
            else
                return Float.NEGATIVE_INFINITY;
         }
         return firstOperand / secondOperand;
    }
}
