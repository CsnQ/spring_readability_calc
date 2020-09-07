package com.csnq.readability_calculator;


import com.csnq.readability_calculator.logic.FileReader;
import com.csnq.readability_calculator.logic.TextCleaner;
import com.csnq.readability_calculator.logic.TextParser;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadabilityLogicTest {


    public String testSetup() throws IOException {
        String textArticle = FileReader.readTextFile("src/test/resources/testArticle.txt");

        return  textArticle;
    }


    @Test
    public void testSentenceCount() throws IOException {

        TextParser parser = new TextParser(testSetup());
        int expectedNumOfSentences = 16;

        assertEquals(expectedNumOfSentences, parser.getSentencesInText());
    }
    @Test
    public void testParser() throws IOException {
        TextParser parser = new TextParser(testSetup());
        int expectedNumOfWords = 379;
        int expectedNumOfSentences = 16;
        int expectedNumOfCharacters=1798;
        HashMap<String, Double> result = parser.getTextMetaData();
        assertEquals(expectedNumOfCharacters, result.get("characters"));
        assertEquals(expectedNumOfWords, result.get("words"));
        assertEquals(expectedNumOfSentences, result.get("sentences"));
        System.out.println(result);

    }
}
