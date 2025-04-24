package com.example.ontap.Bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greet")
    public String greetUser(@RequestParam(name = "name",required = false,defaultValue = "Hello")String name, Model model){
        String message = "Xin chào" + name + "!";
        model.addAttribute("greeting",message);
        return "greet";
    }
}
