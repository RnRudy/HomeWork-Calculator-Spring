package pro.sky.calculator;

import java.io.Serializable;

public interface CalculatorService {

    Serializable calculatingPlus(int num1, int num2);
    Serializable calculatingMinus (int num1, int num2);
    Serializable calculatingMultiply (int num1, int num2);
    Serializable calculatingDivide (int num1, int num2);
    String divideByZero (String zero);
}
