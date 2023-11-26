package org.example.calculator;

public interface ArithmeticCalculator {
    boolean support(String operator);

    int calculate(int operand1, int operand2);

}
