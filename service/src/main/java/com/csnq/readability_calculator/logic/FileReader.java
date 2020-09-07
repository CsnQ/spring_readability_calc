package com.csnq.readability_calculator.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {

    public static String readTextFile (String fileName) throws IOException {
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        }

    }

}
