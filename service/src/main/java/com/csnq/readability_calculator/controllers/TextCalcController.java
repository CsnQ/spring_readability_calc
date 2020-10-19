package com.csnq.readability_calculator.controllers;

import com.csnq.readability_calculator.dataTypes.SampleText;
import com.csnq.readability_calculator.logic.TextProcesser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class TextCalcController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/parse/metadata")
    public @ResponseBody String showMetaData() throws IOException {
        return TextProcesser.processText("src/test/resources/testArticle.txt");
    }

    @RequestMapping("/parse/level")
    public @ResponseBody String showLevelOfText() throws IOException {
        return TextProcesser.getTextLevel("src/test/resources/testArticle.txt");
    }

    @RequestMapping(value = "/parse/leveljson", method = RequestMethod.POST)
    public @ResponseBody String textLevel (@RequestBody String text) throws IOException {
        return TextProcesser.getTextLevelFromJSON(text);
    }
}