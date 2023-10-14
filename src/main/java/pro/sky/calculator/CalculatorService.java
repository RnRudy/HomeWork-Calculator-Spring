package pro.sky.calculator;

import java.io.Serializable;

public interface CalculatorService {

    int calculatingPlus(int num1, int num2);
    int calculatingMinus (int num1, int num2);
    int calculatingMultiply (int num1, int num2);
    Serializable calculatingDivide (int num1, int num2);
    String divideByZero (String zero);
}
