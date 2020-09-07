package com.csnq.readability_calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.csnq.readability_calculator.logic.ReadabilityCalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadabilityCalcTest {

    @Test
    public void calculateReadability() {
        ReadabilityCalc calculator = new ReadabilityCalc();
        double expected = 14.5304;
        double result = calculator.calculateReadability(639,119,5);
        assertEquals(expected,result,0.1);

    }
}
