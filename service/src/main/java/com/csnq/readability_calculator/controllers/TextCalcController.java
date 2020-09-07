package com.csnq.readability_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextCalcController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/parse")
    public @ResponseBody String level(){
        return "this is where text will be parsed";

    }
}