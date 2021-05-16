package com.Hafsa.Ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }


    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }


    @GetMapping("/products")
    public String products()
    {
        return "products";
    }


    @GetMapping("/single-product")
    public String singleproduct()
    {
        return "single-product";
    }
}
