package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.example.calculator.PositiveValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

    @DisplayName("사칙연산에 따라 계산합니다.")
    @ParameterizedTest
    @MethodSource("operandAndOperatorAndResult")
    void name(int operand1,int operand2,String operator,int result) {
        Calculator calculator=new Calculator();
        assertEquals(result,calculator.calculate(new PositiveValue(operand1),new PositiveValue(operand2),operator));
    }

    private static Stream<Arguments> operandAndOperatorAndResult(){
        return Stream.of(
                arguments(1,2,"+",3),
                arguments(1,2,"-",-1),
                arguments(1,2,"*",2),
                arguments(4,2,"/",2)
        );
    }
}
