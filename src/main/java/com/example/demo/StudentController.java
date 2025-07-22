package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"var1"})
@Controller
public class StudentController {
    @RequestMapping("/poly/student")
    public String student(Model model) {
        Student student = Student.builder()
                .name("nguyen van a")
                .gender("nam")
                .averageScore(8.5)
                .age(20)
                .image("https://example.com/image.jpg")
                .build();
        model.addAttribute("student", student);
        model.addAttribute("var1", "Session Variable 1");
        return "demo/student.html";
    }

}
