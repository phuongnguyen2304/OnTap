package com.example.ontap.Bai10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientInfoController {

    @GetMapping("/client-form")
    public ModelAndView showForm() {
        ModelAndView mav = new ModelAndView("client-form");
        mav.addObject("clientInfo", new ClientInfo());
        return mav;
    }

    @PostMapping("/submit-client")
    public ModelAndView submitForm(@ModelAttribute("clientInfo") ClientInfo clientInfo) {
        ModelAndView mav = new ModelAndView("client-result");
        mav.addObject("clientInfo", clientInfo);
        return mav;
    }
}
