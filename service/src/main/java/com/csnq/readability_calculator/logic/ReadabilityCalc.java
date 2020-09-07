package com.csnq.readability_calculator.logic;

public class ReadabilityCalc {

    final double const1 = 0.0588;
    final double const2 = 0.296;
    final double const3 = 15.8;

    public double calculateReadability(double characters, double words, double sentences) {
        double averageLetters = (characters/words)*100;
        double averageSentences = (sentences/words)*100;
        double result = ((const1*averageLetters)-(const2*averageSentences))-const3;
      return result;
    }

    public String getGradeLevel (double result){
        String gradeLevel = "";
        String comprehension = "";
        long value = roundResult(result);
        if(value<=5){
            gradeLevel = "5th grade and below";
            comprehension = "very easy to read";
        }else if(value==6){
            gradeLevel="6th grade";
            comprehension="easy to read";
        }else if (value==7){
            gradeLevel="7th grade";
            comprehension = "fairly easy to read";
        }else if(value>7&&value<=10){
            gradeLevel = "8th, 9th and 10th grade";
            comprehension = "normal difficulty (conversational English)";
        }
        else if(value>=11&&value<=12){
            gradeLevel ="11th and 12th grade";
            comprehension = "fairly difficult to read";
        }else if(value>=13 && value<=16){
            gradeLevel="College level";
            comprehension = "difficult to read";
        }else if(value>16){
            gradeLevel ="Professional";
            comprehension ="extremely difficult to read";
        }

        String message = String.format("level is %d which is equivelent to education level %s and therefore for most people this text is %s", value, gradeLevel,comprehension);
        return message;
    }

    public Long roundResult(double calcResult){
        long roundedResult = Math.round(calcResult);
        return roundedResult;
    }


}
