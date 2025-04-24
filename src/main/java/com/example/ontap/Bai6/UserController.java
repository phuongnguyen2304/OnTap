package com.example.ontap.Bai6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id")int userId, Model model){
        model.addAttribute("userId",userId);
        return "user";
    }
}
