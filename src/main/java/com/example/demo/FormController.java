package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model, @ModelAttribute("student") Student student) {
        model.addAttribute("message", "Please fill out the form");
        model.addAttribute("title", "Student Form");
        return "demo/formStudent";
    }
    @PostMapping("/save")
    public String saveStudent(Model model, @ModelAttribute("student") Student student, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("message", "Please check your input. Date format should be yyyy-mm-dd (e.g., 2000-07-30)");
            model.addAttribute("title", "Student Form - Error");
            return "demo/formStudent";
        }
        
        // Handle the form submission
        model.addAttribute("message", "Student saved successfully!");
        model.addAttribute("title", "Student Information");
        return "demo/student";
    }
}
