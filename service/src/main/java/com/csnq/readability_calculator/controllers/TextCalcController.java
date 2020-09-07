package com.csnq.readability_calculator.controllers;

import com.csnq.readability_calculator.logic.TextProcesser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}