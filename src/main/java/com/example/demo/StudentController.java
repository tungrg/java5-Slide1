package com.example.demo;

import java.util.Date;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"var1"})
@Controller
public class StudentController {
    @RequestMapping("/poly/student")
    public String student(Model model) {
        model.addAttribute("var1", "Session Variable 1");
        return "demo/student.html";
    }

}
