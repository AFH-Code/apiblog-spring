package com.afhunt.apiblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebappController {
    @GetMapping("/")
    public String landingPage(){
        return "index"; // retorune la page index de Angular
    }

}
