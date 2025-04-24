package com.example.ontap.Bai9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/customer-form")
    public String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
    @PostMapping("/submit-customer")
    public String submitForm(@ModelAttribute("customer")Customer customer,Model model){
        model.addAttribute("customer",customer);
        return "customer-result";
    }
}
