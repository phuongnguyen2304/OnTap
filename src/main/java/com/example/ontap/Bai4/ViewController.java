package com.example.ontap.Bai4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/view")
    public String helloPage(Model model){
        String message = "Truyền giá trị từ view đến Controller bằng Model";
        model.addAttribute("viewController",message);
        return "view";
    }
}
