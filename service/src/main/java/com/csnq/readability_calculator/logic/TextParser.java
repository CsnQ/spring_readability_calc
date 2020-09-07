package com.csnq.readability_calculator.logic;

import java.util.Arrays;
import java.util.HashMap;

public class TextParser {
    String textToParse;

    public TextParser(String text) {
        textToParse = text;
    }

    public void printText(){
        System.out.println(this.textToParse);
    }

    //here the regex looks for one or multiple spaces to then count the words by placing them in an array.
    public double getWordsInText(){
        String[] words = this.textToParse.split("\\s+");
        return words.length;
    }

    public double getSentencesInText(){
        String cleanedText = TextCleaner.removeCarriageReturns(this.textToParse);

        String sentences[] = this.textToParse.split("\\.");
        System.out.println(Arrays.toString(sentences));
        double result = sentences.length;
        return result;
    }

    public double getTotalCharactersInText(){
        String text = this.textToParse;
        int count = 0;
        for (int i=0; i<text.length(); i++){
            if(Character.isLetter(text.charAt(i))||Character.isDigit(text.charAt(i))){
                count ++;
            }
        }
        return count;
    }

    public HashMap<String, Double> getTextMetaData () {
        HashMap<String, Double> textMetaData = new HashMap<String, Double>();
        textMetaData.put("characters", getTotalCharactersInText());
        textMetaData.put("words", getWordsInText());
        textMetaData.put("sentences", getSentencesInText());

        return textMetaData;
    }
}
