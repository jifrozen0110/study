package org.example;

import java.util.List;
import org.example.calculator.Addition;
import org.example.calculator.ArithmeticCalculator;
import org.example.calculator.Division;
import org.example.calculator.Multiplication;
import org.example.calculator.PositiveValue;
import org.example.calculator.Subtraction;

public class Calculator {

    private static final List<ArithmeticCalculator> arithmeticCalculators=List.of(new Addition(), new Division(), new Multiplication(),
            new Subtraction());
    public static int calculate(PositiveValue a, PositiveValue b, String operator){
        return arithmeticCalculators.stream()
                .filter(arithmeticCalculator -> arithmeticCalculator.support(operator))
                .map(arithmeticCalculator -> arithmeticCalculator.calculate(a.toInt(),b.toInt()))
                .findFirst()
                .orElseThrow();
    }
}
