package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/poly/hello")
    public String sayHello(Model model){
        model.addAttribute("subject", "Spring Boot MVC");
        model.addAttribute("title", "SOF3022");
        return "demo/hello.html";
        
    }
}
