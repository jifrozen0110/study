package org.example.calculator;

public class Multiplication implements ArithmeticCalculator{
    @Override
    public boolean support(String operator) {
        return "*".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1*operand2;
    }
}
