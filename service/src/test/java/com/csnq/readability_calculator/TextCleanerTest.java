package com.csnq.readability_calculator;

import com.csnq.readability_calculator.logic.TextCleaner;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;


public class TextCleanerTest {

    @Test
    public void cleanText() {
    String textToClean = "this is a test of,removing commas";
    String punctuation = ",";
    String result = TextCleaner.removeSelectPunctuation(textToClean,punctuation);
        assertTrue(result.equals("this is a test of removing commas"));
    }
}
