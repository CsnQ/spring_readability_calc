package com.csnq.readability_calculator.logic;

import java.io.IOException;
import java.util.HashMap;

public class TextProcesser {

    public static String processText (String fileName) throws IOException {
        String text = FileReader.readTextFile(fileName);
        TextParser parser = new TextParser(text);
        HashMap<String, Double> textMetaData = parser.getTextMetaData();
        String result = String.format("Words: %s, Characters: %s, Sentences: %s", textMetaData.get("words"), textMetaData.get("characters"), textMetaData.get("sentences"));
        return result;
    }

    public static String getTextLevel (String fileName) throws IOException{
        String text = FileReader.readTextFile(fileName);
        TextParser parser = new TextParser(text);
        HashMap<String, Double> textMetaData = parser.getTextMetaData();
        ReadabilityCalc calc = new ReadabilityCalc();
        Double level = calc.calculateReadability(textMetaData.get("characters"), textMetaData.get("words"), textMetaData.get("sentences"));
        return (calc.getGradeLevel(level));
    }

}
