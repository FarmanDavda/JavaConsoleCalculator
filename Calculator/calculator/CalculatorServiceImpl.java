package calculator;

import java.lang.reflect.Array;
import java.util.List;

public class CalculatorServiceImpl implements CalculateService{
    @Override
    public double addition(double...arr) {
        double sum=0;
        for(double num : arr){
              sum+=num;
        }
        return sum;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1  * num2;
    }

    @Override
    public double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Divide by zero!");
            return 0;
        }
        return (double) num1 / num2;
    }


}
