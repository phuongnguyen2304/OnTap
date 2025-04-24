package com.example.ontap.Bai8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String showProductList(Model model){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Áo len", 250000));
        productList.add(new Product(2, "Giày cao gót", 278000));
        productList.add(new Product(3, "Áo phông", 149000));
        productList.add(new Product(4, "Quần bò nữ", 375000));
        productList.add(new Product(5, "Quần bò nam", 789000));
        model.addAttribute("products",productList);
        return "products";
    }
}
