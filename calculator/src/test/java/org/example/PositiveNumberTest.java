package org.example;



import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.example.calculator.PositiveValue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositiveNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {-1,0})
    void positiveNumberTest(int value) {
        assertThatCode(() -> new PositiveValue(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 미만의 숫자는 양수가 아닙니다.");
    }
}
