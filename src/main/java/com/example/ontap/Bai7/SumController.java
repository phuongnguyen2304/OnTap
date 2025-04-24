package com.example.ontap.Bai7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    @GetMapping("/sum")
    public String calculateSum(@RequestParam("a")int a, @RequestParam("b")int b, Model model){
        int result = a + b;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("sum",result);
        return "sum";
    }
}
