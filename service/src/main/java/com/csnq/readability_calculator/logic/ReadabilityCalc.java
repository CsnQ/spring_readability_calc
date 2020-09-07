package com.csnq.readability_calculator.logic;

public class ReadabilityCalc {

    final double const1 = 0.0588;
    final double const2 = 0.296;
    final double const3 = 15.8;

    public double calculateReadability(double characters, double words, double sentences) {
        double averageLetters = (characters/words)*100;
        double averageSentences = (sentences/words)*100;
        double result = ((const1*averageLetters)-(const2*averageSentences))-const3;
        System.out.println(result);
      return result;
    }
}
