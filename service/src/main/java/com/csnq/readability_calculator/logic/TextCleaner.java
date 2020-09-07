package com.csnq.readability_calculator.logic;

public class TextCleaner {

    public static String removeSelectPunctuation (String text, String punctuation){
        return text.replace(punctuation, " ");
    }

    public static String removeCarriageReturns (String text){
       String result =  text.replaceAll("\\n", "");
       result = result.replaceAll("\\r", "");

        return result;
    }
}
