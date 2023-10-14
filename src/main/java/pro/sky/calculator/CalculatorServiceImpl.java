package pro.sky.calculator;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private String zero;

    public String divideByZero(String zero) {
        return "Мы не делим на ноль!";
    }

    public Serializable calculatingPlus(int num1, int num2) {
        return num1 + num2;
    }

    public Serializable calculatingMinus(int num1, int num2) {

        return num1 - num2;
    }

    public Serializable calculatingMultiply(int num1, int num2) {

        return num1 * num2;
    }

    public Serializable calculatingDivide(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 / num2;
        } else {
            return divideByZero(zero);
        }
    }
}

