package com.example.demo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Builder.Default;
import lombok.Builder.Default;

@Data
@Builder
public class Student {
    @NotBlank(message = "email khong duoc de trong")
    @Email(message = "email khong hop le")
    private String email;
    @NotBlank(message = "ho ten khong duoc de trong")
    private String fullName;
    @Default
    private Boolean gender = true; //
    @Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate = new Date();
    @NotBlank(message = "anh khong duoc de trong")
    private String photo;
    @NotNull(message = "diem trung binh khong duoc de trong")
    @Min(value = 0, message = "diem trung binh phai lon hon hoac bang 0")
    @Max(value = 10, message = "diem trung binh phai nho hon hoac bang 10")
    private Double mark;
}
