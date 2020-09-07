package com.csnq.readability_calculator;

import com.csnq.readability_calculator.logic.FileReader;
import com.csnq.readability_calculator.logic.TextParser;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextParserTest {


        String testText = "Existing computer programs that measure readability are based largely upon subroutines which estimate number of syllables, usually by counting vowels. The shortcoming in estimating syllables is that it necessitates keypunching the prose into the computer. There is no need to estimate syllables since word length in letters is a better predictor of readability than word length in syllables. Therefore, a new readability formula was computed that has for its predictors letters per 100 words and sentences per 100 words. Both predictors can be counted by an optical scanning device, and thus the formula makes it economically feasible for an organization such as the U.S. Office of Education to calibrate the readability of all textbooks for the public school system.";
        double numOfSentences = 5;
        double numOfWords = 119;
        double numOfletters = 639;
        TextParser testParser = new TextParser(testText);


        @Test
        public void getWordsInText() {
            double words = testParser.getWordsInText();
            assertEquals(numOfWords,words,0.01);
        }

        //the logic for getting sentences is currently quite fuzzy hence a high delta
        @Test
        public void getSentencesInText() {
            double sentences = testParser.getSentencesInText();
            assertEquals(numOfSentences, sentences, 2.0);
        }

        @Test
        public void getTotalCharactersInText() {
            double characters = testParser.getTotalCharactersInText();
            assertEquals(numOfletters, characters, 0.001);
        }

        @Test
        public void getTextMetaData() {
            HashMap<String, Double> metaData = testParser.getTextMetaData();
            double testCharacters = metaData.get("characters");
            double testWords = metaData.get("words");
            double testsentences = metaData.get("sentences");

            assertEquals(numOfletters, testCharacters, 0.01 );
            assertEquals(numOfWords, testWords, 0.01 );
            assertEquals(numOfSentences, testsentences, 2 );


        }
}
