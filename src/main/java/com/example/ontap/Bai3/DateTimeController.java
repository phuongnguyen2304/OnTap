package com.example.ontap.Bai3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateTimeController {
    @GetMapping("/time")
    public String getCurrentDateTime(Model model){
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        model.addAttribute("currentTime",formattedDateTime);
        return "time";
    }

}
