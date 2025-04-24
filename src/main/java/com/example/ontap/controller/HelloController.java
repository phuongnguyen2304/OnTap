package com.example.ontap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String showHello(Model model) {
        model.addAttribute("mess", "Hello Spring MVC");
        return "hello";
    }



}
