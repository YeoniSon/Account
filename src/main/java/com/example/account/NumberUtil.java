package com.example.account;

import lombok.experimental.UtilityClass;

@UtilityClass //번거로운 코드들을 자동으로 생성해줌
public class NumberUtil {

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public static Integer minus(Integer a, Integer b) {
        return a - b;
    }


}
