package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/poly")
public class HelloController {
    @GetMapping({"/hello"})
    public String sayHello(Model model){
        model.addAttribute( "Hello 123456");
        model.addAttribute("title", "SOF3022");
        //model.addAttribute("subject", "chuyen tiep du lieu tu trang khac");
        return "demo/hello.html";
        
    }
    @GetMapping({"/hello2"})
    public String sayHello1(Model model){
        model.addAttribute("subject", "Hello 2");
        return "redirect:/poly/hello";
    }
    @GetMapping({"/hello3"})
    @ResponseBody
    public String sayHello2(){
        return "demo/hello.html";
        
    }
    
    @PostMapping({"/login"})
    public String Login(Account account, 
                        Model model) {
        System.out.println("Login name: " + account.getName());
        System.out.println("Login password: " + account.getPassword());
        return null;
    }

    // Show login form
    

}
