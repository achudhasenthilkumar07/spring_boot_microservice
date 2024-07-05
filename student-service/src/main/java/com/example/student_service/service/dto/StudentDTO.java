package com.example.student_service.service.dto;

import com.example.student_service.service.dto.SchoolDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String id;
    private String name;
    private int age;
    private String gender;
    private SchoolDTO school;
}