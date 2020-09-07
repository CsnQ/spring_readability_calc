package com.csnq.readability_calculator;
import com.csnq.readability_calculator.logic.FileReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReaderTest {

    @Test
    public void readFile () throws IOException {
        FileReader fd = new FileReader();
        String text = fd.readTextFile("src/test/resources/testText.txt");
        assertTrue(text.contains("This is a file containing text so we can see that our app will read and process this information correctly."));
        assertTrue(text.contains("This is a new line."));
        assertTrue(text.contains("This is the end of the file."));

    }

    @Test
    public void readTestArticle () throws IOException{
        FileReader fd = new FileReader();
        String text = fd.readTextFile("src/test/resources/testArticle.txt");
        assertTrue(text.contains("Galton came close to an equaliser against the run of play when her header hit the bar late in the first half."));

    }
}
