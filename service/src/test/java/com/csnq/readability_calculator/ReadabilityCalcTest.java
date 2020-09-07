package com.csnq.readability_calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.csnq.readability_calculator.logic.ReadabilityCalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadabilityCalcTest {

    @Test
    public void calculateReadability() {
        ReadabilityCalc calculator = new ReadabilityCalc();
        double expected = 14.5304;
        double result = calculator.calculateReadability(639,119,5);
        assertEquals(expected,result,0.1);

    }

    @Test
    public void testRounding(){
        ReadabilityCalc calculator = new ReadabilityCalc();
        assertEquals(14, calculator.roundResult(14.43214));
        assertEquals(15, calculator.roundResult(14.5214));
        assertEquals(5, calculator.roundResult(5.123));
    }

    @Test
    public void testGetGradeLevel(){
        ReadabilityCalc calc = new ReadabilityCalc();
        String result1 = calc.getGradeLevel(1);
        String result2 = calc.getGradeLevel(5);
        String result3 = calc.getGradeLevel(6);
        String result4 = calc.getGradeLevel(7);
        String result5 = calc.getGradeLevel(8);
        String result6 = calc.getGradeLevel(9);
        String result7 = calc.getGradeLevel(10);
        String result8 = calc.getGradeLevel(11);
        String result9 = calc.getGradeLevel(13);
        String result10 = calc.getGradeLevel(16);
        String result11 = calc.getGradeLevel(17);
        String result12 = calc.getGradeLevel(18);

        assertTrue(result1.contains("very easy to read"));
        assertTrue(result2.contains("very easy to read"));
        assertTrue(result3.contains("6th grade"));
        assertTrue(result4.contains("7th grade"));
        assertTrue(result5.contains("8th, 9th and 10th grade"));
        assertTrue(result6.contains("8th, 9th and 10th grade"));
        assertTrue(result7.contains("8th, 9th and 10th grade"));
        assertTrue(result8.contains("11th and 12th grade"));
        assertTrue(result9.contains("College level"));
        assertTrue(result10.contains("College level"));
        assertTrue(result11.contains("Professional"));
        assertTrue(result12.contains("Professional"));


    }
}
