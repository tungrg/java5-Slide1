package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/student")
public class FormStudentController {
    @GetMapping("/form")
    public String getForm(Model model, @ModelAttribute Student student){
        model.addAttribute("title", "Student Form");
        return "demo/formStudent";
    }
    @PostMapping("/save")
    public String saveStudent(Model model,
     @ModelAttribute @Valid Student student, Errors errors) {
        if(errors.hasErrors()) {
            model.addAttribute("message",
             "Vui long kiem tra lai thong tin");
            model.addAttribute("title", "Student Form - Error");
            return "demo/formStudent";
        }
        model.addAttribute("student", student);
        model.addAttribute("message", "Student saved successfully!");
        return "forward:/poly/student";
    }

}
