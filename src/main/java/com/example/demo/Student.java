package com.example.demo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Builder;
import lombok.Data;
import lombok.Builder.Default;

@Data
@Builder
public class Student {
    private String email;
    private String fullName;
    private Boolean gender;
    private Double averageScore;
    
    private String image;
    @Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth = new Date();
}
