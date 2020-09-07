package com.csnq.readability_calculator.logic;

public class TextCleaner {

    public static String removeSelectPunctuation (String text, String punctuation){
        return text.replace(punctuation, " ");
    }
}
