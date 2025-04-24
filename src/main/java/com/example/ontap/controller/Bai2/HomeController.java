package com.example.ontap.controller.Bai2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/home","/index","/trangchu"})
    public String showHome(Model model){
        model.addAttribute("text","Xin chào đây là mapping nhiều đường dẫn");
        return "home";
    }
}
