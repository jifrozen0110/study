package org.example.calculator;

public class PositiveValue {
    private static final String WRONG_POSITIVE_NUMBER_EXCEPTION_MESSAGE = "0 미만의 숫자는 양수가 아닙니다.";
    private int value;

    public PositiveValue(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value){
        if(isNegativeNumber(value)){
            throw new IllegalArgumentException(WRONG_POSITIVE_NUMBER_EXCEPTION_MESSAGE);
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <= 0;
    }

    public int toInt(){
        return value;
    }
}
